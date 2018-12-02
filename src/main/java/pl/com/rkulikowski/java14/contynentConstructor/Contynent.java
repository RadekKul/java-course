package pl.com.rkulikowski.java14.contynentConstructor;

public class Contynent {

    public Contynent(){
        System.out.println("Contynent - first constructor");
    }

    public Contynent(String country){
        this();
        System.out.println("Contynent - second constructor " + country);
    }
    {
        System.out.println("Contynent - first init block");
    }
    {
        System.out.println("Contynent - second init block");
    }
    static {
        System.out.println("Contynent - first static block");
    }
    static {
        System.out.println("Contynent - second static block");
    }
}
