package pl.com.rkulikowski.java14.solid.single_object_responsibility;

public class Dog {

    private String name;
    private String breed;
    private double weight;
    private String owner;

    public Dog(String name, String breed, double weight, String owner) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }
}
