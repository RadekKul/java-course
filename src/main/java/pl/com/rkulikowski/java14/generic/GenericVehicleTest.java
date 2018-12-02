package pl.com.rkulikowski.java14.generic;

import pl.com.rkulikowski.java14.vehicle.Car;
import pl.com.rkulikowski.java14.vehicle.Plane;
import pl.com.rkulikowski.java14.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {

    //method takes List of Vehicles
    // send Cars/Planes
    // method for adding Cars to List


    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle());
        vehicleList.add(new Vehicle());
        vehicleList.add(new Plane());
        vehicleList.add(new Plane());

        doListOfVehicles(vehicleList);

        System.out.println();

        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car());
        carsList.add(new Car());
        addCars(carsList); // dodajemy car do listy cars

        addCars(vehicleList); // dodajemy car do listy vehicle

        doListOfVehicles(vehicleList);  // wywolujemy metode dla vehicleList
        System.out.println();

        doListOfVehicles(carsList); // wywolujemy tą samą metode dla carsList, dziala bo zrobilismy List<? extends Vehicle>
    }

    public static void addCars(List <? super Car> cars){        // przyjmujemy do metody listy od Car wyzej
        cars.add(new Car());            // robimy na listach od Car w dół
    }

    public static void doListOfVehicles(List <? extends Vehicle> vehicles){     // przyjmujemy do metody listy od Vehicle w dół
        for(Vehicle v: vehicles){
            System.out.println(v);
        }

    }
}
