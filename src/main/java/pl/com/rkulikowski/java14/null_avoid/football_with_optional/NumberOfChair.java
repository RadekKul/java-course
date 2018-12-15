package pl.com.rkulikowski.java14.null_avoid.football_with_optional;

public class NumberOfChair {

    private int number;

    public NumberOfChair(int number) {
        this.number = number;
    }

    public int getNumberOfChair() {
        return number;
    }

    public void setNumberOfChair(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberOfChair{" +
                "number=" + number +
                '}';
    }
}
