package pl.com.rkulikowski.java14.anonymous_classes.runnable;

public class FabricExample {


    public static void main(String[] args) {

        MyRunn one = new MyRunn();
        one.run();
        MyRunn two = new MyRunn();
        two.run();


    }

    // metoda fabryczna - zwraca jakis konkretny typ w tym przypadku zwraca nowy obiekt Runnable
    private static Runnable makeNewRunnable() {
        return new Runnable() {
            private String name = "Radek";

            @Override
            public void run() {
                String name = "Piotrek";
                System.out.println("My name: " + this.name);    // jak damy this.name to bierze to co wyzej w metodzie czyli Radek, a jak damy samo name to wemzie to co nadmienilismy w run() czyli Piotrek
            }
        };
    }

    //metoda fabryczna z wykorzystaniem lambdy

    private static Runnable makeRunnableLambda() {

        return () -> {
            String name = "Radekkk";
            System.out.println("my name:" + name);    // jakbsmy dali tu this. to sie nie kompiluje bo wtedy odnosi sie do klasy w ktorej jest ta metoda a tam nie ma name
        };

    }
}


class MyRunn implements Runnable{

    private String name = "Radekk";

    @Override
    public void run() {
        System.out.println("My name: " + this.name);
    }
}
