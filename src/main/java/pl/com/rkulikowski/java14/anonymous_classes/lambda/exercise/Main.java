package pl.com.rkulikowski.java14.anonymous_classes.lambda.exercise;

public class Main {

    String main; // skoro przy main nie ma statica, tzn ze odnosi sie do obiektu z klasy Main, wiec musimy stworzyc obiekt typu Main zeby to wywolac

    public static void main(String[] args) {


        Trainer trainer = new Trainer();
        MyThread myThread = new MyThread();

        // stworzylismy klase anonimowa + obiekt nieznanego typu
        Exercise job = new Exercise() {
            @Override
            public void swim() {
                System.out.println("swimming");
            }
        };

        // te dwa przyklady tworzenia anonimowego obiektu to co innego, bo jeden ma w sobie metode swim a drugi run
        Exercise lambdaJob = () -> {
        }; // void swim();
        MyRunnable run = () -> {
        };   // void run();

        //trainer.performExercice(run); // tak nie pojdzie bo run jest z innego interfeju nie exercise tylko myrunnable, to jak pomylenie String z int

        trainer.performExercice(() -> System.out.println("Swim"));  // dlatego tu kompilator wie ze ma wywolac swim() bo tutaj mozemy dac tylko typ interfejsu Exercise (tylko i wylącznie!!)

        myThread.performJob(() -> System.out.println("Swim")); // tutaj java sam zamieni nam typ na ten ktory jest wymagany czyli MyRunnable, mimo ze wpisalismy swim, to lambda wywola nam
        // metode run() i ją nadpisze, bo do performJob mozemy dodac TYLKO TYP MyRunnable. JAK SIĘ NACISNIE CTRL I NA STRZALKE LAMBDY to widzimy ktora metoda zostaje wywolana
    }

    private static Exercise makeNewExercice() {
        return new Exercise() {
            String version = "v1.0";

            @Override
            public void swim() {
                System.out.println("my new exercise, ver: " + this.version);    // this. odnosi sie do version ze stworzonego obiektu, dlatego ze tutaj wytworzylismy nowy obiekt, a w lambdzie
                // wywolujemy tylko metode dlatego this. dziala tam inaczej.
            }
        };
    }

    private static Exercise makeNewExerciceV2() {       // tutaj tworzymy calkiem inna anonimowa klase, to nie bedzie ta sama klasa co wyzej!!!
        return new Exercise() {
            String version = "v2.0";

            @Override
            public void swim() {
                System.out.println("my new exercise, ver: " + this.version);
            }

            @Override   // mimo ze to jest w interfejsie gdzie functional jest swim(), to metode deafaultowa tez mozemy nadpisac, tak jak zwykle ALT+Insert Override i dziala
            public void jogging() {

            }
        };
    }

        //ta sama metoda ale lambda, zeby pokazac ze kompilator sam ogarnie ze jak robimy metode ktora zwraca Exercise, to odrazu nam sam zwroci taki typ

        private Exercise makeNewLambdaExercise () {
            // przy tworzeniu lambdy robimy tylko metode, nie mamy nawet gdzie napisac pola, wiec this bedzie odwolywalo sie te referencji z klasy wyzej, a nie z lambdy, bo to wywolywanie metod, a nie klasa
            return () -> {           // i tutaj jak widzimy nie mamy podanego zadnego zwracanego typu, tylko robimy zwykla lambde a kompilator wie ze musi zwrocic typ Exercise
                System.out.println("my new Exercise with lambda");
                System.out.println(this.main);      // a tutaj this. bedzie odwolywac się do zmiennej z klasy w ktorej jest lambda

            };

            // najprosciej bylo by tak
            //return () -> {}; // i to by bylo wywolanie nowej instancji Exercise, bez wypisania niczego
        }
    }
