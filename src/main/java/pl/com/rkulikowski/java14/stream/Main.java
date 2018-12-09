package pl.com.rkulikowski.java14.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // metoda Arrays.asList dodaje nam do listy
        List<Country> countries = Arrays.asList(
                new Country("Poland",40_000_000, 312,4000),
                new Country("Russia",100_000_000, 3111,3000),
                new Country("China",140_000_000, 500,4500),
                new Country("Ukraine",60_000_000, 122,5500),
                new Country("Holland",70_000_000, 232,6500),
                new Country("Spain",30_000_000, 552,2100)
        );

        getListOfRchCountries(countries,4200);

        getListOfPeople(countries,50_000_000);

        System.out.println(genericFilter(countries, country -> country.getAvaragePayCheck()>4_200));   // to jest pokazanie jak lamda moze sie przydac przy filtrowaniu, narzucamy filtr z lambdy ktory nam znajdzie ludzi zarabiajacych wiecej niz

        //mozemy wyniki przypisac do referencji i potem na niej tez cos dzialac
        List<Country> result2 = genericFilter(countries,country -> country.getNumberOfPeople()> 50_000_000);    // WAZNE zeby pamietac ze w lambdzie instrukcja to true/false
        System.out.println(result2);

        result2.forEach(country -> System.out.println(country));        // tu tez labda foreach, dla kazdego elementu z result2, zrob to samo, przyjdzie country, wypisz go


    }

    // metoda tworzaca liste krajow w ktorych zarabia sie wiecej niz minimalPayCheck
    public static List<Country> getListOfRchCountries(List<Country> countries, double minimalPayCheck){

        List<Country> result = new ArrayList<>();

        for (Country country: countries) {
            if(country.getAvaragePayCheck()>= minimalPayCheck){
                result.add(country);
            }
        }
        return result;
    }

    // tu zwraca liste krajów ktore maja wiecej niz wpisana liczba ludzi.
    public static List<Country> getListOfPeople(List<Country> countries, long minimalNumberOfPeople){

        List<Country> result = new ArrayList<>();

        for(Country country: countries){
            if (country.getNumberOfPeople()<= minimalNumberOfPeople){
                result.add(country);
            }
        }
        return result;
    }

    private static List<Country> filterByMinimalPeopleNumber(List<Country> countries, long minimalNumberOfPeople){

        return countries.stream()  // mozna to zalatwic za pomoca strumienia i lambdy, filter filtruje nam po tym po czym chcemy, i albo je wpuszcza albo nie
                .filter(country -> country.getNumberOfPeople() > minimalNumberOfPeople)    // filter przyjmuje tylko booleana, wiec musimy w lambdzie dac znak >, zeby bylo to wyrazenie typu boolean
                .collect(Collectors.toList());  // tu wywolujemy metode, ktora sama doda wszystki pozytywne wyniki do listy.


        // return Collections.emptyList(); // tak sie zaznacza jak bysmy chcieli zwrocic pusta liste, to jest pusta lista w javie do ktorej nic si enie da dodac, wiec bezpiecznie mozna to uzywac zamiast null
    }


    // przychodzi lista i przychodzi jakis filtr, wpuszczamy kraje do strumienia, nakladamy na niego filtr (predicate) ktory przyjdzie i te kraje ktore zostana zbieramy do listy
    private static List<Country> genericFilter (List<Country> countries, Predicate<Country> predicate){

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}
