package pl.com.rkulikowski.java14.sorting;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {

    // zalozenie od najwiekszych zarobkow do najmniejszych

    @Override
    public int compare(Person o1, Person o2) {
        //o1 = 500
        //o2 = 300

        return (int) (o2.getIncome() - o1.getIncome());     // w tym przypadku musi byc tak, jak 1 wieksza to -, jak druga to +
    }
}
