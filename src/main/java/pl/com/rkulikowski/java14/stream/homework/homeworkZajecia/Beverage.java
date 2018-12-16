package pl.com.rkulikowski.java14.stream.homework.homeworkZajecia;

import java.util.ArrayList;
import java.util.List;

public class Beverage {

    private List<Ingredient> ingredientList = new ArrayList<>();

    private String beverageName = "";

    public Beverage( String beverageName,List<Ingredient> ingredientList) {
        this.beverageName = beverageName;
        this.ingredientList.addAll(ingredientList);  // to  nam zapobiegnie zmianie listy ingredients kiedy damy ta sama liste do dwoch napojow, wtedy jak w jednym zmienisz to i w drugim sie zmieni a to blokuje
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "ingredientList=" + ingredientList +
                ", beverageName='" + beverageName + '\'' +
                '}';
    }
}
