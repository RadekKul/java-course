package pl.com.rkulikowski.java14.solid.interface_segregation;

public class HinduskiWrapperEngine implements RunEngine {

    HinduskiEngine hinduskiEngine = new HinduskiEngine();

    public HinduskiWrapperEngine(HinduskiEngine hinduskiEngine) {
        this.hinduskiEngine = hinduskiEngine;
    }

    // sekwencja do wystartowania
    @Override
    public void start() {
        hinduskiEngine.h1();
        hinduskiEngine.h2();
    }
// sekwencja do zastopowania
    @Override
    public void stop() {
        hinduskiEngine.h5();
        hinduskiEngine.h7();

    }
}
