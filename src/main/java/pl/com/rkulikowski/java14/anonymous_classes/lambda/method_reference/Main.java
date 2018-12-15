package pl.com.rkulikowski.java14.anonymous_classes.lambda.method_reference;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";

        // porownania opisane w metodach (classy)

        System.out.println(BrandSorter.brandOrder(a, b));   // do brand przypisujemy String a i b, i je porownujemy, ponizej to samo  z modelem robimy. jako ze sa to zmienne typu String to przyjmuja a i b
        System.out.println(BrandSorter.brandOrder(b, a));

        System.out.println(ModelSorter.modelOrder(a, b));
        System.out.println(ModelSorter.modelOrder(b, a));

        // teraz robimy to co w CarSorter i interface Sorter

        Car saab = new Car("Saab","93",200);
        Car porshe = new Car("Porshe", "carrera",250);

        // wywolujemy sortowanie po modelu
        List<Car> sortedCars = CarSorter.sortCarsByModel(saab,porshe,
                ((first, second) -> first.compareTo(second)));

        //wywolujemy sortowanie po modelu (odwrotnie dajemy samochody), zeby sprawdzic czy dziala
        List<Car> sortedCars2 = CarSorter.sortCarsByModel(saab,porshe,
                ((first, second) -> second.compareTo(first)));

       /* CarSorter.sortCarsByModel(saab,porshe,
                (model1, model2) -> ModelSorter.modelOrder(model1,model2));*/

       // to jest to samo co wyzej. Zawolaj mi metode modelOrder z ModelSorter do ktorej przekaz argumenty ktore przyjda jako model1, model2
        // a tu ponizej lambda wszystko sama sobie dopisuje, wystarczy podac do ktorej metody ma isc. To co przyjdzie na trzeciej pozycji po saab i porshe, przekaz do metody modelOrder
        CarSorter.sortCarsByModel(saab,porshe,
                ModelSorter::modelOrder);   // wez metode modelOrder z modelSortera, gdybysmy dzialali na obiiekcie to zamiast ModelSorter dalibysmy obiekt na ktorym chcielibysmy cos wywolac


        List<Car> sortedCars3 = CarSorter.sortCarsByModel(saab,porshe,
                ModelSorter::modelOrder);

        System.out.println(sortedCars3); // jak tu wyswieltic tą liste?
        System.out.println();

        // teraz cos z CarPrinter

        // void printCar (Car car)

        CarPrinter carPrinter = car -> System.out.println(car); // inteliij pokazuje ze za duzo piszemy i chce nam skrocic
        CarPrinter carPrinter1 = (Car car) -> System.out.println(car);  // to jest to samo co wyzej zeby zbrazowac

        CarPrinter carPrinter2 = System.out::println; // wiec tutaj pokazemy jak krocej zapisac
        // zrob metode println z klasy System.out. Tutaj w tym przykladzie car jest tworzony w niewidoczny sposob, bo CarPrinter to interface i ma tylko jedna metode i ona przyjmuje tylko
        // typ Car, dlatego on wie ze ma stworzyc nowy Car i przekazac go do sysouta


        // teraz testujemy nowa metode z Car - printyourself czyli przedstawi sie przez wypisanie toString'a

        CarPrinter carPrinter4 = car -> car.printYourself();
        CarPrinter carPrinter5 = Car::printYourself;    // to jest to samo co linijka wyzej.  Dla obiektu typu Car - wywolaj metode printYourself
        // mimo ze printYourself nie jest static, to java sobie mowi - zrobie printYourself na dowolnym obieckie typu Car, np tak jak nizej
        // to co my tu wyzej robimy lambdami to tylko przepis!!! wywolac trzeba oddzielnie

        carPrinter4.printCar(saab);
        carPrinter5.printCar(porshe);



    }
}
