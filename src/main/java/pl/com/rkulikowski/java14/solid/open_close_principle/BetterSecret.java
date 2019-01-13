package pl.com.rkulikowski.java14.solid.open_close_principle;

public class BetterSecret {

    private final String mySecret;      // sekretu nie da sie zmienic, bedzie mozna zmienic savera zeby zapisywal w roznych miejscach dlatego robimy metode setSecret
    private Saver<BetterSecret> secretSaver;

    //ten save bedzie lepiej zapisywal niz ten w zwyklym secrecie
    public void save() {
        secretSaver.save(this); // this wskazuje tutaj na mySecret,
    }

    public BetterSecret(String mySecret, Saver secretSaver) {
        this.mySecret = mySecret;
        this.secretSaver = secretSaver;
    }

    public String getMySecret() {
        return mySecret;
    }

    public Saver getSecretSaver() {
        return secretSaver;
    }

    public void setSecretSaver(Saver<BetterSecret> secretSaver) {   // pozwalamy zmieniac sciezke zapisu
        this.secretSaver = secretSaver;
    }

    @Override
    public String toString() {
        return "BetterSecret{" +
                "mySecret='" + mySecret + '\'' +
                ", secretSaver=" + secretSaver +
                '}';
    }
}
