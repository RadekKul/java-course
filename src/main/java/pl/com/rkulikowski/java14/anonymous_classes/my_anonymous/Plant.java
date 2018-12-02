package pl.com.rkulikowski.java14.anonymous_classes.my_anonymous;

public abstract class Plant {

    public abstract  void grow();
    public abstract  void smell();
    public abstract  void wilt();

    public void gogo(){     // tej metody nikt nie musi uzyc bo nie jest abstrakcyjna
        System.out.println("googogo");
    }

}
