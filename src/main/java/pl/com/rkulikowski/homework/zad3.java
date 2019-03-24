package pl.com.rkulikowski.homework;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        double suma=0;
        double mojaZmienna=0;
        int IloscElementowDodatnich=0;
        double iloscWpisanychElementow=0;
        double srednia=0.0;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Podaj liczbę: ");
            mojaZmienna = scanner.nextInt();

            if (mojaZmienna == 150 ) {
                if(iloscWpisanychElementow==0){
                    System.out.println("wpisano odrazu 150");
                    System.exit(0);
                }
                System.out.println("Średnia ze wszystkich elementów: " + srednia);
                System.out.println("Ilość elementów dodatnich: " + IloscElementowDodatnich);
                System.exit(0);
            }

            if(mojaZmienna>0) {
                IloscElementowDodatnich++;
            }

            iloscWpisanychElementow++;

            suma = suma + mojaZmienna;

            srednia=suma/iloscWpisanychElementow;

        }
    }
}
