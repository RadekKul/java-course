package pl.com.rkulikowski.java14.stream;

public class Country {

    private String name;
    private long numberOfPeople;
    private double area;
    private double avaragePayCheck;

    public Country(String name, long numberOfPeople, double area, double avaragePayCheck) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.area = area;
        this.avaragePayCheck = avaragePayCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAvaragePayCheck() {
        return avaragePayCheck;
    }

    public void setAvaragePayCheck(double avaragePayCheck) {
        this.avaragePayCheck = avaragePayCheck;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", area=" + area +
                ", avaragePayCheck=" + avaragePayCheck +
                '}';
    }
}
