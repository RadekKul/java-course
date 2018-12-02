package pl.com.rkulikowski.java14.anonymous_classes.my_anonymous;

public class Cactus extends Plant {


    @Override
    public void grow() {
        System.out.println("Cactus isn't growing");
    }

    @Override
    public void smell() {
        System.out.println("Cactus smells good");
    }

    @Override
    public void wilt() {
        System.out.println("Cactus is wilting");
    }
}
