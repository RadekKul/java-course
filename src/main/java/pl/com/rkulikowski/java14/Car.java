package pl.com.rkulikowski.java14;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfProducion;

    public Car(String brand, String model, String color, int yearOfProducion) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProducion = yearOfProducion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProducion() {
        return yearOfProducion;
    }

    public void setYearOfProducion(int yearOfProducion) {
        this.yearOfProducion = yearOfProducion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProducion=" + yearOfProducion +
                '}';
    }

    public static void main(String[] args) {

        // car1, car2 to są tzw referencje!

        Car car1 = new Car("BMW", "E36", "Black", 1993);

        System.out.println("Mam " + car1.getBrand() + " model: " + car1.getModel() + " koloru: " + car1.getColor() + " z " + car1.getYearOfProducion() + " roku" );

        Car car2 = new Car("Mercedes", "W220", "White", 1990);

        Car autoRadka = car1;

        System.out.println("Samochód: " + car1.toString());     // toString
        System.out.println("Samochód: " + autoRadka);

        autoRadka.setColor("Red");

        System.out.println("Samochód: " + autoRadka);

        Car autoMarka = null; // nadajemy nowemu obiektowi wartość null

        System.out.println(autoMarka);




    }



}
