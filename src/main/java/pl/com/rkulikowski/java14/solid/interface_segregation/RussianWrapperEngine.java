package pl.com.rkulikowski.java14.solid.interface_segregation;

public class RussianWrapperEngine implements RunEngine {

    RussianEngine russianEngine;

    public RussianWrapperEngine(RussianEngine russianEngine) {
        this.russianEngine = russianEngine;
    }

    @Override
    public void start() {
        russianEngine.dawaj();
    }

    @Override
    public void stop() {
        russianEngine.dawaj();
        russianEngine.dawaj();
    }
}
