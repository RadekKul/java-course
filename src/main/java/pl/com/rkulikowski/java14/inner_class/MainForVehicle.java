package pl.com.rkulikowski.java14.inner_class;

import static pl.com.rkulikowski.java14.inner_class.Vehicle.Wheel;

public class MainForVehicle {

    public static void main(String[] args){

        Vehicle vehicle1 = new Vehicle("Ferrari");      // tworzymy samochod
        Vehicle.Wheel wheel1 = new Vehicle.Wheel(4); // tworzymy kola (jest to classa statyczna w clasie vehicle, wiec musimy poprzedzic typ Wheel Vehicle'm , tj. Vehicle.Wheel
        Wheel wheel2 = new Wheel(12); // chyba ze dodamy import static na poczatku, to nie musimy

        Vehicle vehicle2 = new Vehicle("Bicylcle", new Wheel(2));   // uzywamy drugiego konstruktora i tworzymy w nim kolo

        Vehicle vehicle3 = new Vehicle("Car", wheel1); // lub uzywamy konstruktora z kolami juz stworzonymi



    }

}
