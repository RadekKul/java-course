package pl.com.rkulikowski.java14.interfaceExample;

public class Bird implements Moveable,Flyable{
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving...");
    }
}
