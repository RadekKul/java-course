package pl.com.rkulikowski.java14.Conditional;

public class ConditionsTest {

    public static void main(String[] args) {

        testAge(12);

        testAge2(20);

        printStringLength("ala");

        String value = "ala ma kota";
        printStringLength(value);

        String value2 = null;       // null-wskaznik do niczego, najbardziej znany błąd nullPointerExpection, zeby tego nie bylo musimy sie zabezpieczyć w metodzie drukowania
        printStringLength(value2);

        testStringLength("shhshshshshaka");

        testStringLength("ahsjsd");

        testStringLength(""); //pusty tez zadziala, ma 0 dlugosc
    }

    public static void testAge(int age) {
        if (age > 0) {
            if (age <= 10) {
                System.out.println("0-10");
            } else if (age <= 15) {
                System.out.println(("11-15"));
            } else if (age <= 18) {
                System.out.println("16-18");
            } else if (age > 18) {
                System.out.println(">18");
            }
        } else {
            System.out.println("Wiek mniejszy niz 0");
        }
    }

    public static void testAge2(int age) {
        if (age > 0 && age <= 10) {
            System.out.println("0-10");
        } else if (age > 10 && age <= 15) {
            System.out.println("11-15");
        } else if (age > 15 && age <= 18) {
            System.out.println("16-18");
        } else if (age > 18) {
            System.out.println(">18");
        } else {
            System.out.println("Wpisano wiek mniejszy niż 0");
        }
    }

    public static void printStringLength(String string) {    //string z malej litery to argument metody, wszystkie miejsca gdzie uzyto string z malej, to sa miejsca gdzie wpisana zostanie wartosc
        if (string != null) {
            int stringLen = string.length();
            System.out.println("String length: " + stringLen);
        } else {
            System.out.println("null is not allowed here");
        }
    }

    public static void testStringLength(String string){
        if(string != null && string.length()<10){
            System.out.println("Quite short string");
        } else {
            System.out.println("Quite long string");
        }
    }
}



