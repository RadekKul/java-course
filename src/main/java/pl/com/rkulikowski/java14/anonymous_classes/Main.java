package pl.com.rkulikowski.java14.anonymous_classes;

public class Main {

    public static void main(String[] args) {
        Animal monkey = new Monkey();

        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);

        Animal parrot = new Animal() {  // tworzymy nowa klase anonimowa(bez nazwy), ktora dziedziczy po animalu(klasa abstrakcyjna) i dodatkowo odrazu opisujemy jej zachowanie(printAnimalName)
            @Override
            public void printAnimalName() { // tutaj dostarczamy implementacje dla tej anonimowej klasy
                System.out.println("Parrot");
            }
        };


        processor.processAnimal(parrot);

        // tutaj to samo

        Animal duck = new Animal() {    // przy Tworzeniu tej klasy, sam kompilator nam pokaze ze Animal(abstrakcyjna) ma metode printAnimalName i ze musimy to nadpisac( bo to jest metoda z abstract)
            @Override
            public void printAnimalName() {
                System.out.println("Duck Duck");
            }

            public void makeSound(){    // aby wywolac makeSound musimy odrazu do zrobieniu obiektu anonimowego, wywoalc na nim metode, wiec to troche bez sensu. ( zamiast srednika po klamrach nizej)
                System.out.println("kwa kwa");
            }
        };

        processor.processAnimal(duck);

        processor.processAnimal(new Animal() {  // tworzymy w miejscu obiekt Animal, nie przechowywujac referencji tylko wykonujac dana metode i koniec.
            @Override
            public void printAnimalName() {
                System.out.println("Duck!!!");
            }
        });

        Monkey monkey1 = new Monkey(){  // jest to stworzenie  obiektu anonimowego czegos co dziedziczy po Monkey i nadpisujemy mu metode printAnimalName (chociaz nie musimy tego robic bo to nie jest abstrakcyjna classa juz)
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };

        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {

            }
        };


        // tutaj robimy podobno rzecz z interfacem, stwarzamy obiekt klasy secretprocessor zeby wywolac metode processSecret i w niej stwarzamy nowy obiekt anonimowy, dzieki ktoremu uzywamy jednokrotnie
        // zachowania "printSecret"

        SecretProcessor secretProcessor = new SecretProcessor();

        secretProcessor.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Sekret anonimowego obiektu podklasy ShowSecret");
            }
        });

        // teraz robimy zadanie z Moveable interface, tam jest zapisane

        MoveableProcessor moveableProcessor = new MoveableProcessor();


        // tutaj tworzymy obiekt chwilowy, wywouljemy na jego rzecz dwa zachowania z inteface'u i znika on na zawsze, wywolujemy processMoveable dla obiektu jednorazowo stworzonego i koniec

        moveableProcessor.proccesMoveable(new Moveable() {
            @Override
            public void run() {
                System.out.println("Batman is running");
            }

            @Override
            public void fly() {
                System.out.println("Batman is flying");
            }
        });

        // tutaj tworzymy najpierw obiekt typu Moveable na stale i dopiero potem nadpisujemy jego zachowania, ale sama referencja do obiektu zostanie nam na zawsze

        Moveable superman = new Moveable() {
            @Override
            public void run() {
                System.out.println("Superman is running");
            }

            @Override
            public void fly() {
                System.out.println("Superman is running");
            }
        };

        moveableProcessor.proccesMoveable(superman);

        // i trzeci sposob to stowrztyc klase np Hulk, ktory rozszerzy Interface moveable i nadpisze tam metody i potem wypisan na nim proces.

        Hulk hulk = new Hulk(); // tworzymy nowy obiekt typu Hulk, ktory roszerza interface i przjemuje zachowania, wiec mozna na nim zrobic procesor.

        moveableProcessor.proccesMoveable(hulk);




    }

}
