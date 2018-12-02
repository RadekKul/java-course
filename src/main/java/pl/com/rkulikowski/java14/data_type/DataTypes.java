package pl.com.rkulikowski.java14.data_type;

public class DataTypes {

    public static void main(String[] args) {

        // W Javie mamy rozne typy zmiennych. Ogolnie dzieli sie na Obiekty i Primitive (ktorych jest 8:

        byte d = 0; // 1 bajt
        Byte dByte = 0;
        System.out.println("Max wartość byte: " + Byte.MAX_VALUE);
        System.out.println("Min wartość byte: " + Byte.MIN_VALUE);


        short c = 0; //2 bajty
        Short cShort = 0;
        System.out.println("Max wartość short: " + Short.MAX_VALUE);
        System.out.println("Min wartość short: " + Short.MIN_VALUE);


        int a = 5+8; // 4 bajty,   sam int to sucha wartosc, a Integer do klasa z dodatkowymi wlasciwosciami i cechami, dlatego zajmuje wiecej.

        Integer aInteger = 5+8; // ta linijka to to samo co:  new Integer(5+8), to znowu zajmuje kilka razy wiecej miejsca, wiec lepiej uzywac sposobu int a = 5+8,

        System.out.println("Max wartość int: " + Integer.MAX_VALUE);
        System.out.println("Min wartość int: " + Integer.MIN_VALUE);

        long b = 5+8; // 8 bajtów
        Long bLong = 5L + 8L; // musimy dostawic L po liczbie bo komplilator czyta to jako int
        System.out.println("Max wartość long: " + Long.MAX_VALUE);
        System.out.println("Min wartość long: " + Long.MIN_VALUE);

        // Są dwa typy zmienno przecinkowe w JAVIE, float i double, podstawowa jednostka to double, wiec jezeli chcemy dac cos float, to po liczbie musimy dostawic f, bo domyslnie jest double (doubke zajmuje wiecej)

        float f = 3.11f; // 4 bajty
        Float fFloat = 3.11f;
        System.out.println("Max wartość float: " + Float.MAX_VALUE);    // E to przesuniecie przesylka, zwykle 10^ktorejs
        System.out.println("Min wartość float: " + Float.MIN_VALUE);


        double db = 3.11; // 8 bajtów
        Double dbDouble = 3.11;
        System.out.println("Max wartość double: " + Double.MAX_VALUE);
        System.out.println("Min wartość double: " + Double.MIN_VALUE);

        boolean trueOrFalse = false;    // domyslna wartosc to false
        trueOrFalse = true;
        Boolean bBoolean = false;       // typ obiektowy Boolean, moze przyjmowac 3 wartosći, prawda, falsz i null (bo obiekt moze wskazywac na nic)
        bBoolean = true;
        bBoolean = null;

        char littleChar = '.';  // przechowywanie znaku, TYLKO JEDEN pomiędzy ''
        Character lCharacter = 'd';
        System.out.println("Max wartość char: " + (int)Character.MAX_VALUE);    //trzeba zrzutować znak na int, zeby dostac maksymalna i minimalna wartosc
        System.out.println("Min wartość char: " + (int)Character.MIN_VALUE);

        System.out.println((int)littleChar); // np kropka to 46 znak


        System.out.println();

            // to jest CASTOWNIE (przyciecie do zakresu), celowo przekraczamy zakres, a JAVA sama nam ucina
        byte xaxa = (byte) 131; // wyswietla -125, bo ma zakres 128, potem przeskakuje od nowa na -128, dlatego 131-127 to 4, czyli 127, -128, -127, - 126, - 125 przeskok o 4 .
        System.out.println(xaxa);

        int abc = 100;
        //byte x = abc;  nie pojdzie bo abc jest int, a java nie chce zamieniac na liczby wiekszego typu.

    }
}
