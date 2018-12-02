package pl.com.rkulikowski.java14.interfaceExample;

public class Vehicle implements Moveable {
    @Override
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}
