package pl.com.rkulikowski.java14.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    // List<Integer>
    // 1000 elements -1: 100 - Random
    //51 - print index of 51
    //use break

    // zrob liste 1000 elementow z randomowych liczb od 0 do 100 i skoncz petle jak znajdziesz pierwsze 51 i wypisz jego index

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();   // tworzymy obiekt ktory nam bedzie losowal cos


        for(int i =0; i<500;i++){
            integerList.add(random.nextInt(101));  // 101 bo random "Wyłącznie" bez 101
        }

        for(int i = 0; i<integerList.size(); i++){
            if(integerList.get(i) == 51){
                System.out.println("Znaleziono 51 na miejscu o indexie: " + i);
                break;
            }

        }
        if (!integerList.contains(51)){
            System.out.println("Nie ma 51 w liscie");
        }


        //    System.out.println(integerList.indexOf(51)); // szybsze rozwiazanie


        /*    Integer aa = null;        // to jest obiekt bo typ nie jest proisty
        int b = aa;                     // int z malej to jest wskazanie na wartosc a nie na obiekt, skoro wiec wskazujemy na null to wyskoczy nullpointnerexception, bo typ prostu MUSI miec wartosc
        System.out.println(b);*/


    }

}
