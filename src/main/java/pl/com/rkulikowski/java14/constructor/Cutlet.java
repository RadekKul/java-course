package pl.com.rkulikowski.java14.constructor;

public class Cutlet {

    private Cutlet(){
        System.out.println("Cutlet - Private Constructor");
    }

    private Cutlet(String addition){
        System.out.println("We made Cutlet with: " + addition);

    }
    private Cutlet(String addition, String onionKind){
        System.out.println("We made Cutlet with: " + addition + " which is: " + onionKind);

    }

    public static Cutlet giveMeNewNormalCutlet(){   // Cutlet to typ jaki ma zwrocic metode. Te metody nazywane są metodami fabrycznymi - tworzacymi za nas obiekty
        return new Cutlet();
    }

    public static Cutlet giveMeCoutletWithOnion(){    // metody fabryczne działaja na rzecz klasy, wykonują obiekt zeby
        return new Cutlet("onion");
    }
    public static Cutlet giveMeCoutletWithGrilledOnion(){    // metody fabryczne działaja na rzecz klasy, wykonują obiekt zeby
        return new Cutlet("onion","grilled");
    }
}
