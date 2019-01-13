package pl.com.rkulikowski.java14.sorting.carExample;

import java.time.LocalDate;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        // 5 aut
        // do kolekcji
        // naturalny porządek
        // domyslny porzadek tzn z uzyciem comparable
        // po roku produkcji

        List<Car> carList = new ArrayList<>(Arrays.asList(
                new Car("BMW", "E36", "Black", LocalDate.of(1994, 10, 20), 140),
                new Car("Audi", "A4", "White", LocalDate.of(1994, 8, 15), 110),
                new Car("Seat", "Toledo", "Silver", LocalDate.of(1999, 11, 1), 100),
                new Car("Porshe", "Cayenne", "Gold", LocalDate.of(1981, 6, 25), 190),
                new Car("Volvo", "S80", "Green", LocalDate.of(2007, 3, 23), 150)
        ));

        System.out.println("Before sorting");
        System.out.println(carList);
        System.out.println("After sorting ...");

        Collections.sort(carList);
        System.out.println(carList);


// tu wykonujemy swoj comparator porownujacy po modelach

        ModelComparator modelComparator = new ModelComparator();
        System.out.println(modelComparator.compare(carList.get(0),carList.get(1))); // wyszlo wiecej niz 0 wiec pozycja(0) bylaby wpisana za (1)

        // sortowanie po modelu, od A do Z
        Collections.sort(carList,modelComparator);
        System.out.println(carList);

        // albo poprzez stworzenie nowego komparatora
        Collections.sort(carList,new ModelComparator().reversed());
        System.out.println(carList);

        //po mocy rosnaco, bez Comparatora, a z lambda
        Collections.sort(carList,(o1, o2) -> o1.getPower() - o2.getPower());
        System.out.println(carList);

        // mozemy tez sortowac bezposrednio na liscie bez collections
        carList.sort(modelComparator.reversed());   // po modelu odwrotnie
        System.out.println(carList);

        // lambdami po roku
        carList.sort((o1, o2) -> o1.getProductionYear().compareTo(o2.getProductionYear()));
        System.out.println(carList);

        //lambdami po mocy
        carList.sort((o1, o2) -> o1.getPower()-o2.getPower());
        System.out.println(carList);

        //po kolorach za pomoca programowania funkcyjnego
        carList.sort(Comparator.comparing(Car::getColour).reversed());
        System.out.println(carList);

        // od teraz zadania z CarPlayer i CarActions
        // Car player
        // wyslac samochod do niego
        // wyslac dwa razy lambde

        CarPlayer carPlayer = new CarPlayer();

        carPlayer.playWithCarAction(carList.get(0), car -> System.out.println("First Car is moving: " + car.getBrand()));   // korzystamy z lambdy dla metody funckyjnej w interfejsie


        carPlayer.playWithCarAction(carList.get(1), new CarActions() {
            @Override
            public void move(Car car) {
                System.out.println("Car is moving: " + car.getBrand());
            }

            @Override
            public void fly(Car car) {
                System.out.println("Car is flying also: " + car.getBrand());
            }
        }
        );

        carList.get(0).maybeCompare(o -> o.getPower());

        // nowa metoda na zlaczanie dwoch marek pojazdów

        carList.get(0).concatTwoBrands(carList.get(1)); // ładnie łączy

        // lambda sie tego nie zapisze, bo mozna napisac lambde tylko dla porownania dwoch obiektow i symulacji zachowan, wiec jak wywolamy na jednym obiekcie to juz go na nic nie zmienimy
        // i ta lambda bedzie troche bez sensu, dlatego trzeba pamietac ze lambde tylko dla porownywania zachowan dwoch obiektow.
        carList.get(0).doConcatTwoBrandsWithLambda(object -> System.out.println(object.getBrand() + "-")); // dostajemy z tego tylko pierwszy czlon czyli to co wyslalismy wlasnie w tej linijce

    }

}
