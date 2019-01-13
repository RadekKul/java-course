package pl.com.rkulikowski.java14.garbage_collector;

public class StackOverflowExample {

    // pokazanie wywolania stackOverflow
    public static void main(String[] args) {
        //callMe();

        one();
    }

    public static void callMe(){
        callMe();
    }

    // przyklad rekurencji posredniej - tez stackOverflow
    public static void one(){
        two();
    }

    private static void two() {
        one();
    }

}
