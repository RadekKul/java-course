package pl.com.rkulikowski.java14.contynentConstructor;

public class Australia extends Contynent {

    public Australia(){
        this("kangaroo");

        System.out.println("Australia - first constructor");
    }

    public Australia(String animal){
        super("Poland");

        System.out.println("Australia - second constructor " + animal);
    }
    {
        System.out.println("Australia - first init block");
    }
    {
        System.out.println("Australia - second init block");
    }
    static {
        System.out.println("Australia - first static block");
    }
    static {
        System.out.println("Australia - second static block");
    }
}
