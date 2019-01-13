package pl.com.rkulikowski.java14.solid.interface_segregation;

public class ChineaseWrapperEngine implements RunEngine {

    ChineaseEngine chineaseEngine;  // tutaj tez tworzymy tylko chinski silnik i w tej klasie przypisujemy metody ktore beda go uruchamiac
    // i ponizej uruchamiamy wlasnie start i stop w chinskich


    public ChineaseWrapperEngine(ChineaseEngine chineaseEngine) {
        this.chineaseEngine = chineaseEngine;
    }

    @Override
    public void start() {
        chineaseEngine.startInChinease();
    }

    @Override
    public void stop() {
        chineaseEngine.stopInChinease();
    }
}
