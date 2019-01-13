package pl.com.rkulikowski.java14.solid.interface_segregation;

public class WashMachine {

    private RunEngine engine; // pralka musi miec silnik wiec dodajemy obiekt interfejus, a ten interfejs bedzie mial pod spodem klocki ktrymi beda inne silniki i w  nich bedziemy mogli spokojnie
    // sobie wsyzstko zmieniac a tutaj wywolujemy zawsze w ten sam sposob. Dodatkowo nikt nie wie w jaki sposob tamte silniki dzialaja bo te metody sa ukryte
    // ich opisy wyswietlane sa tylko dlatego ze chce wiedziec co pokolei sie wykonuje

    public WashMachine(RunEngine engine) {
        this.engine = engine;
    }

    public void beginWash(){
        System.out.println("beginWash()");
        engine.start();
    }

    public void endWash(){
        System.out.println("endWash()");
        engine.stop();
    }

}
