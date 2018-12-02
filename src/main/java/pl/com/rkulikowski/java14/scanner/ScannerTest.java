package pl.com.rkulikowski.java14.scanner;

import java.util.Scanner;   // jezeli chcielibysmy wszystkie pakiety java.util to wpisac mozna java.util.*

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter numbers");

//        int intValue = inputReader.nextInt();
//
//
//        int secondValue = inputReader.nextInt();
//
//        int thirdValue = inputReader.nextInt();
//
//        System.out.println("I've got int value: " + intValue + " and " + secondValue + " and " + thirdValue);
//
//        System.out.println("Iloczyn podanych liczb to: " + (intValue*secondValue*thirdValue));

        for (; inputReader.hasNext();){         // jezeli nie jest intem to omijamy. program bez konca
            if (inputReader.hasNextInt()){
                System.out.println(inputReader.nextInt()); // jezeli to jest Int to drukujemy w taki sposob
            }else {
                inputReader.next();
            }
        }

    }
}
