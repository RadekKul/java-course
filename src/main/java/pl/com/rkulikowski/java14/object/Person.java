package pl.com.rkulikowski.java14.object;

public class Person {

    public static int numberOfPersons = 0;

    private String name;
    private String surname;
    private int age;
    private String animal;

    public void introducePerson(){
        System.out.println("Hi my name is: " + name + " " + surname + " and I'm " +age);
    }

    public static void somethingAboutPersons(){
        System.out.println("All people like math!!!");
    }

        // Musimy dać taki pusty Constructor zeby Java wiedziala ze domyslny constructor tez jest jakis, bo jezeli nadpisalismy Constructor (name, surname, age) to ona usunela domyslny bez danyhc()
    public Person(){
        numberOfPersons++; // numberofpersons= numberofpersons + 1
    }

    //Tworzymy Constructor

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPersons++; // musimy wszedzie dorzucic zeby kazdy Constructor zliczal liczbe ludzi
    }

    public Person(String name, int age,String animal){
        this.name=name;
        this.age=age;
        this.animal=animal;
        numberOfPersons++;
    }

    public static void printNumberOfPersons(){  // tworzymy staticiem bo dotyczy klasy a nie jednego obiektu
        System.out.println("Number of persons so far: " + numberOfPersons);
    }

    // To nie jest CONSTRUCTOR to jest metoda, która nic nie zwraca, a konstruktor zwraca
//    public void Person(){
//    }



}
