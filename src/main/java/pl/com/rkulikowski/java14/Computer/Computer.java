package pl.com.rkulikowski.java14.Computer;

public class Computer {

    @Override
    public String toString() {
        return "This is a Computer";
    }

    public void changeDisk(){
        System.out.println("Changed Disk in  Computer");
    }

    public static void print(){
        System.out.println("Printed from Computer");
    }
}
