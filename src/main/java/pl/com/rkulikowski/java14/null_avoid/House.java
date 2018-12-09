package pl.com.rkulikowski.java14.null_avoid;

import java.util.Optional;

public class House {

    private Bathroom bathroom;

    public House(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public House() {

    }


    @Override
    public String toString() {
        return "House{" +
                "bathroom=" + bathroom +
                '}';
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }
}
