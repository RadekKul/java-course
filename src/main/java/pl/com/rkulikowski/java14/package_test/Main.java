package pl.com.rkulikowski.java14.package_test;


import pl.com.rkulikowski.java14.package_test.one.Speaker;  // zaimportowac mozna jedna klase z paczki, jezeli inne nazywaja sie tak samo to musimy wpisywac ich cala nazwe

// przy imporcie calego folderu z uzyciem .* , dostajemy tylko classy w tym pakiecie, BEZ podfolderow


import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Speaker speaker1 = new Speaker();
        pl.com.rkulikowski.java14.package_test.two.Speaker speaker2 = new pl.com.rkulikowski.java14.package_test.two.Speaker();
        pl.com.rkulikowski.java14.package_test.three.Speaker speaker3 = new pl.com.rkulikowski.java14.package_test.three.Speaker();

        speaker1.speak();
        speaker2.speak();
        speaker3.speak();

        //Date date1 = new Date();
        //java.sql.Date date2 = new java.sql.Date();

    }
}
