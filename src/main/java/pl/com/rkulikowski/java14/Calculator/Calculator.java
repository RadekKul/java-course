package pl.com.rkulikowski.java14.Calculator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        int count1 = 0;
        int count2 = 0;
        int z = 0;

        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            for (int i = 0; i < 3; i++) {


                System.out.println("Wybierz działanie jakie chcesz wykonać wprowadzając odpowiedni numer : ");
                System.out.println("1. Dodawanie '+' ");
                System.out.println("2. Odejmowanie '-' ");
                System.out.println("3. Mnożenie '*' ");
                System.out.println("4. Dzielenie '/'");


                if (scan.hasNextDouble()) {

                    double action = scan.nextDouble();

                    if (action == 1) {      // Tylko w tej metodzie zrobiono wyjatek z literami.

                        System.out.println("Podaj liczby, które chcesz dodać: ");
                        if(scan.hasNextDouble()) {
                            double firstValue = scan.nextDouble();
                            if (scan.hasNextDouble()) {
                                double secondValue = scan.nextDouble();
                                System.out.println("Wynik: " + (firstValue + secondValue));
                                break;
                            } else {
                                System.out.println("Wpisano litere zamiast liczby");
                                break;
                            }
                        }
                        else {
                            System.out.println("Wpisano litere zamiast liczby");
                            break;
                        }
                    } else if (action == 2) {
                        System.out.println("Podaj liczby, które chcesz odjąć: ");
                        double firstValue = scan.nextDouble();
                        double secondValue = scan.nextDouble();
                        System.out.println("Wynik: " + (firstValue - secondValue));
                        break;
                    } else if (action == 3) {
                        System.out.println("Podaj liczby, które chcesz pomnożyć: ");
                        double firstValue = scan.nextDouble();
                        double secondValue = scan.nextDouble();
                        System.out.println("Wynik: " + (firstValue * secondValue));
                        break;
                    } else if (action == 4) {
                        System.out.println("Podaj liczby, które chcesz podzielić: ");
                        double firstValue = scan.nextDouble();
                        double secondValue = scan.nextDouble();
                        System.out.println("Wynik: " + (firstValue - secondValue));
                        break;
                    } else {
                        System.out.println("Nie wybrano żadnego działania");
                        scan = new Scanner(System.in);
                        z++;
                    }
                } else {
                    System.out.println("Nie wpisano liczby");
                    scan = new Scanner(System.in);
                    z++;
                }

                if (z < 3) {

                } else {
                    System.out.println("Dokonano 3 - krotnie złego wyboru");
                    break;
                }
            }


            int x = 0;

            for (x = 0; x < 3; x++) {

                scan = new Scanner(System.in);
                System.out.println("Czy chcesz wykonać kolejne działanie?");
                System.out.println("1. Tak");
                System.out.println("2. Nie");

                if (scan.hasNextDouble()) {
                    double secondAction = scan.nextDouble();

                    if (secondAction == 1) {
                        break;

                    } else if (secondAction == 2) {
                        System.out.println("Dziękujemy za skorzystanie z kalkulatora");
                        System.exit(0);
                    } else {
                        System.out.println("Dokonano złego wyboru");
                    }
                } else {
                    System.out.println("Nie wpisano liczby");
                }

            }

            if (x < 3) {

            } else {
                System.out.println("Dokonano 3 razy złego wyboru, kalkulator zostanie wyłączony");
                break;
            }
        }

    }
}




