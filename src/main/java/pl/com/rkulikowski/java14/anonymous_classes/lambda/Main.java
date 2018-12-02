package pl.com.rkulikowski.java14.anonymous_classes.lambda;

public class Main {

    public static void main(String[] args) {

        // obiekt z klasy bird, implementujacy Flyable
        Flyable bird = new Bird();

        // klasa anonimowa
        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Plan can fly");
            }
        };

        // lambda   (wywolanie jedynej metody w tym interface wiec nie pyta nas ktora metode, pyta tylko o parametr, tutaj puste nawiasy bo nie przyjmuje metoda zadnych parametrow)
        Flyable bullet = () -> System.out.println("Bullet can fly");    // dla referencji bullet typu Flyable (interface) wywolaj jedyna metode, ()- brak parametrow do przekazania i zrob to co po -> (ciało metody)


        // teraz dla moveable - pierwsza klasa anonimowa, druga lambad

        // klasa anonimowa

        Moveable rat = new Moveable() {
            @Override
            public void run() {
                System.out.println("Rat is running");
            }
        };

        // lambda
        Moveable mouse = () -> System.out.println("Mouse is runing");

        // teraz dla swimable, tam jest juz metoda z parametrami, pizsemy po rowna sie nazwy parametrow (pokolei lub z typami), nawet nazwy nie musza byc takie same, oby typy sie zgadzaly

        Swimable swimable = (distance,speed) -> {  // to jest definicja metody, dopiero nizej wolamy. cialo lambdy mozemy tez rozrzucac na kilka linijek
            System.out.println("My distance is: " + distance);
            System.out.println("My speed is: " + speed);
        };
        swimable.swim(10,20);   // tutaj wolamy dopiero ta metode.


        // teraz dzialamy na interfejsie FormulaConverter i zamieniamy C na F

        FormulaConverter converter = celsius -> (celsius*9/5) + 32;     // return jest tak jakby po strzalce, bo java wie co ma zwracac, nie moze zwrocic nic innego niz double, wiec automatycznie to konwertuje

        System.out.println("40 Celsius is even: " + converter.fromCelsiusToFahrenheit(40) + " Fahrenheits");

        // z opisem w ciele metody

        FormulaConverter converter1 = celsius -> {
            System.out.print("Wykonano lambde: ");
            return (celsius*9/5) + 32;
        };

        System.out.println(converter1.fromCelsiusToFahrenheit(20));

        // teraz robimy zadanie z MyLambda, program n razy wydrukuje tekst wpisany w petli

        MyLambda myLambda = n -> {
            String text = "";
            for(int i=0; i<n ; i++){
                text += "Java";
            }
            return text;
        };
        System.out.println(myLambda.test(4));   // wyswietlamy ilosc razy wpisana w przez uzytkowanika


    /// teraz zadanko z FlyableCleaner

        FlyableCleaner cleaner = new FlyableCleaner();

        // tak bysmy zrobili po staremu

      /*  cleaner.clean(new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        });*/

      // a tutaj z lambda
        cleaner.clean(() -> System.out.println("fly"));


        // tutaj robimy liczenie predkosci z swimable


        Swimable swimable1 = (distance, speed) -> System.out.println("Time of swimming = " + (distance/speed));
        swimable1.swim(100,100);

        //TODO jak zrobic z funkcji swimmingtime obliczanie czasu??
        /*
        SwimmingTime timeCounter = new SwimmingTime();

        timeCounter.countTime();
        */


        // to tak nie zadziala bo this.a w lambdach dziala inaczej, ale dowiemy sie jak
        /*cleaner.clean(new Flyable() {
            @Override
            public void fly() {
                String a;
                System.out.println(this.a);
            }
        });*/

    }
}
