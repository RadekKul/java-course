package pl.com.rkulikowski.java14.generic.method;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Double income;

    public Person(String name, String surname, Integer age, Double income) {

        validate(name, surname, age);   // teraz mozna wrzucic genericValidate tutaj i sprawdzi nam konstruktor wpisane rzeczy zanim w ogole dojdzie do rpzypisania, ale to jest slabe wyjsice
        // bo nie zablokujemy w taki sposob seterow, bo do nich bedie potrzebny kolejny validator, tez generyczny ale pojedynczy, jak w BOX, wiec ostatecznie dwa nam wyjda (znow moze byc o tej samej nazwie)
        // i jest to zrobione nizej, jeden validator w <T,U>

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.income = income;
    }

    // 3 parametry, dwa takie same,jeden inny. Sprawdzamy czy nie sa nullami

    private static <T,U> void validate(T name,T surname,U age){
        if (name==null || surname == null || age == null){
            throw new IllegalArgumentException("Cannot be null, Goodbye!!");
        }
    }

    private <T> T validate(T value){
        if (value == null){
            throw new IllegalArgumentException("Cannot be null, Goodbye!!");
        }
        return value;
    }


    public static void main(String[] args) {
        validate("Radek", "Kul", null);



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validate(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = validate(surname);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = validate(age);
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = validate(income);
    }
}
