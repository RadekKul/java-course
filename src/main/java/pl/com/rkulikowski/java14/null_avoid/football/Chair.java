package pl.com.rkulikowski.java14.null_avoid.football;

public class Chair {

    private NumberOfChair number;

    public Chair(NumberOfChair number) {
        this.number = number;
    }

    public NumberOfChair getNumber() {
        return number;
    }

    public void setNumber(NumberOfChair number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }
}
