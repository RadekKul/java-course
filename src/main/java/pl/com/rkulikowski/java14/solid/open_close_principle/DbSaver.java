package pl.com.rkulikowski.java14.solid.open_close_principle;

public class DbSaver implements Saver<BetterSecret> {   // zapisuje do dataBase
    String user;
    String password;
    String connectUrl;
    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving to db");
    }
}
