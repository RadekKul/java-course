package pl.com.rkulikowski.java14.interfaceExample;

public class Plane extends Vehicle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }
}
