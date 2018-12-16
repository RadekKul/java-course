package pl.com.rkulikowski.java14.sorting.wardrobeExample;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    List<Clothes> clothes = new ArrayList<>(Arrays.asList(
       new Clothes(true,61),
       new Clothes(false,68),
       new Clothes(false,63),
       new Clothes(true,68),
       new Clothes(true,68)
    ));

    // sortowanie rozmiar od najmniejszego
        clothes.sort(((o1, o2) -> o1.getSize()-o2.getSize()));
        System.out.println(clothes);

        ////////////

        // te dwie linijki to to samo, raz lambda raz funkcyjne, w lambdzie mozemy zaprzeczac wiec w pierwszym przykladzie zmieniamy zeby sortowalo od true do false, bo domyslnie jest od false do true
        clothes.sort(Comparator.comparing(Clothes::getSize).thenComparing(clothes1 -> !clothes1.isCleanOrNot()));

        clothes.sort(Comparator.comparing(Clothes::getSize)
        .thenComparing(Clothes::isCleanOrNot)); // jesli rozmiar taki sam to zrob wedlug isCleanOrNot
        System.out.println(clothes);

        // mozna tez uzywac Comparatorow, zrobic sobie klase i tam wykonac Comparatory takie jak nam sa potrzebne i wtedy sobie wywolywac metody z tej klasy przy sortowaniu
        // np clothes.sort(clothesComparator::sizeCompare




    }
}
