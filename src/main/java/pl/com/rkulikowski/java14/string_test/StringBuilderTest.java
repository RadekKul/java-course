package pl.com.rkulikowski.java14.string_test;

public class StringBuilderTest {    // TODO NIE NAZYWAC NIGDY CLASS TAK SAMO JAK SĄ NAZWANE PODSTAWOWE METODY BO NAM SIE WSZYSTKO POPSUJE

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Mariusz");

        String ala = "ala" + "ma" + "kota"; // tu jest az 5 stringow w pamieci, bo ala, ma, kota, alama i alamakota, dlatego stosujemy StringBuilderTest

        StringBuilder wierszyk = new StringBuilder();

        wierszyk.append("Ala ");
        wierszyk.append("ma");
        wierszyk.append(" kota");

        System.out.println(wierszyk);

        // inny sposob na dodawanie, nie trzeba za kazdym razem pisac do czego ma to dodac

        StringBuilder wierszyk2 = new StringBuilder();

        wierszyk2.append ("ala ")
                .append("ma ")
                .append("kota2.");

        String wierszyk2String = wierszyk2.toString(); //

        System.out.println(wierszyk2);

        wierszyk2.delete(3 , 5);  // usuwamy z wierszyk2 dane znaki

        System.out.println(wierszyk2);

        System.out.println(wierszyk.delete(5,6));       // usuwamy ze Stringbuildera jakies znaki i to juz jest na zawsze zamienione

        System.out.println(wierszyk);


        StringBuilder wierszyk3 = new StringBuilder();

        wierszyk3.append("John ")
                .append("ma ")
                .append("psa.");

        System.out.println(wierszyk3);

        wierszyk3.replace(8,11, "królika"); // tutaj też musimy podac jeden znak dalej, bo start: zawiera znak, end: nie zawiera znaku. dlatego 8-11, a nie 8-10

        System.out.println(wierszyk3);

        wierszyk.substring(1,1); // nie zmieni nic bo mamy od pewnego momentu do tego samego momentu, wiec sie nie ruszymy nawet.

        System.out.println(wierszyk);


    }
}
