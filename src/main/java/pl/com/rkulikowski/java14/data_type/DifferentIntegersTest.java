package pl.com.rkulikowski.java14.data_type;

public class DifferentIntegersTest {

    public static void main(String[] args) {
        int base10 = 15;
        System.out.println(base10);

        int base8 = 015; // ósemkowy system 1*8 + 5
        System.out.println(base8);

        int base16= 0X15; // szesnastkowy 1*16+5
        System.out.println(base16);

        int base2 = 0b11;   // dwojkowy 1*2 + 1
        System.out.println(base2);

        int bigInt = 1_234_567_891; //Java pozwala oddzielac podlogą liczbe, tak zeby sie nie mylila, a w obliczeniach to pomija
        System.out.println(bigInt);

    }
}
