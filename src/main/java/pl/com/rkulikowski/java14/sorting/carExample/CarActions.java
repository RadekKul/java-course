package pl.com.rkulikowski.java14.sorting.carExample;

@FunctionalInterface
public interface CarActions {

    void move(Car car);

    default void fly(Car car){} // funkcyjny interfejs czyli tylko move() bedzie moglo zostac uzyte w programowaniu funkcyjnym z lambdami

}

