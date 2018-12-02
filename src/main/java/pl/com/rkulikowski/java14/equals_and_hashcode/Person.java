package pl.com.rkulikowski.java14.equals_and_hashcode;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // this oznacza ten obiekt na rzecz ktorego wywolalismy equals. , this == o -sprawdza czy przekazana referencja "o" jest dokladnie ta na ktorej robimy equals
        if (o == null || getClass() != o.getClass()) return false; // sprawdza czy nikt nie przyslal nula, lub czy nie przyslal obiektu z calkowicie innej klasy, jezeli tak to false odrazu.

        Person person = (Person) o; // dopiero w tym momencie (po sprawdzeniu tego co wyzej) mozemy rzutowac referencje ktora porownujemy, na obiekt typu person, zeby sprawdzic ich dokladna zawartosc
                            // - znak zapytania (?) to tzw operator trojargumentowy - boolean ? if true zrob to co przed :, jesli false zrob to co po :
                            // rzutujemy na Person bo przyszedl obiekt typu Object "o" i z niego musimy zrobic obiekt Person "o" zebysmy mogli dalej porownywac dane.

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false; // jezeli imie rowne null, !-zaprzeczenie, zrob imie wskazane jest rozne od person.name, jezeli to jest rozne, to
        // ma wartosc true wiec wychodzimy z petli i zwracamy false, jezeli w warunku name!=null, jest false, przechodzimy do person.name !=null, i znowu jezeli imie jest rozne od null, dostajemy true,
        //wiec wychodzimy z petli i returnujemy false. Jezeli ktorys z warunkow bedzie false, to wychodzimy z petli, bez zwracania false, czyli idziemy dalej.

        // to jest ta sama linijka co wyzej, rozpisana na if else - lepiej zrozumiec ale duzo wiecej zajmuje
      /*  if(name !=null){
            if(!name.equals(person.name))
                return false;
        } else{
            if(person.name !=null);
            return false;
        }*/

      // tu przechodzimy dalej jezeli w powyzszym ifie wyszlo false, czyli nie zwrocilismy "return false".
        return surname != null ? surname.equals(person.surname) : person.surname == null; // ogolnie metoda jest typu boolean, wiec ostatecznie mamy dostac true or false przy porownywaniu
        // jezeli wiec ta linijka wyjdzie nam true, to dostaniemy true ostatecznie, dlatego tutaj juz nie zaprzeczamy warunkom surname.equals(person.surname) i person.surname == null, tak
        // jak zaprzeczalismy wyzej przy name, bo tam potrzebowalismy odwrotynch wynikow zeby przy wyjsicu true w petli if dostac return false, a tu juz musimy ostatecznie dostac return true or false.

    }

    @Override
    public int hashCode() {     // hashCode liczymy z tych samych pol co equals, wazne zeby byl uniwersalny!. Jezeli wyjdzie equals wyzej to hashcode tez wyjdzie i dostaniemy numerek uniwersalny

        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0); // przemnaza sie przez mala liczbe pierwsza, to po prostu
        result = 31 * result + age;
        return result;

//       return 1; // moznaby i tak zapisac ale wtedy kazdy element mialby ten sam hascode i equals trudniej by mial szukac wsrod nich, identycznych obiektow, jezeli damy unikalne hashcody to equals ma latwiej.
    }
}
