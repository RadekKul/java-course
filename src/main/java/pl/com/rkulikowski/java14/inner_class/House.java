package pl.com.rkulikowski.java14.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String houseName;
    private List<Apartment> apartments;

    public House(String houseName) {    // Konstruktor wykonujący 100 mieszkan do rezydencji o wpisanej nazwie, mieszkania tylko 30m^2, kazdy z nich ma dostep do zmiennych prywatnych z tej klasy

        this.houseName = houseName;
        apartments = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            apartments.add(new Apartment(30));
        }
    }

    public House(){ // konstruktor dodajacy jedno mieszkanie
        apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment){  // metoda pozwalajaca wybrac sobie wielkosc mieszkania jakie nam wybuduja
        apartments.add(apartment);
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public class Apartment {            // apartment nie moze istniec bez House, bo jest w nimy, a kolo moglo istniec bez Vehicle.(przyklad Vehicle, Wheel)
        int sizeInSquareM;

        //odwolanie do konkretnego obiektu (House) czyli do klasy zewnetrznej. House.this.


        public Apartment(int sizeInSquareM) {
            this.sizeInSquareM = sizeInSquareM;
        }

        public void printNameOfHouse() {
            System.out.println("House name: " + House.this.houseName);  // dla konkretnego obiektu House dla ktorego zostal stworzony ten apartment, daj mi imie tego House
        }

        @Override
        public String toString() {
            return "Apartment{" +
                    "sizeInSquareM=" + sizeInSquareM +
                    '}';
        }

    }
}
