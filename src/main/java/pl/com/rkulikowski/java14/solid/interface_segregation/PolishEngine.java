package pl.com.rkulikowski.java14.solid.interface_segregation;

public class PolishEngine implements RunEngine {

    private StandardEngine standardengine;  // tu juz jest jakis silnik, ktory juz jest dostarczony i jego wrzucamy do swojej pralki i na nim wlasnie wywolujemy metody start itp, wiec tu nas nie obchodzi
    // jak to startuje i gdzie, wazne ze mozemy go wystartowac i zastopowac

    // polishEngine ma duzo wspolnego z StandardEngine, tak jakby na nim bazuje , a chinski engine w ogole nie ma nic ze standardowym silnikiem StandardEngine, bo oni go nie znaja

    public PolishEngine(StandardEngine standardengine) {
        this.standardengine = standardengine;
    }

    @Override
    public void start() {
        standardengine.start(); // delegacja, polishengine nie umie tego zrobic wiec wola metode z innego miejsca zeby to zrobic
    }

    @Override
    public void stop() {
        standardengine.stop();  // tutaj to samo co wyzej
    }
}
