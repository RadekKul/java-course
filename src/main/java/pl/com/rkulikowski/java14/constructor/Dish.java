package pl.com.rkulikowski.java14.constructor;

public class Dish {

    private String kind;

    {
        System.out.println("Dish - First init block"); // tzw blok niestetyczny (initializujący), wypisuje się ze kazdym razem gdy wywolany jest konstruktor - przed nim, (wywolywane są zanim blok cialo constructora sie wykona)
    }

    static { // blok statyczny jest wywolywany tylko raz podczas rozpoczecia wykonywania obiektów, dlatego pojawia sie tylko przy pierwszym wywolanym obiekcie. Wywolaja sie w kolejnosci z pliku zrodłowego
        System.out.println("Dish - Static Frist class initialization"); // nawet jak ich bedzie 10 to sie wszystkie pokolei wykonaja przy stworzeniu pierwszego obiektu.
    }

    {
        System.out.println("Dish - Second init block");
    }

    // overloading - wielokrotne wykorzystanie tej samej nazwy z delikatnym wyróznikiem (np roznica parametrów)
    public Dish(){      // Constructor to po prostu public i nazwa Classy, nic nie dodajemy więcej, zadnego void ani nic bo to juz nie bedzie Constructor
        // wlasnie w tym miejscu wywolują sie bloki niestetyczne.

        this("pasta");          // to jest wywolanie jednego konstruktora w drugim, poprzez this. i dalej wybieramy parametry do wpisania. Ctrl przeniesie nas do tego Constructora
                                    // OBOWIĄZKOWO wywolanie konstruktora w innym konstruktorze musi byc PIERWSZĄ INSTRUKCJĄ.
        // w tym miejscu wykonują się niestatyczne bloki, zaraz po inicjalizacji innych konstruktorów i ich parametrów.
        System.out.println("Dish() Constructor");
    }
    // overloading
    public Dish(int hmmm){
        // super() // w kazdym konstruktorze jest domyslnie tak, czyli wywoalnie konstruktora bezargumentowego z nadklasy, w glownej klasie wola super() z Object.

    }

    // overloading
    public Dish(String kind){
        super(); // to jest zawsze w kazdeym konstruktorze w ktorym sami nie wpiszemy super(cos) lub this(cos). Super wolamy konstruktor z nad klasy, This wolamy konstruktor z tej samej klasy.
        System.out.println("Dish()" + kind + " Second Constructor");
        this.kind=kind;
    }

        static {
        System.out.println("Dish - Static Second class initialization");
    }

}
