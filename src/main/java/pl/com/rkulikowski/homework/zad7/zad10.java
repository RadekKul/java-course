package pl.com.rkulikowski.homework.zad7;

import java.util.Scanner;

public class zad10 {

    public static void main(String[] args) {


        int x;
        int y;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać długość boku trójkąta");

        x = scanner.nextInt();

        y=x;

        String[][] tablica = new String[x][y];

        for(int i =0; i<x;i++){
            for (int j = 0; j<y;j++){

                if(i>=j){
                    tablica[i][j]="x";
                }else {
                    tablica[i][j] = " ";
                }
            }
        }

        for(int i = 0; i<x;i++){
            for (int j = 0; j<x;j++){
                System.out.print(tablica[i][j] +" ");
            }
            System.out.println();
        }



    }
}
