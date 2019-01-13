package pl.com.rkulikowski.java14.garbage_collector;

import java.util.HashSet;
import java.util.Set;

public class MainFeaturePhone {

    public static void main(String[] args) {
        Set<FeaturePhone> phones = new HashSet<>();

        FeaturePhone nokia1 = new FeaturePhone("Nokia 3310");
        FeaturePhone nokia2 = new FeaturePhone("Nokia 3310");



        System.out.println("nokia1 = nokia2: " + (nokia1.equals(nokia2)));

        phones.add(nokia1);
        phones.add(nokia2);

        System.out.println(phones.size()); // tutaj zeby pokazywal zbior ze jest 1 obiket (bo przeciez set nie ma  powtarzalnych obiektow) to musimy dodac nadpisanie hashcode
        // tylko wtedy obiekt nawet jak bedzie taki sam, bedzie mogl porownac swoj hashcode. Jak odkomentujemy to nam wyswietlii rozmiar 1 .

       // przy zakomentowanym hashcodzie tak najlepiej wywolac outOfMemory, bo zapchamy pamiec, z hashetem, wszystko to to bylby jeden obiekt a reszta to tylko referencje
        while (true){
            phones.add(new FeaturePhone("Nokia 100"));
        }
    }
}
