package pl.com.rkulikowski.java14.solid.open_close_principle;

public class FileSaver implements Saver<BetterSecret> { //zapisuje do pliku
    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving file...");
    }
}
