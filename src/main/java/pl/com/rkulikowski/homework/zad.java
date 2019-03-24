package pl.com.rkulikowski.homework;

import java.util.Scanner;

public class zad {

    public static void main(String[] args) {

        int iloscLosowan;

        int randomNumber;

        int min = -100;
        int max = 100;

        int maksymalna=0;
        int minimalna=0;

        double iloscDodatnich=0;

        double iloscUjemnych=0;

        double stosunek;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile losowan");

        iloscLosowan = scanner.nextInt();

        for(int i=0; i<iloscLosowan;i++){

            randomNumber = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println(randomNumber);

            if(randomNumber>=0){
                iloscDodatnich++;
                if(randomNumber>maksymalna){
                    maksymalna=randomNumber;
                }
            }else {
                iloscUjemnych++;
                if(randomNumber<minimalna){
                    minimalna = randomNumber;
                }
            }
        }

        stosunek = iloscDodatnich/iloscUjemnych;

        System.out.println("Stosunek: " + stosunek);
        System.out.println("Maksymalna: " + maksymalna);
        System.out.println("Minimalna: " + minimalna);
    }
}
