package pl.com.rkulikowski.java14.generic;

import pl.com.rkulikowski.java14.equals_and_hashcode.Person;

import java.util.Map;

public class HolderTest {

    public static void main(String[] args) {

        ObjectHolder holder = new ObjectHolder();   // to jest klasa ktora my stworzylismy, jest tez taka w javie wiec nie mozna tego mylic
        holder.setSecret((new Person("M","P",24)));

        //processHolder(holder); // to jest metoda z dolu ale ona zaklada ze wszystko co przekazemy jest typu String, wiec stworzymy genericHolder ktory bedzie rozroznial typy i przyjmowal wszystko

        //GenericHolder a;
        //GenericHolder<Object> a;  // mozna by i tak zapisac ale wszystko byloby objectem, po wyjeciu zmiennej trzeba byloby ją rzutować na potrzebny typ.

        // tu poprawnie

        GenericHolder<String> stringHolder = new GenericHolder<>();
        // GenerciHolder stringHolder = new GenericHolder   // najprew tworzy nam pudelko na sam stringi
        stringHolder.setSecret("sekret");
        // String stringHolder = (String) secret -- a tu automatycznie rzutuje nam sekret na String, zebysmy mogli go ulozyc w naszym pudeleczku
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHolder = new GenericHolder<>(); // w taki sposob mozemy przechowywac rozne typy, i wtedy nam inteljj juz podpowiada co bedzie brac/co bedzie zwracac
        personHolder.setSecret((new Person("R","K",24)));   // mozemy dodac secret typu person
        System.out.println(personHolder.getSecret());       // mozemy go tez pobrac

        GenericHolder allHolder = new GenericHolder();      // jezeli nie damy <> to mozna wpisac tam wszystkie typy, String, Integer, Person, Animal - wszystko!

        allHolder.setSecret("Dodałem String");      // dodalismy dla przykladu String
        System.out.println(allHolder.getSecret());

        allHolder.setSecret(new Person("M","M",23));    // zmienilismy secret na Person i dziala, nadmienilo String na Person bez problemu
        System.out.println(allHolder.getSecret());

        //Podobnie mozemy tworzyc jak w mapach, niezaleznie od typu, mozemy uzyc tych metod co w generic są

        Map<String,Person> namesOverPerson; // tu tez są generyki bo Key mozemy wpisac jaki chcemy typ, Value tez jaki chcemy typ

    }

    public static void processHolder (ObjectHolder holder){ // przy takim zalozeniu, nasz objectHolder przyjmuje wszystkie obiekty (czyli wszystko) problem jest tylko z rzutowaniem
        String secret = (String) holder.getSecret();    // tutaj wiemy ze przyszedl String, gorzej jakby przyszedl jakis int czy cos, wiec lepsza jest metoda GenericHolder ktora przechowuje wszystkie typy.
    }

}
