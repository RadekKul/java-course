package pl.com.rkulikowski.java14.collection.list;

import pl.com.rkulikowski.java14.Plants.*;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {

    public static void main(String[] args) {
        // String[]  - z tym mamy utozszamiac zapis List<String> - przechowuje zmienne tylko typu String
        List<String> strings = new ArrayList<>();       // List jest interfejsem (z ctrl na niego najechac mozna) a ArrayList to juz jest typ

        strings.add("enum");            // dodawanie elementow do listy, od indexu 0, 1,2 itd
        strings.add("abstract");

        strings.size(); // podobnie jak w tablicach length, czyli ile elementow mamy w liscie

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));     // get(index) - wskazuje co jest pod wpisanym indexem - wypisanie.
        }

        for (String s : strings) {        // skoro kazdym element listy to String, wiec mozemy zrobic ulepszona petle for, dla kazdego elementu typu String z listy strings, nadaj nazwe s i zrob to co w ciele petli
            System.out.println(s);
        }

        System.out.println();

        // tutaj przyklad listy znowu na roslinkach,w jaki sposob to robimy, nie musimy oddzielnie tworzyc nowych obiektow bo mamy do nich referencje przez uzycie np plants[0]

        List<Plant> plants = new ArrayList<>();

        plants.add(new Cactus(1, 50, 50));
        plants.add(new Cactus(2, 60, 60));
        plants.add(new Rose(5, 100, 100));
        plants.add(new Rose(8, 150, 150));
        plants.add(new PricklyPear(2, 80, 80));
        plants.add(new PricklyPear(3, 120, 120));

        //mozemy tez zmieniac poprzez set i wskazujac index

        plants.set(1, new Cactus(1,40,40)); // i to zostaje zamienione w liscie

        //mozemy tez usuwac dany element poprzez .remove

        BetterGardener gardener = new BetterGardener();

        for(DayOfWeek weekDay: DayOfWeek.values()){
            System.out.println("Day of the week: " + weekDay);
            for (Plant plant : plants) {       // dla kazdego elementu (kazdej roslny ) z listy plants (niewazne czy kaktus czy roza) wykonujemy dane czynnosci
                gardener.waterPlant(plant);
                gardener.makePlantGrow(plant);
            }
        }

        for (Plant plant : plants){        // dla kazdego elementu (kazdej rosliny) z listy plants wyswietlamy jej toString
            System.out.println(plant);
        }

    }
}
