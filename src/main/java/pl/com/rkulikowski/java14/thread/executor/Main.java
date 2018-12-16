package pl.com.rkulikowski.java14.thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Runnable job = () -> {
            for (int i = 0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i, Thread.currentThread().getName()));
            }
        };

      /*  Executor executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i <100 ; i++){
            executor.execute(job);
        }
*/
        // tworzymy druzyne ktora moze obslugiwac 4 watki na razi a nie tak jak wyzej jednego pracownika ktory 100 razy obsluzy po 100 prac
        Executor terminators = Executors.newFixedThreadPool(4);
        for (int i=0; i<100; i++){
            terminators.execute(job);
        }

        ((ExecutorService) terminators).shutdown(); // tak sie wylaczy ale poprzez zrzutowanie wiec musi byc typ ExecutorService zeby zakonczyl wykonywanie tak jak nizej

        ExecutorService terminators2 = Executors.newFixedThreadPool(4);
        for (int i=0; i<100; i++){
            terminators.execute(job);
        }

        // po skonczeniu pracy wylacz grupe/druzyne
        terminators2.shutdown();    // tu wylaczenie bo jest dobry typ terminators2 i na ExecutorService mozna po prostu wylaczyc bez rzutowania

        //terminators2.execute(job);     // ale jak juz zakonczymy dzialanie ich i chcemy im cos dodac to wyskakuje blad, bo jest juz za pozno
    }
}
