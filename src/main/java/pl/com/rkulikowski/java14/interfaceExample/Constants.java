package pl.com.rkulikowski.java14.interfaceExample;

public interface Constants {
    int numberOfWheels = 4;  // kompilator mowi ze public static final nie jest potrzebne przy stalych, bo one maja zawsze TYLKO taki typ, nie mozna dac private w interface
    final int getNumberOfWheels1 = 4;
    public final int getNumberOfWheels2 = 4;
    public static final int getNumberOfWheels3 = 4;

    public abstract int doIt(); // tutaj w metodzie tez nie jest to potrzbene public abstract (bo kazda metoda w interfejsie jest public abstract), static i final tutaj nie uzywamy wcale.
}
