package pl.com.rkulikowski.java14.anonymous_classes.runnable;

public class Main implements Runnable{

    public static void main(String[] args) {
        // 1 - zwykla klasa implementujaca Runnable
        // 2 - klasa anonimowa - z sachowaniem referencji
        // 3 - klasa anonimowa - przekazywana jako parametr
        // 4 - lambda

        ClassForRunnable newObject = new ClassForRunnable();

        processRunnable(newObject);


        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("Biegam");
            }
        });

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1 biega");
            }
        };

        Runnable lambda1 = () -> System.out.println("lambda1 biega");
        processRunnable(lambda1);

    }

    @Override
    public void run() {
        System.out.println("Biegam");
    }

    private static void processRunnable(Runnable runnable){
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();
    }
}
