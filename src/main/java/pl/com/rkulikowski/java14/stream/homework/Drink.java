package pl.com.rkulikowski.java14.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    private String name;
    private boolean sugarFree;
    private List<String> ingredients;
    private boolean isOnPromo;

    public Drink(String name, boolean sugarFree, List<String> ingredients, boolean isOnPromo) {
        this.name = name;
        this.sugarFree = sugarFree;
        this.ingredients = ingredients;
        this.isOnPromo = isOnPromo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isOnPromo() {
        return isOnPromo;
    }

    public void setOnPromo(boolean onPromo) {
        isOnPromo = onPromo;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", sugarFree=" + sugarFree +
                ", ingredients=" + ingredients +
                ", isOnPromo=" + isOnPromo +
                '}';
    }
}
