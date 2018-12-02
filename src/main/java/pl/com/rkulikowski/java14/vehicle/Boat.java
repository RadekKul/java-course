package pl.com.rkulikowski.java14.vehicle;

public class Boat extends Vehicle {

    @Override           //poprzez nadpisanie metdoy z klasy wyzszej, mozna pozmieniac cos dla klas nizszych, zeby np car i boat mowily co innego
    public void move() {
     //   super.move();
        System.out.println("Boat is swiming...");
    }

    public void swim(){
        System.out.println("swim()");
    }

    @Override
    public String toString() {
        return "Boat ";
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Boat");
    }
}
