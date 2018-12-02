package pl.com.rkulikowski.java14.generic;


import pl.com.rkulikowski.java14.animal.Animal;
import pl.com.rkulikowski.java14.animal.Cat;
import pl.com.rkulikowski.java14.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionsTests {
    // method takes list of Animals
    // send Dogs and Cats

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();    // tworzymy liste typu animal ktora bedziemy mogli wrzucic do metody doListOfAnimal

        animalList.add(new Dog());      // dodajemy kolejno obiekty typu Animal, niewazne czy pies czy kot
        animalList.add(new Dog());
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Cat());
        animalList.add(new Cat());

        doListOfAnimal(animalList); // wywolujemy metode, wyswietlajaca nam toString z konkretnych klas

        System.out.println();
        // teraz tworzymy tablice

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();

        doListOfAnimal(dogs);   // wywolujemy metode z TABLICĄ, ktora dziala mimo ze Dog dziedziczy po Animal

        System.out.println();
        // tworzymy arrayList ale z typem Dog

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());

        doListOfAnimal(dogsList);   // dla kolekcji (list) cos takiego nie dziala, mimo ze Dog dziedziczy po Animal, oczekuje listy Animal a ja przesylam liste Dog
                                // ale jak dopiszemy List<? extends Animals> animals to bedzie dzialac, ? - oznacza w tym przypadku cokolwiek co rozszerza Animal lub nim jest, (przyjmuje wszystko od Animal w dół)
        System.out.println();

        addDog(dogsList); // jezeli w addDog zmienimy na List<? super Dog> to mozemy dodac tam psy

        List<Animal> animalList2 = new ArrayList<>();
        addDog(animalList2);    // to tez nam zadziala mimo ze dodajemy Dog do listy animals, a to wszystko za sprawą "super" w metodzie, bo mowi to ze wez liste psów i wszystkiego co jest nad klasą psa
                                // czyli i lista psow i liste zwierząt mozemy dodac

    }


    public static void addDog(List<? super Dog> animals){  // "super Dog"- ta metoda jest w stanie przyjac wszystko od typów Dog w góre czyli Dog, Animal, Object, ale moze dodac tylko typy od Dog w dół (Dog, Pudel itp)
        animals.add(new Dog()); // do listy zwierzat mozemy dodac psa
    }

    public static void doListOfAnimal(List<? extends Animal> animals) {   // "extends Animal" - tworzymy metode do ktorej mamy przyjac liste typu Animal (badz wyzsza np Object), aby np wypisac sobie zwierzeta
        // bedzie ona wyswietlala pokolei toString z przekazanych obiektow do listy

        for (Animal a : animals) {      // ? extends Animal - przyjmuje wszystko od zwierzecia w doł

            System.out.println(a);
        }
       // animals.add(new Dog()); // tutaj mowi ze masz niezgodnosc typow, mimo ze Dog jest Animal.
    }

    public static void doListOfAnimal(Animal[] animals) {   // tworzymy metode do ktorej mamy przyjac TABLICE typu Animal, bedzie ona wyswietlala pokolei toString z przekazanych obiektow do listy
        for (Animal a : animals) {
            System.out.println(a);
        }
        //animals[0] = new Cat(); // leci wyjatek poniewaz przeslalismy tablice psow, a nie kotow co jest niebezpieczna operacja
    }
}
