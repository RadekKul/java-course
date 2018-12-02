package pl.com.rkulikowski.java14.collection.set;

import pl.com.rkulikowski.java14.Plants.Cactus;
import pl.com.rkulikowski.java14.Plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("one");

        System.out.println("Size: " + stringSet.size());    // wyswietla 2 bo Set-y nie przechowuja duplikatow.

        // Dodac 3 kaktusy

        Set<Plant> plantSet = new HashSet<>();

        plantSet.add(new Cactus(1,20,20));
        plantSet.add(new Cactus(1,20,20));
        plantSet.add(new Cactus(1,20,20));

        System.out.println("Size: " + plantSet.size());



    }
}
