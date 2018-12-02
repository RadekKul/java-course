package pl.com.rkulikowski.java14.collection.map;

import pl.com.rkulikowski.java14.equals_and_hashcode.Person;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindningPersonExample {
    //map ids over Person
    // add 10 persons to map
    // find only persons younger than x
    // add result to list

    public static void main(String[] args) {

        // Tworzymy mape, dodajemy 10 osob, key jest String, value is Person

        Map<String, Person> personMap = new LinkedHashMap<>();

        personMap.put( "1" , new Person("Radek","K.",24));
        personMap.put( "2" , new Person("Michał","M.",21));
        personMap.put( "3" , new Person("Wojtek","N.",19));
        personMap.put( "4" , new Person("Konrad","K.",20));
        personMap.put( "5" , new Person("Adrian","K.",36));
        personMap.put( "6" , new Person("Maciek","K.",44));
        personMap.put( "7" , new Person("Franke","K.",42));
        personMap.put( "8" , new Person("Stasio","K.",64));
        personMap.put( "9" , new Person("Heniek","K.",28));
        personMap.put( "10" , new Person("Zdzisiek","K.",31));



        ArrayList<String> personYoungerThanX = new ArrayList<>();   // tworzymy nowa liste do przechowywania osob mlodszych niz x

        for (String key : personMap.keySet()){
             int x = personMap.get(key).getAge(); // sprawdzamy pokolei poprzez keySet, kto jest mlodszy od 30 poprzez pobieranie wieku i wchodzenie do petli if
             if (x<30){
                 personYoungerThanX.add("Person: " + personMap.get(key).getName() + " is younger than 30 and his ID is: " + key );  // lista personyoungerthanx bierze String
                 // wiec add(String) w ktorym zamieszczamy dane jakie juz tam sobie chcemy
             }

        }

        for(int i=0; i < personYoungerThanX.size() ; i++){  // tutaj drukujemy ta liste nie w jednej linijce tylko pod soba.
            System.out.println(personYoungerThanX.get(i));
        }

    }
}
