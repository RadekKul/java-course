package pl.com.rkulikowski.java14.sorting.carExample;

public class CarPlayer { // bedzie to klasa ktora tylko wykonuje rzeczy z interfejsu ktory przyjmie w metodzie

    public void playWithCarAction(Car car, CarActions carActions){
        System.out.println("Inside playWithCarAction");
        carActions.fly(car);
        carActions.move(car);
    }
}
