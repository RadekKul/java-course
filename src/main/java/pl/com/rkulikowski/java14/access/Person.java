package pl.com.rkulikowski.java14.access;

public class Person {
    private String name;
    private String surname; //jak damy private to wiemy ze jest bezpieczenie i ze nikt tego nie moze zmienic poza klasą.
    //public String surname;
    private int age;
    //public int age;


    String secret;  // jezeli nie ma modyfikatora to java stosuje tzw/ dostęp pakietowy.

    protected String secondSecret;// działa podobnie jak package private (dostep pakietowy - bez przedrostka), ALE

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);        // wywoulejmy sobie tutaj zeby przypisywal wiek do obiektu i dodatkowo sprawdzi czy ten wiek nie jest mniejszy od 0, wiec robi wiecej niz this.age=age
    }

    public Person(){
        // empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = 0;
            return;         // musi zatrzymac petle bo inaczej pojdzie do this.age = age i nadal bedzie przypisywac nawet ujemny wiek
        }
        this.age = age;
    }

    @Override           // Nadpisanie jakiejs metody tylko dla tego pliku
    public String toString() {      // reporezentacja stanu calego obiektu
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    private boolean checkAge (int age){
        if(age>=0)
            return false;
        return true;

    }
}
