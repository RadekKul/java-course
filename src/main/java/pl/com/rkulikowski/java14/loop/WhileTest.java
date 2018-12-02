package pl.com.rkulikowski.java14.loop;

import java.util.Scanner;

public class WhileTest {
    private int a = 5; // nie mozemy uzyskac dostepu do a w psvm bo jest ona static, mimo tego ze jest prywatne to mamy dostęp, bo psvm jest w tej samej klasie

    public static void main(String[] args) {


        new WhileTest().a = 6; //dopiero poprzez obiekt mamy do niej dostęp

        new WhileTest().getA();     // to sa dwa niezalezne obiekty, obydwa beda mialy zmienna 6 w sobie, a metode dla nich mamy jedna, bo przez słówko this. wiemy ze metoda dziala dla obiektu
        new WhileTest().getA();     // dla ktorego ją wywolujemy


        //  while (true){}   // petla while dziala na boolean, jezeli wpiszemy true to bedzie dzialac w nieskonczonosc

        Scanner scanner = new Scanner(System.in);

        char currentChar = 'r';

        while (currentChar != 'r') {
            //read char
        }

        for (; currentChar != 'r'; ) {        // mozna by w trzecim warunku dac scanner zeby pobral kolejną literke i sprawdzil
            //read char
        }

        do {
            //do smthing            // zawsze wykona sie co najmniej raz, nawet jak warunek nie bedzie spelniony
        } while (currentChar != 'r');

        int i = 0;
        while (i >= 0) {
            System.out.println("xxx");
            i--;
        }
    }

    public int getA(){
        return this.a;
    }

    public static void printNumbers(){
        for(int i = 1; i<=100_000; i++){
            //100
            if(i<52){
                System.out.println("i: "+ i); // wypisze nam cos 51 razy, ale petla zrobi sie 100 000 razy,bo mam break, wiec breakuje if i przestaje wypisywac
            } else {
                break;
            }
        }
    }

}

