package pl.com.rkulikowski.homework;

import java.util.Scanner;

public class zad11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wpisanaLiczba;

        System.out.println("Proszę podać liczbe do sprawdzenia");

        wpisanaLiczba = scanner.nextLine();

        int max = 0;
        int przedostatnia = 0;


        for (int i = 0; i < wpisanaLiczba.length() - 3; i++) {

            if (wpisanaLiczba.charAt(i) > max) {
                max = wpisanaLiczba.charAt(i);
            }

            for (int j = 0; j < wpisanaLiczba.length() - 3; j++) {
                if (wpisanaLiczba.charAt(j) < max && wpisanaLiczba.charAt(j) > przedostatnia) {
                    przedostatnia = wpisanaLiczba.charAt(j);
                }
            }
        }
        char przedostatniaNajwiekszaLiczba = (char) przedostatnia;
        char ostatniaNajwiekszaLiczba = (char) max;

        System.out.println("Przedostatnia największa z wpisanych liczb to: " + przedostatniaNajwiekszaLiczba);
        System.out.println("Największa z wpisanych liczb to: " + ostatniaNajwiekszaLiczba);
    }
}
