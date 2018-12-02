package pl.com.rkulikowski.java14.abstract_class;

public class Ferrari extends Car {  // jest to pierwsza klasa "konkretna" bo abstrakcyjnej, WIEC MUSI ZAWIERAC METODY ABSTRAKCYJNE z klas abstrakcyjnych po ktorych dziedziczy.

    @Override
    public void speedUp() {     // musimy tu uzyć tą metode, bo jest abstrakcyjna w klasach abstrakcyjnych powyzej, getNumberOfWheels jest nieabstracyjna wiec jej nie musimy uzywac
        System.out.println("NO!!!!!");
    }
}
