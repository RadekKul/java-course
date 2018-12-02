package pl.com.rkulikowski.java14.exception;

public class MyExceptionThrower {

    public void throwMyException() throws MyException{  // zeby wyrzucic wyjatek musimy przypisac do swojej metody throws + jaki Excepiton
        System.out.println("throwMyException() running!");
        //throw new MyException();    // skoro wyjatek to obiekt, to musimy stworzyć nowy wyjatek jako obiekt, jezeli zakomentujemy to to try nie znajdzie wyjatku
        //System.out.println("bleble"); // tutaj juz nie pozwala nic wpisac, bo to i tak sie nie wykona skoro linijke wyzej wywalamy wyjatek.

        throw new MyException("haahaha"); /// mozemy tak tez napisac i taki nam da wyjatek
    }
}
