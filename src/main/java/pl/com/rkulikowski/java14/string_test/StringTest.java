package pl.com.rkulikowski.java14.string_test;

public class StringTest {

    // przez tą komende podswietlamy komentarz, to co mamy do zrobienia
    //TODO: show references
    public static void main(String[] args) {
        String name = "Radek";
        String anotherRadek = "Radek";      // to jest nadanie zmiennej literału, ten literał jest juz w tzw StringPoolu, wiec nie zabiera pamieci, tylko wskazuje na to samo co name, ale mozna je zmieniac swobodnie
        String theSame = name;
        String secondName = new String("Radek");    // to stworzenie zwyklego obiektu, nowy obszar w pamieci, bez korzystania ze StringPoola, gorsze bo zabiera duzo pamieci.
        String surname = "Kulikowski";
        String imieTrener = "Mariusz";

        System.out.println("My name: " + name);
        System.out.println("My surname: " + surname);
        System.out.println("Name, number of letters: " + name.length());
        System.out.println("Surname, number of letters: " + surname.length());

        System.out.println(imieTrener.charAt(6));
        // index in java counts from 0 to length -1 so Mariusz has the lenght:7 but indexs are from 0 to 6
        //System.out.println(imieTrener.charAt(7));
        System.out.println(imieTrener.charAt(1));
        System.out.println("My new surname: " + surname.substring(2));
        System.out.println(surname.substring(0,10)); // dalismy jeden znak wiecej wiec wyswietla wszystko
        System.out.println(surname.substring(0,9)); // dalismy od 0 do 9(ostatniego znaku ale ostatniego nie załącza, wiec zawsze dajemy +1)


        theSame = "something different";
        System.out.println("My surname:... " + name);
        System.out.println("My surname:... " + theSame);

        System.out.println("Replace: " + surname.replace('o','a')); //zamieniamy o na a w nazwisku
        System.out.println("Nazwisko: " + surname); // ale to byla tylko wartosc zwrocona, a stala surname sie nie zmienila!, wiec tu nazwisko bedzie poprawne, bez zamienionych liter


        //jezeli chcemy zapisac to jako nowe nazwisko to musimy stworzyc nowa referencje

        String newSurname = surname.replace('i','a');
        System.out.println("Nazwisko po zmianie liter: " + newSurname);

        // Łączenie Stringów w prymitywny sposób (nadpisywanie)

        String hello = "hello";
        System.out.println(hello + " javaaa");
        System.out.println(hello.concat(" javaaaaa"));  // to tez polaczenie typu String ze Stringeim, podobne do zwyklego +
        hello = hello + " java"; // nadpisanie
        System.out.println(hello);


        // kolejnosc dodawania String + int, zawsze leci od lewej do prawej, int + int = suma, String + int + int= najpierw suma String +int, i potem dopisze kolejny int
        System.out.println(5+6);    // wynik ok
        System.out.println("5 + 6: " + (5+6));      // wynik ok bo dzialanie w nawiasie
        System.out.println(5 + 6 + " = 5 + 6");     // wynik ok bo napierw int + int
        System.out.println("5 + 6: " + 5+6); // najpierw doda nam String"5+6" do 5 , i dopiero potem dolozy 6 do sklejonych elementów.

        System.out.println();
        System.out.println("J" + 7);
        System.out.println('J' + 7);        //jak wpisujemy litere/znak w ' ', to wybierze nam kod tego znaku z tablic UNICODE, z tego wynika ze J ma indeks 74, bo wyszlo 74+7=81
        // dla potwierdzenia, rzutujemy znak J na integer, zeby dowiedziec sie jaka jest wartosc pod J
        System.out.println((int)'J');






    }

}
