package pl.com.rkulikowski.homework.zad7;

public class Person {

    private String imie;
    private String nazwisko;
    private int wiek;
    private char plec;
    private int wzrost;

    public Person(String imie, String nazwisko, int wiek, char plec, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.wzrost = wzrost;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public char getPlec() {
        return plec;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }
}
