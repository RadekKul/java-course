package pl.com.rkulikowski.java14;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    // ustawiamy taki konstruktor żeby jak ktos nie wpisze nic to Kot przyjmie imie LEON, mozna tez by wywolać tutaj sysout ze "nie podales imienia kota
    public Cat() {
        System.out.println("Nie podałes imienia kota, przyporządkowano imie : Leon");
        this.name = "Leon";
    }

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
    }
}
