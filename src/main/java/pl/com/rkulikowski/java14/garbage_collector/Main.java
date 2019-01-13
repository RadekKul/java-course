package pl.com.rkulikowski.java14.garbage_collector;

public class Main {
    public static void main(String[] args) {

        Object o = makeObject();

        {
            Object a = new Object();    // jak stworzymy w mainie lokalny blok kodu to poza nim nie mamy dostepu do a, mimo ze to wszystko jest w maine
        }

        System.gc();    // odpalanie garbage collectora recznie, ale i tak JVM sama wybierze czy ma rzeczywiscie zaczac sprzatac czy nie

        empty();
    }

    public static Object makeObject(){
        String temporal = new String("lost one");   // przy uzyciu new w jakiejs metodzie, pamiec dla tego obiektu zarezerwowana jest na stercie, i potem po wyjsciu z tego metody
        // nie mamy do niego zadnego dostepu, a pamiec zajął
        empty();
        return new String("new String");
    }

    public static void empty(){
        //empty
    }

}
