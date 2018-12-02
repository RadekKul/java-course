package pl.com.rkulikowski.java14.vehicle;

public class Car extends Vehicle {

    @Override
    public void move() {
    //    super.move();
        System.out.println("Car is moving...");
    }

    public void speedUp(){
        System.out.println("speedUp()");
    }

    @Override    //jezeli nadpiszemy metode z @Override - i ktos namm zmieni metode w klasie glownej, ktorą nadpisywalismy, to wyskoczy nam tu blad ze nie ma takiej metody, jest to dobre dodatkowe zabezpizeczenie
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Car");
    }
}
