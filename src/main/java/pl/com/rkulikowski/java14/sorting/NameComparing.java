package pl.com.rkulikowski.java14.sorting;

public class NameComparing {

    public static int comparePersonsByName (Person first, Person second){

        return first.getName().compareTo(second.getName()); // proste porownywanie na Stringach, kopiujemy do Maina i tworzymy z tego lambde - fajna sprawa bo sam nam przerabia na lambde
    }
}
