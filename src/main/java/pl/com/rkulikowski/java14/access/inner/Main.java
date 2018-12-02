package pl.com.rkulikowski.java14.access.inner;

import pl.com.rkulikowski.java14.access.Person;     // intelliJ sam zaimportował nam klase z góry, bo zrozumial ze jestesmy w package nizej

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Jan", "Kowalski", -2);

        System.out.println(me); // system SOUT zawsze wywoluje toString z danego obiektu
        me.setAge(-20);
        System.out.println(me); // działa nadal zeruje na 0
       // me.age = -20;              // poniewaz age jest public to moze sie do niego kazdy dostac i przez to mozna ustawic nawet taka glupote jak -20 lat, a setAge tego nie sprawdzi bo nie wywolujemy tego
       // System.out.println(me);      // jak zmienilismy to na private to juz nie mozemy tego latwo zmienic.

       // me.checkAge();        // nie uzyjemy tej metody bo jest prywatna w clasie Person.

        //me.secret = "my secret"; // wygląda na to że mozemy zmienić zmienną, która nie ma public/private/protected, a jak dodalismy jeden package nizej to juz sie nie kompiluje.
                                // bo poza pakietem nie mozemy odczytac danej tego typu poza pakietem stworzonym,.

        //me.secondSecret =       //nawet go tutaj nie widzimy bo jest protected

        Child child = new Child();
      // child.secondSecret;  // robimy nowe dziecko w mainie, ale dziecko, które odziedziczyło od innej klasy secondSecret, nie przekazuje zmiennych protected dalej, mozna je tylko w srodku Child uzywać.

    }
}
