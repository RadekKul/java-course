package pl.com.rkulikowski.java14.anonymous_classes;

public class Hulk implements Moveable{


    @Override
    public void run() {
        System.out.println("Hulk is running");
    }

    @Override
    public void fly() {
        System.out.println("Hulk can't fly");
    }
}
