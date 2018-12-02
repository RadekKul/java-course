package pl.com.rkulikowski.java14.exception;

public class PersonIllegalArgument {

    private String name;
    private String surname;
    private int age;


    public PersonIllegalArgument(String name, String surname, int age) throws IllegalArgumentException {


        if(name==null || "".equals(name)){  // null dajemy przez == , a sprawdzanie czy nie jest pusty String przez equals
            throw new IllegalArgumentException("Wrong name: " + name);
        }
        if(surname==null || "".equals(surname)){
            throw new IllegalArgumentException("Wrong surname " + surname);
        }
        if(age<=0 || age>=100){
            throw new IllegalArgumentException("Wrong age " + age);
        }

        // to piszemy dopiero po wyrzuceniu wyjatkow zeby przechowywac tylko dobre informacje
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonIllegalArgument{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
