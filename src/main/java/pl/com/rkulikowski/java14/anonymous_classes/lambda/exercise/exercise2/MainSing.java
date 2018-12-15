package pl.com.rkulikowski.java14.anonymous_classes.lambda.exercise.exercise2;

public class MainSing {

    public static void main(String[] args) {

        Singing singer1 = new Singing() {
            @Override
            public void singSopran() {
                System.out.println("Musisz to nadpisac");
            }

            @Override
            public void singBass() {
                System.out.println("Mozesz, ale nie musisz tego nadpisac bo to jest default (czyli ma domyslna implementacje)");
            }

            // mozna by nadpisac tez singAlt ale tego nie robie zeby pokazac ze domyslnie ustawiona w Singing dziala
          /*  @Override
            public void singAlt() {
            }*/
        };

        singer1.singSopran();
        singer1.singBass();
        singer1.singAlt();


        Singing singer2 = () -> {};

        singer2.singSopran();
        singer2.singBass();

        doObjectSinger().singSopran();
        doObjectSinger().singAlt(); // singALT i singBass wykonuja sie z interfejsu singing jako defaultowe, bo dla tego obiektu nie zostaly nadpisane, zostala nadpisana tylko singSopran, przez lambde
        doObjectSinger().singBass();    // pusto bo jest pusto w Singing , a nie zostala nadpisana


    }

    private static Singing doObjectSinger(){    // tutaj bardzo wazne, tworzymy OBIEKT TYPU SINGING a nie to co chcemy zeby wyswietlila metoda, wiec dopiero na tym obiekcie mozemy dzialac i wywolywac
        // metody z interfaceu, tak jak zrobilem wyzej, i dla nadpisanej, jedynej mozliwej (bo jedna jest nie default) mozemy cos zamienic.
        return () -> System.out.println("Spiewanie sopran wywoalne za pomoca lambdy");
    }
}
