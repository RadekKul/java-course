package pl.com.rkulikowski.java14.vehicle;

public class Main2 {
    //TODO: virtual method
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();        // stwarzamy referencje car, która wskazuje  jest typu Vehicle i dziedziczy metody po Car() bo stworzylismy ją na new Car
        Vehicle boat = new Boat();      // Vehicle ogranicza tylko metody do Vehicle, a car i boat rozszerzaja te metody o dodatkowe metody w tych classach.
        Vehicle plane = new Plane();
        Car car2 = new Car();           // zeby mozna bylo skorzysac z metody z Car.java trzeba dodac car do Car, a nie do Vehicle

        vehicle.move();
        car.move();
        boat.move();
        System.out.println();

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(plane);
        System.out.println();

        car2.speedUp();
        System.out.println();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        plane.increaseSpeed();
        System.out.println();

        increaseSpeed(car);         // dzieki temu zapisowi, kazda metoda incerease speed jest zastapiona w klasie danej
        increaseSpeed(plane);
        increaseSpeed(boat);
        increaseSpeed(vehicle);




    }

    public static void processVehicle(Vehicle someVehicle){

        System.out.println(someVehicle);            // zmiennilismy toString w klasie Vehicle i dzieki temu mozemy tu po prostu wpisac nazwe obiektu, a toString wyswietli nam jego reprezentacje
                                                    // mozemy np w classie plane jeszcze nadmienic toString i wtedy jeszcze co innego nam wyswietli
    }

//    public static void increaseSpeed(Vehicle someVehicle){
//
//        System.out.println(someVehicle + " speed is increasing!!");
//
//    }

    public static void increaseSpeed(Vehicle someVehicle){              // my napisalismy tu metode statyczna dla calej clasy Vehicle, ktora uzywa metody increaseSpeed() z kazdej klasy pokolei
        System.out.println("from method increaseSpeed(Vehicle)");       // dlatego w classach nadpisalismy tą metode i wyszedl fajny efekt.
        someVehicle.increaseSpeed();
        System.out.println();
    }


}
