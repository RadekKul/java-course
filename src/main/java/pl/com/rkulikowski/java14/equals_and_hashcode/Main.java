package pl.com.rkulikowski.java14.equals_and_hashcode;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Radek","K.",24);
        Person radek = me;

        System.out.println(me.equals(radek));       // domyslnie metoda equals sparwdza czy referencje wskazuja na jeden obiekt, wiec tu jest true

        System.out.println("me==radek? : " + (me==radek));      // tutaj sie zgadza bo == porownuje referencje czy wskazuja na to samo

        radek = new Person("Radek","K.",24);

        System.out.println("and now, me == radek? " + (me==radek)); // tutaj sie nie zgadza bo mimo ze obietky maja identyczne dane to nie sa to te same obiekty, wiec referencje radek i me wskazuja na cos innego


        System.out.println(me.equals(radek));   // tutaj false bo referencje wskazuja na rozne obiekty wiec wedlug domyslnego equal, jest false, dopiero jak zmienilismy equals w klasie person to daje nam true

        // nalezy equals nadpisac w classie Person i teraz bedzie juz porownywac obiekty a nie referencje



    }
}
