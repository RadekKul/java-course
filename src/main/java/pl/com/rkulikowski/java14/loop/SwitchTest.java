package pl.com.rkulikowski.java14.loop;

import pl.com.rkulikowski.java14.enum_example.MonthsOfTheYear;
import pl.com.rkulikowski.java14.enum_example.WeekDays;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ocena;

      /*  System.out.println("Podaj ocene ze sprawdzianu:" );
        ocena = scanner.nextInt();

        if (ocena == 5 || ocena == 4) {
            System.out.println("Nagroda");
        } else if (ocena == 3 || ocena == 2) {
            System.out.println("Nic");
        } else if (ocena == 1) {
            System.out.println("Lanie");
        } else {
            System.out.println("Wpisano złą ocene");
        }*/

        System.out.println("Podaj ocene ze sprawdzianu: ");

        ocena=scanner.nextInt();

        switch (ocena){
            case 5:
            case 4:
                System.out.println("Gut");      // w taki sposób wpisujemy jak chcemy połączyć dwie możliwości, zeby sie nie powtarzać
                break;
            case 3:
            case 2:
                System.out.println("Bad");
                break;
            case 1:
                System.out.println("Very bad");
                break;

                default:
                    System.out.println("Wpisano źle");

        }

        System.out.println();

        final int a =5; // z typem prostym nie mozemy zrobic nic jezeli jest final

        final StringBuilder buillder = new StringBuilder();

        buillder.append(1); // builder jest final ale jest to referencja, wiec nie mozna ja zmieniac, to mozemy cos dodac, mozemy na niej dziala
        buillder.append(2);
        buillder.reverse(); // mozemy odwrocic jej kolejnosc itp

       // buillder = new StringBuilder(); // ale nie mozemy jej zamienic na cos nowego bo jest final.

        // próbujemy zmienić a dzieki stworzonej metodzie
        cahngeInt(a);   // w taki sposob zmienimy tylko a wewnatrz metody, nie zmienimy tego co na zewnatrz, bo my zmieniamy referencje poprzez wskaznik
        System.out.println("a after method call: "+a);// tutaj znow na zewnatrz jest a=5, wiec nie zostalo zmienione na stale tylko na rzecz metody

        System.out.println();

        printDays(MonthsOfTheYear.JANUARY);

        System.out.println();

        printDay(MonthsOfTheYear.SEPTEMBER);

        System.out.println();

        printString("Michał");
        printString("nico");

    }

    public static void cahngeInt(int a){    // parametrem jest typ prosty, wiec w tej metodzie MOZEMY zmienic typ prosty a, ktory jest final, ale tylko na rzecz swojej metody!!!
        a=6;
        System.out.println("a inside method: " +a);
    }

    public static void checkMarkWithSwitch(final int Mark){

    }

    public static void printDays(MonthsOfTheYear months){

        switch (months){
            case JANUARY:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case FEBRUARY:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case MARCH:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case APRIL:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case MAY:Y:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case JUNE:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case JULY:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case SEPTEMBER:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case NOVEMBER:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case OCTOBER:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
            case DECEMBER:
                System.out.println(months +" has " + months.getNumberOfDays() + " days");
                break;
                default:
                    System.out.println("Podano zły miesiąc");

        }

        // to jest to samo za pomocą foreach i skorzystania z wypisywania dni za pomoca metody
        for (MonthsOfTheYear month: MonthsOfTheYear.values()){
            month.getNumberOfDays();
        }

        //mozna jeszcze inaczej
    }

    public static void printDay(MonthsOfTheYear months){
        switch (months){
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case NOVEMBER:
            case DECEMBER:
                System.out.println("31 days");  // wypisac 31 dni
                break;
            case FEBRUARY:
                System.out.println("28 days");  // wypisac wyjatkowy luty
                break;
             default:
                System.out.println("30 days");  // reszta ma 30 dni, jestesmy pewni ze wejdzie miesiac bo taki dalismy parametr w metodzie
        }
    }

    public static void printString(String text){        // dzięki temu jesteśmy pewni że można metode wywołac tylko poprzez parametr typu String, wiec nie dostaniemy nic innego
        switch (text){
            case "Radek":
                System.out.println("Wpisano Radek");
                break;
            case "Michał":
                System.out.println("Wpisano Michał");
                break;

                default:
                    System.out.println("Wpisano coś innego niż Michał/Radek");

        }
    }
}
