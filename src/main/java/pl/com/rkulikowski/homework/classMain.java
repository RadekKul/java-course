package pl.com.rkulikowski.homework;

import java.util.Scanner;

public class classMain {


    public static void main(String[] args) {

        int suma=0;
        int mojaZmienna=0;
        int IloscElementowPodzielnychPrzez3=0;
        int iloscWpisanychElementow=0;
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
                System.out.println("Suma podanych elementów to: " + suma);
                System.out.println("Średnia ze wszystkich elementów: " + srednia);
                System.out.println("Ilość elementów podzielnych przez 3: " + IloscElementowPodzielnychPrzez3);
                System.exit(0);
            }

            if(mojaZmienna>0 && mojaZmienna%3==0) {
                IloscElementowPodzielnychPrzez3++;
            }

            iloscWpisanychElementow++;

            suma = suma + mojaZmienna;

            srednia=suma/iloscWpisanychElementow;

        }
    }
}
