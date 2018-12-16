package pl.com.rkulikowski.java14.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

// tworzymy liste ludzi za pomoca ArrayList nowej i dajemy jako argument Arrays.asList i dopisujemy ludzi. Gdybysmy dali odrazu persons = Arrays.asList - to nie moglibysmy tej listy modyfikowac
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Franek","Smuda",65,120,10_000,165,41),
                new Person("Janek","Kowal",23,110,2_000,185,43),
                new Person("Ferdek","Kiepski",51,160,5_000,175,40),
                new Person("Marek","Nowak",31,151,4_000,179,45),
                new Person("Stefan","Myler",43,143,7_000,195,48)
        ));

        Collections.sort(persons,Comparator.comparing(person -> -person.getAge())); // zwracanie jakas inna metoda za pomoca comparing, zwracamy wiek od najwiekszego (dlatego -), Sposob opisany na dole,
        System.out.println(persons);

        // implementujemy w klasie Person Comparable

        //probujemy posortowac wzgledem IQ - od najwyzszego

        Collections.sort(persons,Person::compareTo);    // porownanie calej listy na Iq

        persons.get(0).compareTo(persons.get(1));   // porownanie person0 do person1, zeby pokazac czy dobrze liczy, zwraca -9, zeby wiedzial comparable czy ma zamienic czy nie, - przed, + za

        System.out.println(persons);

        ShoeComparator shoeComparator = new ShoeComparator();

        System.out.println(shoeComparator.compare(persons.get(0),persons.get(4))); // pokazanie co zwraca , -3 wiec jest mniejszy but, wiec dla komparatora bedzie to informacja ze ma stac przed
                                                                                    // bo zalozenie bylo od najnizsego do najwyszego.
        // tak sprawdzona metode mozemy wrzucic do sortowania w Collections, mamy oddzielna metode na Comparable i Comparator

        Collections.sort(persons,new ShoeComparator().reversed()); // tutaj sortujemy liste persons stwarzajac nowy ShoeComparator, ale odwracamy kolejnosc przez .reversed() - taka metoda dla komparatorow
        System.out.println(persons); // dziala

        Collections.sort(persons, new SalaryComparator());  // po zarabkach
        System.out.println(persons);


        // w tym momencie przesylanie do sortowania, daje nam Comparator, dlatego jak najedziemy na sort z CTRL pokaze Comparator, bez zadnego importowania i bez nowych klas

        Collections.sort(persons,((o1, o2) -> (int) (o1.getHeight() - o2.getHeight())));        // tak za pomoca lambdy sie to robi, dla listy person i dwoch obiektow o1 i o2 porownaj wzrosty rosnaco
        Collections.sort(persons, ((o1, o2) -> (int) (o1.getShoeSize() - o2.getShoeSize())));

        // teraz porownywanie imion przez komparator String
        Collections.sort(persons,((first, second) -> first.getName().compareTo(second.getName()))); // to jest zwykle porownanie Stringami a ponizej jest lampa porownujaca, da sie to jeszcze zamienic na inna klase i metode comparing
        Collections.sort(persons,NameComparing::comparePersonsByName);  // ta linijka i ta wyzej to to samo, ale zauwazmy ze ta linijka jest duzo czytelniejsza, dlatego warto opisywac nazwy dobrze
                                                                        // tutaj robimy programowanie funkcyjne ktore z klasy NameComparing bierze metode comparePersonsByName i dalej sie juz domysla ze
                                                                        // trzeba to zrobic na calej kolekcji i to robi
        System.out.println(persons);

        // to samo co wyzej mozemy zrobic w taki sposob, bo lista juz sama z siebie moze byc sortowana
        persons.sort(NameComparing::comparePersonsByName);
        System.out.println(persons);

        // tak tez mozna
        Collections.sort(persons,(Comparator.comparing(Person::getName)));
        System.out.println(persons);



    }
}
