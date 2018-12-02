package pl.com.rkulikowski.java14.generic;

import pl.com.rkulikowski.java14.animal.Animal;
import pl.com.rkulikowski.java14.animal.Cat;
import pl.com.rkulikowski.java14.animal.Dog;
import pl.com.rkulikowski.java14.animal.Monkey;

public class HomeTest {

    public static void main(String[] args) {

        Home<Dog> genericDog = new Home<>();

       genericDog.enterHome(new Dog());

       genericDog.goOutside(new Dog());




        System.out.println();

       Home<Cat> genericCat = new Home<>();

       genericCat.enterHome(new Cat());

       // genericCat.goOutside(new Cat());   // tak nie mozna bo tam zdefiniowalismy ze tylko pies moze byc
      // genericCat.giveMeAnimal(new Dog()); // nie mozemy dac bo Dog nie moze wejsc do pudelka Cat



        System.out.println();

        Home<Animal> genericAnimal = new Home<>();  // jezeli natomiast tam w home damy ze przyjmuje animal, to mozemy dodac zamist e wszystko co dziedziczy po animal i jest w pudelku Animal

        genericAnimal.giveMeAnimal(new Cat());
        genericAnimal.giveMeAnimal(new Dog());
        genericAnimal.giveMeAnimal(new Animal());
        genericAnimal.giveMeAnimal(new Monkey());

        System.out.println();

        Animal dog3 = new Dog();        // ten pies bedzie mogl uzyc tylko metody dla Animal i Object, nie bedzie mogl uzyc metod ktore sa tylko dla Dog()

        genericAnimal.enterHome(dog3);  // Mozemy tak napisac bo referencja dog3 jest typu Animal, a genericAnimal to pudelko na Animal, gdybysmy to dali dogeneric Dog to by sie nie dalo
                                        // bo genericDog to pudelko na psy

        //genericDog.enterHome(dog3); // tak sie nie da bo genericDog przyjmuje typy referencji Dog, a my dalismy Animal (mimo ze jest Dog() to nie da sie go przyjac)


    }
}
