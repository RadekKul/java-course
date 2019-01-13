package pl.com.rkulikowski.java14.thread.join;

public class Main {

    public static void main(String[] args) {
        System.out.println("main() - beginning");

        Runnable job = () -> {
            for (int i = 0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i, Thread.currentThread().getName()));
            }
        };

        Thread worker1 = new Thread(job);

        //worker1.start(); // nie mozna awrzucic startu przed daemonami bo wtedy puscsimy watek i bedziemy chiceli go zaraz ograniczac a tak sie nie da bo nie wiemy w ktorym momencie wykonywania juz bedzie

        // wywolujemy Daemon przed startem - deamon stopuje wszystkie "dzieci" watku main, jak main sie konczy, reszta watkow zostaje zastopowana przez demony
        worker1.setDaemon(true);

        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);

        // wywolujemy join przed startem, join to czekanie wyjatku az skonczy sie inny

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1500);
            worker3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        worker1.start();     // watek wykonujacy jako thread-0
        //worker1.run();      // watek wykonujacy jako main

        worker2.start();
        worker3.start();


        // tutaj mozemy zrobic tak zeby main.sleep - zostaje zatrzymany na 20ms i wtedy drugi watek sobie dziala, po 20ms sie main budzi idzie do sowjego konca i tam startuje demon, ktory wylacza reszte
        // watkow, dlatego widzimy ze czesc watku worker1.start sie wykona ale nie calosc bo bedzie miec za malo czasu bo main sie juz obudzi i dojdzie do konca i demon to zatrzyma.
       // ta metoda wykonuje sie zawsze na watku w ktorym to jest uzywane
        // zeby uspic konkretny watek trzeba by go uspic w jego job-ie czyli podczas pracy by dostal przerwe przez Thread.sleep i tez lapiemy wyjatek
        try{
            Thread.sleep(17);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("main() - end");
    }
}
