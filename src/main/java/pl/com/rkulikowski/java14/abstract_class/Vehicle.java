package pl.com.rkulikowski.java14.abstract_class;

public abstract class Vehicle {     // w abstracyjnych klasach nie mozna tworzyc obiektow (nie uzywa sie slowka new)
    private int numberOfWheels;

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    public abstract void speedUp();

}
