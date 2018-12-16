package pl.com.rkulikowski.java14.stream.homework.homeworkZajecia;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // skladniki
        Ingredient nuts = new Ingredient("nut");
        Ingredient carrots = new Ingredient("carrot");
        Ingredient cocoNut = new Ingredient("coco nuts");
        Ingredient soya = new Ingredient("soya");
        Ingredient water = new Ingredient("water");
        Ingredient waterMellon = new Ingredient("water mellon");

        //napoje
        Beverage first = new Beverage("first", Arrays.asList(water,soya,waterMellon));
        Beverage second = new Beverage("second", Arrays.asList(water,cocoNut));
        Beverage third = new Beverage("third", Arrays.asList(water,soya,nuts,carrots));
        Beverage fourth = new Beverage("fourth", Arrays.asList(water,waterMellon,nuts));

        //menu

        Menu menu = new Menu();
        menu.addBeverage(first,true);
        menu.addBeverage(second,false);
        menu.addBeverage(third,true);
        menu.addBeverage(fourth,true);

        //logika + formatowanie

        // rozpoczynamy od nadpisania equals'a w Ingredientsach i nie bedziemy juz szukali na "Stringach " tak jak ty zrobiles tylko na obiektach, dzieki temu bedzie to bardziej czytelne

        System.out.println(getNutsFreeBeverages(menu));

        // to jest lepsze bo mozemy wpisac skladnik ktorego nie chcemy w wywolaniu metody i samo nam znajdzie i odrzuci!
        System.out.println(getFilteredBeverages(menu,nuts));

    }

    // zrobilismy mapami wiec streama trzeba robic po kluczu bo to bedzie nazwa napoju

    private static List<Beverage> getNutsFreeBeverages (Menu menu){

        Ingredient nuts = new Ingredient("nut");    // robimy przykladowy skladnik po ktorym bedziemy filtrowac, musimy go zrobic bo nie poprownujemy po stringach tylko po objectach

        List<Beverage> result = new ArrayList<>();

        List<Beverage> withoutNuts = menu.getBeverages()
                .keySet()
                .stream()
                .filter(beverage -> !beverage.getIngredientList().contains(nuts))
                .collect(Collectors.toList());

        // mamy napoje bez orzechow teraz musimy zrobic napoje na promocji i do tego to polaczyc, raz dzialamy na listach raz na mapach dlatego musimy uwazac

        Map<Beverage,Boolean> beveragesOverSpecialOffert = menu.getBeverages();
        beveragesOverSpecialOffert.forEach((beverage, aBoolean)  // forEach dziala na BiConsumerze, ktory bierze dwie dane klucz i wartosc
                -> {if (aBoolean && withoutNuts.contains(beverage)){    // if musimy dac w {} nawiasach bo lambda szuka wartosci logicznej a sam if nie ma wartosci, wiec musimy dac
                result.add(beverage);}
        } );

        return result;
    }


    // teraz zrobimy to w inny sposob, dostaniemy menu i skladnik ktorego ma nie byc i wysiwetlimy ta liste
    private static List<Beverage> getFilteredBeverages (Menu menu, Ingredient unwanted){


        List<Beverage> result = menu.getBeverages()
                .entrySet()
                .stream()
                // teraz w naszym strumieniu ciekna klucze i wartosci czyli nazwa napoju i to czy jest w promocji
                // wiec filtrujemy w taki sposob ze bierzemy value, zeby wiedziec czy jest w promocji czy nie, i zostawiamy wszystko co jest TRUE czyli na promocji,a getValue bedzie true jak cos jest na promocji
                .filter(beverageBooleanEntry -> beverageBooleanEntry.getValue())
                .map(beverageBooleanEntry -> beverageBooleanEntry.getKey())
                .filter(beverage -> !beverage.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());

        return result;
    }

    //teraz zrobimy te metody oddzielnie booleanami, zebysmy mogli uzyc tego w metodzie z filtrowaniem tej co wyzej, tylko ze skopiujemy i nizej napiszemy drugia

    private static Beverage changeIntoBeverge (Map.Entry<Beverage,Boolean> entry){
        return entry.getKey();
    }

    //tutaj patrzymy skladnik czy zgadza sie true czy fasle jezeli chodzi o promocje. Przyjmujemy typ mapy o Key, value -> napooj, czyWPromocji i na tej podstawie filtrujemy
    private static boolean isSpecialOffer(Map.Entry<Beverage,Boolean> entry){
        return entry.getValue();
    }

    // tutaj skladnik ktorego nie chcemy

    private static boolean withouhtUnwantedIngredient (Beverage beverage, Ingredient unwanted){
        return !beverage.getIngredientList().contains(unwanted);
    }

    // teraz zawieramy te dwie metody w ostatecznej

    private static List<Beverage> getFilteredBeverages2 (Menu menu, Ingredient unwanted){


        List<Beverage> result = menu.getBeverages()
                .entrySet()
                .stream()
                // filtrujemy uzywajac odwolania do metod z Main, metody stowrzylisym tak zeby robily to samo co na gorze sie dzialo ale bedzie bardziej czytenlnie
                .filter(Main::isSpecialOffer)
                // teraz wykonujemy odwolanie tez w mapowaniu tak zeby uzyskac to samo ale za pomoca stworzonej metody
                .map(Main::changeIntoBeverge)
                // ten filter juz ciezko jest przerobic na funkcyjna metode w sensie z Main:: bo duzo trzeba by zamian robic wiec musimy uznac ze to jest czytelne.
                .filter(beverage -> withouhtUnwantedIngredient(beverage,unwanted))
                .collect(Collectors.toList());

        return result;
    }
}
