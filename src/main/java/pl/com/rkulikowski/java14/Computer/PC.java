package pl.com.rkulikowski.java14.Computer;

public class PC extends Computer {

    @Override
    public String toString() {
        return "This is a PC";
    }

    @Override
    public void changeDisk(){
        System.out.println("Changed Disk in PC");
    }

    public static void print(){
        System.out.println("Printed from PC");
    }

}
