package pl.com.rkulikowski.java14.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // wstep do wielowatkowosci

    public static void main(String[] args) {

        System.out.println("Main starts here");
        System.out.println(Thread.currentThread().getName());   // tu wywoluje nazwe tego watku ktory jest rozpatrywany w tym momencie

        // typ Runnable to sa prace jakie maja wykonac pracownicy
        Runnable job = () -> System.out.println("Worker name: " +       // jezeli przyjdzie ktos do pracy, niech sie przedstawi
                Thread.currentThread().getName());


        job.run();// to jest wywolywane zawsze w tym watku w ktorym jest zapisane czyli w mainie w naszym przypadku, i nie wazne czy na job czy na worker czy na idnia, daje nam main

        // Typ Thread to sa nasi pracownicy
        Thread worker = new Thread(job);   // tworzymy pracownika, i przypisujemy go do wykonania pracy job.
        worker.setName("Worker");

        worker.run();   // wyrzuca main jako imie workera
        worker.start(); // wystartowanie workwera.
        //worker.start();// nie mozemy dwa razy go wystartowac bo wywala java i to nie mozna go przechwytac

        // tu korzystamy juz z klasy pwcWorker zeby ustalic kolejnosc, robimy to po workerze zeby miec juz jakiegos stworzonego pracownika
        //handle main worker - zatrzymujemy maina w tym miejscu
        PwcWorker pwcWorker = new PwcWorker("PwcWorker", job,worker);
        pwcWorker.start();

        Thread indian = new Thread(job);
        indian.setName("Beżowy");
        indian.start();

        // tutaj mowimy zeby watek main, poczekal az indian skonczy swoja prace i dopiero potem sie konczy. Dlatego zawsze main skonczy sie po join(). Join sluzy do ustalenia kolejnosci
        try{
            indian.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // to w jakiej kolejnosci zostanie wykonane JOB, jest zupelnie randomowe, to jak w zyciu, dostaja ta sama prace i kto skonczy pierwszy ten pierwszy sie wyswietli
        // raz worker raz bezowy

        // mozna uzywac synchronizacji zeby jeden w danym czasie sie wykonywal zeby nie lecialy bledy

        List<String> strings = new ArrayList<>();
        Runnable addingString = () -> {
            synchronized (strings) {    // synchornizowanie na obiekcie, kto pierwszy trafi ten zrobi robote i odejdzie, potem znowu startuje reszta i kto pierwszy robi i odchodzi itd.
                strings.add(Thread.currentThread().getName()); // do listy strings dodaj nazwe obecnie wykonywanego watku
            }
        };
        Thread one = new Thread(addingString);
        Thread two = new Thread(addingString);
        Thread three = new Thread(addingString);
        Thread four = new Thread(addingString);

        one.start();
        two.start();
        three.start();
        four.start();

        System.out.println(strings);

        System.out.println("End of main");  // mimo ze to jest po wystartowaniu workera to jest kompilator pokaze to przed nim



    }
}
