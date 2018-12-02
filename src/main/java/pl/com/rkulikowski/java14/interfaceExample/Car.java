package pl.com.rkulikowski.java14.interfaceExample;

public class Car extends Vehicle implements Moveable{

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
