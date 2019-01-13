package pl.com.rkulikowski.java14.sorting.carExample;

@FunctionalInterface
public interface CarConcat<T> {

    void concatTwoBrands(T object);
    // concat this and other brand

}
