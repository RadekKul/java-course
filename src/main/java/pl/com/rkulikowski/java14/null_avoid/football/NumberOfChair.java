package pl.com.rkulikowski.java14.null_avoid.football;

public class NumberOfChair {

    int number;

    public NumberOfChair(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberOfChair{" +
                "number=" + number +
                '}';
    }
}
