package pl.com.rkulikowski.java14.enum_example;

public enum Seasons {
    WINTER(-10), // są to obiekty typu Seasons, nigdzie indziej nie mozemy niczego dodawac do tej klasy, ani nic usuwac
    SPRING(5), // wszystkie instancje w tym enum, sa typu Seasons !!!
    SUMMER(25),
    AUTOMN(7);

    private float avarageTempInC;


    private Seasons(float avarageTempInC){      // domyslny konstruktor bezargumentowy wskazuje po prostu na obiekt, wiec jezeli dodamy inny constructor, to musimy dopisac konstruktor domyslny, identycznie jak
                                                // w klasach. Chyba ze odrazu przy wpisywaniu instancji, przpyiszemy je do stworzonego przez nas constructora.
        this.avarageTempInC = avarageTempInC;

    }

    public float getAverageTempInC(){
        return avarageTempInC;
    }
}
