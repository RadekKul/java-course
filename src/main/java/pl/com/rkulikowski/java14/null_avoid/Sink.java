package pl.com.rkulikowski.java14.null_avoid;

public class Sink {

    private String label;

    public Sink(String label) {
        setLabel(label);        // to jest taka opcja ze i tak setLabel sprawdza czy to nie jest null wiec w konstruktorze mozemy sobie tak zapisac
    }

    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLabel(label);      // i juz jestesmy pewni ze nikt nam nie da nic innego niz String
    }

    // metoda sprawdzajaca czy nie przekazano nulla
    private String validateLabel (String label){
        if(null==label){
            throw new IllegalArgumentException("label cannot be null"); // nie musimy deklarowac ze rzuca,b bo to wyjatek Runtime
        }
        return label;
    }

}
