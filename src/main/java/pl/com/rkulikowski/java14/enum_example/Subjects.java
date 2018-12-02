package pl.com.rkulikowski.java14.enum_example;

public enum Subjects {  // typy wyliczeniowe moga implementowac interfejsy

    MATH(10),
    BIOLOGY(8),
    GEOGRAPHY(6),
    ART(7);


    private int numberOfHours;

    private Subjects(int numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours(){
        return numberOfHours;
    }
}
