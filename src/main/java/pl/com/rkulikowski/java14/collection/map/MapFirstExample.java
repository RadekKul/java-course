package pl.com.rkulikowski.java14.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {

    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap(); // pierwszy argument typ klucza, drugi argument to typ wartości, ids - nazwa naszej mapy
        // zrobimy to na przykladzie peseli i imion, klucz to pesel w String, wartosc imie w String
        System.out.println((idsOverNames.put("94","Radek")));
        System.out.println((idsOverNames.put("94","Wojtek")));
        System.out.println((idsOverNames.put("95","Michał")));  // za kazdym razem zwraca poprzednią wartośc danego klucza, przy pierwszym 94 zwroci null, przy kolejnym zwroci Radek, przy pierwszym 93 null

        System.out.println(idsOverNames.get("94")); // jezeli zrobimy tak zeby wzial cos z danego klucza to wezmie najnowsza

        System.out.println((idsOverNames.put("93","Konrad")));
        System.out.println((idsOverNames.put("92","Kamil")));




        for(String key :idsOverNames.keySet()) {    //metodka keySet() to przejscie po kazdym kluczu,
            System.out.println("Key: " + key + ", value: " + idsOverNames.get(key)); // tutaj get(key) wolamy wartosc przypisana do danego klucza, klucz jest jeden, jezeli na ten sam klucz wpiszemy inna wartosc
            // to mapa sama nam ją podmieni na najnowsza wartość. Jednak Pesel np jest unikalny dla kazdej osoby, wiec nigdy by sie nic nie powtorzylo
        }   // wyswietli nam od najmniejszego do najwiekszego klucza, a nie tak jak dodawalismy od 92 do 95

        Map<String,String> secondMap = new LinkedHashMap<>(); // znowu szybka mapa na hashah, ale nie bedzie kolejnosci.






    }

}
