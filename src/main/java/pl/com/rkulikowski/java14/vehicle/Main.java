package pl.com.rkulikowski.java14.vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehilce = new Vehicle();
        vehilce.printName();

        Vehicle car = new Car();
        car.printName();
        //  car.speedUp();      // nie dziala bo metoda nie jest w Vehicle tylko w Car.


        Car carForSure = (Car) car; // to jest rzutowanie, java nam pomaga jak wcisniemy na nia prawym przyciskiem, tzw. Castowanie

        ((Car) car).speedUp();  // to jest tzw rzutowanie "down casting" bo referencje z Vehicle rzutujemy do Car.
    }
}
