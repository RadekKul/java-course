package pl.com.rkulikowski.java14.solid.open_close_principle;

public class Main {

    // open clsoe - otwarty na rozszerzenia, zamknieta na zmiany.
    // wykonac to mozna za pomoca interfejsu, zeby nie wpisywac sciezki zapisu na sztywno, tylko zeby interfejs wybieral w zaleznosci od przekazanego obiektu, co ma robic
    // i to bedzie widac w better secret, bo secret przyjmuje na sztywno sciezke

    public static void main(String[] args) {
        Secret secret = new Secret("Nie lubie ananasa", "C:\\Users\\Radek\\Desktop\\sekret.txt");

        secret.save();

        // 2 implementacje Saver    - stworzylismy DbSaver i FileSaver
        // pierwsza zapis w pliku
        Saver<BetterSecret> fileSaver = new FileSaver();
        // druga zapis w bazie
        Saver<BetterSecret> dbSaver = new DbSaver();
        // trzecia na chmurze
        Saver<BetterSecret> cloudSaver = new CloudSaver();

        // uzycie sekretu na dwoch zapisach

        BetterSecret myBetterSecret = new BetterSecret("moj supertajny sekret",fileSaver);
        myBetterSecret.save();  // jesli wejdziemy w save to my nie widzimy tak naprawde gdzie sie to zapisze, bo tam jest przejscie do interfejsu i dopiero w dodatkowej classie widac co implemetnuje
        // tej klasy(BetterSecret) juz nie bedziemy modyfikowac, mozey tlyko dopisywac nowe classy ktore beda zapisywac w innych miejscach i to jest oszczedzanie kodu i czasu.

        myBetterSecret.setSecretSaver(dbSaver); // zmieniamy tylko klase zapisujaca nam sekret w danym miejscu i zapisujemy go ponownie
        myBetterSecret.save();  // po zmianie Saver-a i zapisaniu, dostaniemy juz zapis w dataBase

        myBetterSecret.setSecretSaver(cloudSaver);  // i tu znow zmieniamy miejsce zapisu, poprzez przypisanie nowego Savera do sekretu
        myBetterSecret.save();

    }

}
