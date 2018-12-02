package pl.com.rkulikowski.java14.loop;

public class ForTest {

    public static void main(String[] args) {

        printMyName();

//        printNTimes(1,"ala");
        printNTimes(10,"ala ma kota");
//        printNTimes(15,"lalalala");
    }

    public static void printNTimes(int numberOfTimes, String valueToPrint){

        for(int i=0; i < numberOfTimes;i++){
            System.out.println(valueToPrint);
        }

    }

    public static void printMyName(){
        for(int i=0; i<5; i++){
            System.out.println("Radosław Kulikowski");

            // for(;;) - petla nieskonczona
        }
    }
}
