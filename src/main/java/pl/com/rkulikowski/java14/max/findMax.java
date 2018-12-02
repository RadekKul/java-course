package pl.com.rkulikowski.java14.max;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 4 liczby, które chcesz porównać: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int max = searchForMax(a,b,c,d);

        System.out.println("Największa wartość z wpisanych liczb to: " + max);

        int min = searchForMin(a,b,c,d);

        System.out.println("Najmniejsza wartość z wpisanych liczb to: " + min);


    }

    public static int searchForMax(int d, int e, int f, int g){
        int max = d;    //zakladamy ze d jest max

        if(max<e){
            max = e;
        }
        if(max<f){
            max=f;
        }
        if (max<g){
            max=g;
        }
        return max;
    }

    public static int searchForMin(int d, int e, int f, int g){
        int min = d;

        if(min>e){
            min=e;
        }
        if(min>f){
            min=f;
        }
        if(min>g){
            min=g;
        }
        return min;
    }

}
