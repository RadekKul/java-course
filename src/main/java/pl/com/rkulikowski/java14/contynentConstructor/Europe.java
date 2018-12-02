package pl.com.rkulikowski.java14.contynentConstructor;

public class Europe extends Contynent {

    public Europe(){
        //super() - zawsze domyslnie wiec tutaj wywola sie konstructor bezargumentowy z Contynentu
        // tutaj wykonywane są init blokci z Europe
        System.out.println("Europe - First Constructor");
    }
    public Europe(String dish){
        System.out.println("Europe - Second Constructor - " + dish);
    }
    static {
        System.out.println("Europe - First static block");
    }
    static{
        System.out.println("Europe - Second static block");
    }
    {
        System.out.println("Europe - First init block");
    }
    {
        System.out.println("Europe - Second init block");
    }
}
