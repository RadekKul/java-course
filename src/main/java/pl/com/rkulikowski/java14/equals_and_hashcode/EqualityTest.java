package pl.com.rkulikowski.java14.equals_and_hashcode;

import javax.net.ssl.SSLContext;
import java.util.*;

public class EqualityTest {

    public static void main(String[] args) {
        //ArrayList for Person
        //add 4 persons
        // 2 duplicates

        ArrayList<Person> personsList = new ArrayList<>();

        personsList.add(new Person("Radek", "K.",24));
        personsList.add(new Person("Michał", "M.",23));
        personsList.add(new Person("Wojciech", "N.",24));
        personsList.add(new Person("Radek", "K.",24));

        //create new duplicate which existts in array

        Person personToFind = new Person("Radek","K.",24);

        System.out.println("Contains: " + personsList.contains(personToFind));      // sprawdzamy czy lista zawiera obiekt osoby dodanej na sztywno tj.person1, zwroci true bo nadpisalismy equals, gdybysmy
        // nie nadpisali equals w klasie Person zwrociloby false, bo wtedy wskazania referencji bylyby na dwa rozne obiekty mimo ze bylyby one identyczne.
        // bo jak pojedziemy z Ctrl po kolejnych metodach containst -> indexOf -> to nagle trafimy na equals, ktore jest nadpisane przez nas w klasie Person.

        System.out.println(personsList.indexOf(personToFind)); // Wyswietli pozycje Pierwszego takiego samego obiektu jak porownywany, aby wyswietlic pozycje kolejnego takiego samego trzeba uzyc
        // specjalnej metody ktora sprawdzi nam od ktoregos elementu (wtedy podajemy element jeden dalej niz pierwszy itd itd.)

        System.out.println();

        // Teraz probujemy z Set

        Set<Person> personSet = new HashSet<>(); // tworzymy nowy Set

        personSet.addAll(personsList);  // dodajemy do Set, stworzona wczesniej kolekcje (liste), pojedynczo bysmy robili to personSet.add(Person itd)

        System.out.println(personSet.size());       // sprawdzamy rozmiar i daje nam 3 bo sa 2 takie same obiekty w niej, jezeli natomiast zakomentujemy metode hashCode, to pokaze 4, bo set dziala na hashCodach

        Person personDuplicate = new Person("Radek","K.",24);

        System.out.println(personSet.contains(personDuplicate)); // jezeli hashCode jest niezakomentowany, to znajdzie ten duplicat i do tego pokaze rozmiar bez powtarzania tj 3.
        // Jezeli zakomentujemy hashCode to nie znajdzie personDuplicate w Set i do tego pokaze 4 elementy.
        // WNIOSEK ZE HASHCODE JEST POTRZEBNY W SET!!!
        // Dodatkowo koniecznie equals musi być zgodny z hashCode.
        // jezeli natomiast w metodzie hashCode zmienimy zeby zawsze zwracalo taka sama liczbe, bez mnozenia przez liczbe pierwsza to tez bedzie dzialac, bo kazdy obiekt bedzie mial ten sam hashcode(ID),
        // ale spada wtedy performance, wiec lepiej oddzielac te ID na rozne, zeby potem equals mial latwiej to sprawdzac wszystko.


        System.out.println();

        // Wykonamy sobie iteracje kolejnych person w Set

        for (Person p : personSet) {
            System.out.println("Person: " + p);     //to bez zmiany toString dostajemy opis kazdego person, bez powtarzania takiego samego, widzimy tez hashCode, jest to najszybszy Set, bo wywoluje nam
            // obiekty w losowej kolejnosci
        }

        Set<Person> anotherSet = new LinkedHashSet<>();

        List<Person> personList = new LinkedList<>(); // jest rozwiazaniem dobry przy wstawianiu nowych elementow do listy , a arrayList jest lepsze do np odczytow, ale to jest do ogarniecia na biezaco

    }
}
