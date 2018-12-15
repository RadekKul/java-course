package pl.com.rkulikowski.java14.stream.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<String> colaIngredients = Arrays.asList("Sugar", "Water", "Colourant");
        List<String> colaZeroIngredients = Arrays.asList("Aspartame", "Water", "Colourant");
        List<String> nuttyMusIngredients = Arrays.asList("Chocolate", "Nuts");
        List<String> milkMusIngredients = Arrays.asList("Chocolate", "Nuts", "Milk");

        Drink cola = new Drink("Cola", false, colaIngredients, true);
        Drink colaZero = new Drink("Cola Zero", true, colaZeroIngredients, false);
        Drink nuttyMus = new Drink("Mus with Nuts", false, nuttyMusIngredients, true);
        Drink milkMus = new Drink("Milk mus", false, milkMusIngredients, false);

        List<Drink> drinks = Arrays.asList(cola, colaZero, nuttyMus, milkMus);


        System.out.println(getDrinksOnPromoWithoutNutts(drinks));

    }

    private static List<Drink> getDrinksOnPromoWithoutNutts(List<Drink> drinks) {

        return drinks.stream()
                .filter(drink -> !drink.getIngredients().contains("Nuts") && drink.isOnPromo())
                .collect(Collectors.toList());
    }
}