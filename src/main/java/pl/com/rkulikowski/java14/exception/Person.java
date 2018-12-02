package pl.com.rkulikowski.java14.exception;

public class Person {

    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname, int age) throws WrongParameter {


        if(name==null || "".equals(name)){  // null dajemy przez == , a sprawdzanie czy nie jest pusty String przez equals
            throw new WrongParameter("Wrong name: " + name);
        }
        if(surname==null || "".equals(surname)){
            throw new WrongParameter("Wrong surname " + surname);
        }
        if(age<=0 || age>=100){
            throw new WrongParameter("Wrong age " + age);
        }

        // to piszemy dopiero po wyrzuceniu wyjatkow zeby przechowywac tylko dobre informacje
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
