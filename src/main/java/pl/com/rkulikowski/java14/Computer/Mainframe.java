package pl.com.rkulikowski.java14.Computer;

public class Mainframe extends Computer {

    @Override
    public String toString() {
        return "This is a Mainframe";
    }

    @Override
    public void changeDisk(){
        System.out.println("Changed Disk in Mainframe");
    }
}
