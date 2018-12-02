package pl.com.rkulikowski.java14.inner_class;

import static java.lang.Math.E; // zaimportuj statyczny skladnik e z klasy Math.E, jakbysmy chcieli importowac wszystkie na raz to java.lang.Math.*(ale to wiecej pamieci zajmuja)
import static java.lang.Math.PI;    // import statyczny importuje tylko statyczne skladniki!!
import static java.lang.System.out;

public class MathSimpleExample {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(String.format("E: %.2f\nPI: %.4f",E,PI));


        out.println("\n Zaimportowany static out, wiec działa bez System.out");
    }
}
