package pl.com.rkulikowski.java14.solid.interface_segregation;

public final class ChineaseEngine { // tej klasy sie nie da zmienic bo zakladamy ze nic wiecej o nim nie wiemy.

    // chinczycy nie znaja w ogole silnika standardowego tj StandardEngine, wiec z niego nie korzystaja.

    // po chinsku nazwy metod
    // start
    public void startInChinease(){
        System.out.println("startInChinease()");
    }

    //stop
    public void stopInChinease(){
        System.out.println("stopInChinease");
    }
}
