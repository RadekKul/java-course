package pl.com.rkulikowski.java14.exception;

public class ThreeLevelExceptionTest {

    static int counter = 1;

    // opisano dwie mozliwosci w kazdym z leveli - jedno lapiemy, drugie przekazujemy wyzej dzieki throws MyException w metodzie, trzeba zakoomentowac/odkomentwac pewne obszary
    // ponizej mozna zobaczyc ze wykona sie zawsze wszystko po obsluzeniu wyjatku, jezeli w jakiejs metodzie wyjatek przekazujemy dalej to nie wykona nam juz nic co jest dalej w tej metodzie
    // dobrze widac to jak odkomentujemy na ktoryms levelu przechwytywanie.
    // jezeli dodajemy drugi rodzaj/typ wyjatku to zauwazmy ze metoda moze przechwycic jeden typ i drugi rzucic dalej, moze tez obsluzyc obydwa lub rzucicdalej obydwa

    public static void main(String[] args) {
        System.out.println("main()");
        level1();
        System.out.println("main() - before end");

    }
    public static int level1(){
        System.out.println("leve1()");
        //level2();   // rowniez przekazujemy wyzej przez throws MyException, wywalamy az do maina, main jest ostateczny zeby obsluzyc wyjatek!!!

        try {
            level2();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("level1() before return");   // jak obsluzymy to sie wykona, bo nie rzuci wyjatkiem, wiec dojdzie do konca
        return 1;
    }
    public static int level2() throws MyException {
        System.out.println("leve2()");

        // to jest opcja łapania wyjatku na level 2, nizej zrobimy opcje przekazywania dalej czyli do lvl2()
        try {
            level3();
            System.out.println("level2() - after call to level3()");// ta linijka zostanie wypisana tylko jak level3() nie rzuci wyjatku, jezeli rzuci to przeskakujemy odrazu do catch zeby obslugiwac
        } catch (MyNewException e) {               // wiec skaczemy do tego miejsca
            e.printStackTrace();
        } catch (MyException e){            // przechwytujemy kazdy wyjatek, ukladamy je od wyspecyfikowanych bardziej do mniej.tak zeby miec obsluzone jak najweiecej, na koniec mozna dodac obsluzenie
            e.printStackTrace();            // ogolnego Exception
        } catch (Exception e){
            e.printStackTrace();
        }

        // gu opcja przekazania wyzej (dopisane throws MyException) czyli ostrzezenie ze metoda ta moze rzucac wyjatek
//        level3();
        System.out.println("level2() - after call to level3()");

        System.out.println("level2() - before return");
        return 2;
    }
    public static int level3() throws MyException, MyNewException { // to oznacze ze metoda moze zwrocic OBIEKT klasy MyException lub MyNewException - ktory bedzie wyjatkiem
        System.out.println("level3()");

        if (counter % 2 == 1) {
            throw new MyException("Problem on level 3");    // jezeli wszystko ok to metoda zwraca int, jezeli cos sie stanie to dostaniemy wyjatek i metoda NIC nie zwroci bo nie dojdzie nawet do return.
        }   // to co jest dalej sie nie wykona bo nie przejelismy wyjatku w tej metodzie, wiec automatycznie "wyskakuje" nam z metody level3() i wraca dalej do level2(), tam obslugujemy .
        else if(counter == 4){
            throw new MyNewException("New Problem on level 3");
        }

        System.out.println("level3() - before return");
        return 3;
    }

}
