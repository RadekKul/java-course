package pl.com.rkulikowski.java14.vehicle;

public class Plane extends Vehicle {

    @Override
    public String toString() {
        return "This is a Plane";
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Plane");
    }
}
