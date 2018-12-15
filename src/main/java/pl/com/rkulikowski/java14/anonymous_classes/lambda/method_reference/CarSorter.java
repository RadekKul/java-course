package pl.com.rkulikowski.java14.anonymous_classes.lambda.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarSorter {

    // mamy przyjac 2 samochody i posortowac je sorterem z interface sorter
    public static List<Car> sortCarsByModel(Car first, Car second, Sorter sorter){

        List<Car> result = new ArrayList<>();

        int order = sorter.sort(first.getModel(), second.getModel()); // tu nam zwroci -1,0,1 zaleznie czy firstmodel bedzie mniejszy czy wiekszy alfabetycznie
        // tutaj zrobimy dodawanie do listy w odpowiedniej kolejnosci

        if(order<0){    // w tym wypadku first jest mniejszy alfabetycznie od second wiec ustawiamy je pokolei
            result.add(first);
            result.add(second);
        }else{  // tutaj jest rowny badz wiekszy wiec zamieniamy kolejnosc
            result.add(second);
            result.add(first);
        }

        return result;

        //return Collections.emptyList();
    }
}
