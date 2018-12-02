package pl.com.rkulikowski.java14.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionsTest {
    public static void main(String[] args) {
        //2 lists
        // 500 items for each list
        // first for searching
        //second for adding

        Random random = new Random();


        ArrayList<Integer> listArray = new ArrayList();
        List<Integer> listList = new LinkedList<>();

       /* long timeStart = System.currentTimeMillis();  // na podstawie tego jest losowosc.
        System.out.println(timeStart)*/;

        for(int i=0 ; i<500 ; i++){
            int x = random.nextInt(1000);   // wygenerowanie losowej liczby z zakresu 0 do 1000
            listArray.add(x);
        }

        for (int i = 0 ; i<500 ; i++) {
            int x = random.nextInt(1500);
            listList.add(x);
        }


        System.out.println(listArray);
        System.out.println(listList);

        // aby wyswietlic od konca np mozna to zrobic tak i do tego pod sobą,

       /* for(int i = listArray.size() - 1 ; i>-1 ; i--){
            int x = random.nextInt(500);
            System.out.println(x);
        }*/

        ArrayList<Integer> integersForSearch= new ArrayList();
        List<Integer> integersForAdding = new LinkedList<>();


       for(int i = 0; i<500 ; i++){
           integersForAdding.add(random.nextInt(500));
           integersForSearch.add(random.nextInt(500));
       }

       for(int i = integersForSearch.size() - 1; i > -1 ; i--){     // to jest takie wypisanie juz lepsze, ze pokazujemy index elementu i po nim randomowa liczbe, poprzez komende get(i)- pobieramy wartosc
           // liczby z kolejnego indexu w liscie.
           System.out.println("integersForAdding[" + i + "] " + integersForAdding.get(i));
           System.out.println("integersForSearch[" + i + "] " + integersForSearch.get(i));
       }
    }


}
