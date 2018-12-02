package pl.com.rkulikowski.java14;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        setSurname(surname);
        // wpisujemy setAge(age) zeby miec napisy wygenerowane w tej metodzie, czyli zeby sprawdzala nam czy ktos nie wpisal za duzo lub za malo lat
        setAge(age);
    }

    // Stworzymy nowy konstrukor w którym bedzie mozna podac tylko dwie dane, gdyby ktos nie chcial podawac wieku, a program i tak zadziala

    public Person(String name, String surname) {
        this.name = name;
        //jezeli chcielibysmy zeby było stale nazwisko to tutaj zamiast this.surname = surname, trzeba wpisac this.surname = "Kowalski"
        setSurname(surname);
    }

    public static void main(String[] args) {


        Person person1 = new Person("Jan", "Kowalskioassidhflsuhfladlah");

        Person person2 = new Person("Michał", "Marcinkowski", 110);

        Person person3 = new Person("Radek", "Kulikowski", 24);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person3.getName().length());
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

        if (surname.length() > 15) {
            System.out.println(surname + " - Zbyt długie nazwisko, skrócone naziwsko do 20 znaków");
            this.surname = surname.substring(0, 20);

        } else {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println(getName() + "Wpisałeś zbyt małą wartość. Wiek ustawiony na 0");
        } else if (age > 100) {
            this.age = 100;
            System.out.println(getName() + " Wpisałeś zbyt dużą wartość. Wiek ustawiony na 100");
        } else {
            this.age = age;
            System.out.println("Wiek " + getName() + " ustawiony na " + getAge());
        }
    }

    @Override
    public String toString() {

        if (age != 0) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '}';
        } else {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }


}
