package pl.com.rkulikowski.java14.Computer;

public class Laptop extends Computer {

    @Override
    public String toString() {
        return "This is a Laptop";
    }

    @Override
    public void changeDisk(){
        System.out.println("Changed Disk in Laptop");
    }

}
