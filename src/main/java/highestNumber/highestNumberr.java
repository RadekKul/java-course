package highestNumber;

import java.util.Scanner;

public class highestNumberr {



    public static void main(String[] args) {
    checkNumber();

    }
     public static void checkNumber(){
            Scanner scan = new Scanner(System.in);

            System.out.println("Wprowadź 3 liczby, które chcesz porównać");
            int firstNumber = scan.nextInt();
            int secondNumber = scan.nextInt();
            int thirdNumber = scan.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            doAction(firstNumber);
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            doAction(secondNumber);
        }else {
            doAction(thirdNumber);
        }
    }

    public static void doAction(int a){
     System.out.println("Największa liczba to: " + a);
 }
}
