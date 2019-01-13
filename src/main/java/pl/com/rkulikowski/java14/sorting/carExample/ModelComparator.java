package pl.com.rkulikowski.java14.sorting.carExample;

import java.util.Comparator;

public class ModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
