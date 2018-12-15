package pl.com.rkulikowski.java14.null_avoid.football_with_optional;

public class Chair {

    private NumberOfChair number;

    public Chair(NumberOfChair number) {
        this.number = validate(number);
    }

    public NumberOfChair getNumber() {
        return number;
    }

    public void setNumber(NumberOfChair number) {
        this.number = validate(number);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }

    // znaowu validujemy tutaj zeby zabezpieczyc przed wplynieceim nulla przy wpisywaniu set lub w konstruktorze

    public NumberOfChair validate(NumberOfChair number){
        if(number==null){
            throw new IllegalArgumentException("Number of Chair cannot be null");
        }

        return number;
    }
}
