package pl.com.rkulikowski.java14.inner_class;

public class Vehicle {

    private String vehicleName;
    private Wheel wheels; // tworzymy skladnik classy/typu Wheel w Vehicle, w obrebie klasy mozemy tu juz to zadeklarowac mimo ze ze klasa wheel jest duzo nizej zdefiniowane


    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }

    public Vehicle(String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    public static class Wheel {

        private int numberOfInches;

        public Wheel(int numberOfInches) {
            this.numberOfInches = numberOfInches;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "numberOfInches=" + numberOfInches +
                    '}';
        }
    }



}
