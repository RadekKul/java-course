package pl.com.rkulikowski.java14.access.inner;

import pl.com.rkulikowski.java14.access.Person;

public class Child extends Person{      // rozszerza osobe z acces.Person
    public void sayHello(){
      //  System.out.println("My secret: " + secret);   // nie mozemy uzyć zmiennej bez modyfikatora nawet jak dziedziczymy z classy w ktorej ją zrobilismy

        System.out.println("My second secret: " + secondSecret);    // dziedziczymy to z klasy Person w acces, razem z dziedziczeniem mozemy uzywac zmienne public i protected. Ale juz w innych klasach
                                                                    // z tego package nie bedziemy mogli tego uzyc, np w Mainie nie mozna ( jest przyklad)
    }

}
