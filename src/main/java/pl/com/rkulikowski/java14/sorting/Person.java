package pl.com.rkulikowski.java14.sorting;

public class Person implements Comparable<Person> {  // musimy zaimplementowac zeby dobrze sortowac i nadpisac metode compareTo bo przyjmuje on Object a my chcemy konkretny Typ Person, dlatego dopisujemy <T>
    // zeby odrazu zastrzec typ jaki mozna wpisywac
    private String name;
    private String surname;
    private int age;
    private int iq;
    private double income;
    private double height;
    private double shoeSize;


    public Person(String name, String surname, int age, int iq, double income, double height, double shoeSize) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.income = income;
        this.height = height;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public double getIncome() {
        return income;
    }

    public double getHeight() {
        return height;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", income=" + income +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                '}';
    }

    // compareTo - jest to jeden domyslny sposob sortowania dla klasy, jak checmy miec wiecej to robimy Comparatory

    @Override
    public int compareTo(Person o) {    // metode wolamy na rzecz obiektu(this.) ktory chcemy porownac z obiektem ktory wpiszemy jako parametr (o.).

        // to samo co nizej mozemy zapisac prosciej

        return o.iq - iq;   // np o.iq = 100, iq = 120, wychodzi liczba na minusie, wiec dostajemy wiadomosc ze to co jest porownywane do o. ma zostac pierwsze



       /* // przez te zaleznosci -1, 0, 1 latwiej jest sortowac, a jest to zaleta Interfejsu Comparable
        // this.iq odnosi sie do obiektu na ktorym wywolamy compareTo, a o.iq do osoby ktory przekazemy jako parametr
        if(this.iq > o.iq){
            // zwracamy -1 kiedy osoba o większym iq ma stać przed osobą która ma mniejsze iq od niej, dlatego ze chcemy od najwiekszego do najmniejszego
            return -1;
        } else if(this.iq < o.iq) {
            // zwracamy 1 kiedy osoba o osoba na ktorej wywolujemy ma mniejsze iq od parametru, po to zeby stanela za ta osoba "o".
            return 1;
        }
        // zwracamy 0 kiedy obiekty maja takie same iq, czyli jest nam obojetne ktory bedzie wyswietlony wczesniej
        else return 0;
    }*/
    }
}
