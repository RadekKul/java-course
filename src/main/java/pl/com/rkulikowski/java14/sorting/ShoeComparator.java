package pl.com.rkulikowski.java14.sorting;

import java.util.Comparator;

public class ShoeComparator implements Comparator<Person> {

    // zalozenie, od najmniejszego do najwiekszego numeru buta
    @Override
    public int compare(Person o1, Person o2) {
        //o1 =5
        //o2 =6
        // piszemy sobie 2 przykladowe wartosci i sprawdzamy jak to ma dzialac, w jakiej kolejnosci ma byc nadpisane
        return (int) (o1.getShoeSize() - o2.getShoeSize()); // musimy zrzutowac do inta, bo mamy zwrocic int a przychodzi double.
        // zostawiamy tak bo jak o1 bedzie mniejsze i odejmnie wieksze to dostaniemy liczbe mniejsza od 0 wiec Comparator ustawi ją przed tą druga.
    }
}
