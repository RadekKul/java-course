package pl.com.rkulikowski.java14.sorting.carExample;

import java.time.LocalDate;

public class Car implements Comparable<Car>, CarConcat<Car>{

    private String brand;
    private String model;
    private String colour;
    private LocalDate productionYear;
    private int power;

    public Car(String brand, String model, String colour, LocalDate productionYear, int power) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.productionYear = productionYear;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return productionYear.compareTo(o.productionYear); // dzieki temu ze mozna uzywac compareTo na LocalDate(bo ma to w swoich metodach) mozemy dokladnie porownywac daty
        // wiec wchodzimy do Car i porownujemy nasz obiekt z obiektem przekazanym do metody.
        // jak chcielibysmy zmienic kolejnosc, mozemy zamienic o. w innej miejsce lub wszystko pomnozyc przez -1*, lub reverse
    }

    // jakas metoda, uzycie lambdy w miejscu gdzie nie oznaczono interfejsu funkcyjnego, zeby pokazac ze lambda jest bez sensu jezeli w sordku mamy jeden obiekt i chcemy uzyc compareTo
    // bo w srodku mam tylko jeden samochod na ktorym operujemy w mainie i to wszystko, ta lambda nic nie bedzie robic
    public void maybeCompare(Comparable<Car> carComparable){
        carComparable.compareTo(this);  // this bo w carComparable juz jest jakis samochod i jak napiszem this- to wskazujemy na ten wlasnie samochod
    }

    @Override
    public void concatTwoBrands(Car object) {
        System.out.println(this.getBrand() + "-" + object.getBrand());  // this. jak zwykle oznacza obiekt na ktorego rzecz metoda zostala wywolana,  a nie tego co jest przyjety.
    }

    public void doConcatTwoBrandsWithLambda (CarConcat<Car> carConcat){
        carConcat.concatTwoBrands(this);        // nie ma dostepu do tego drugiego samochodu z CarConcat, wiec wysylamy siebie do zachowania, bo moze po drugiej stronie ktos porowna
        // ten wyslany przez nas teraz z tym co juz jest w CarConcat, na tym proba wywolania lambdy
    }
}
