package pl.com.rkulikowski.java14.exception.network;

import java.util.Random;

public class StockExchange {

    // constructor StockExchangeCreationException
    // ReadDataException
    // Random - %2

    // Tworzymy dwa rodzaje błedów
    // Stworzylism StockExchange zeby nas podlaczal do gieldy(robil obiekt) i czytal dane (readData), losowosc wyrzucenia wyjatku w obydwu przypadkach to przedzial 100 liczb i ich parzystosc/nieparzystosc

    Random random = new Random();

    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();  // probujemy tworzyc obiekt, sprawdzajac czy sie powiedzie, czy nie wyskoczy warunek w konstruktorze
        //Jesli udalo sie utworzenie tego obiektu tzn ze mamy polaczenie do internetu wiec dopiero teraz idziemy dalej

        // to jest metoda ktora lapie Runtime, mimo ze nie mielismy ich lapac, ale chodzi o to ze to sa sytuacje wyjatkowe, bo chcemy dostac dane tylko jak sie powiedzie, jak nie to nic nam nie przypisz
        // wyswietli ze Dane sa rowne"" - w niektorych wiec sytuacjach lapiemy nawet Runtime bo sa to sytuacje wyjatkowe a nie chcemy robic tego typem Exception bo musielibysmy go w kazdej metodzie
        // przerzucac (throws) a tak to korzystamy z Runtime i on sie sam przekazuje dalej az ktos go rozwiaze
        String readData = null;
        try{
            stockExchange.readData();
            System.out.println("after");
        } catch (ReadDataException exc){
            readData = "";
        }finally {
            System.out.println("To wykona się zawsze, nawet jak jest wyjątek");
        }

        System.out.println(stockExchange.readData());   //  wywolujemy metode i chcemy zeby wypisalo dane, jezeli nie bedzie problemow i warunkow do dostaniemy dane w konsoli
    }

    public StockExchange() throws StockExchangeCreationException {  // w konstruktorze, jezeli nie ma problemu to obiekt zostaje utworzony, jezeli nie to rzuca nam wyjatek

        int x = random.nextInt(99) % 2;
        if (x == 1) {
            throw new StockExchangeCreationException("Network connection error!");
        }
    }

    public String readData() throws ReadDataException{      // w metodzie zawieramy tez losowosc, jezeli nie ma wyjatku , to zwracamy dane, jezeli jest problem to wyskoczy wyjatek.
        if(random.nextInt(99)%2 ==1){
            throw new ReadDataException("read data from server has failed!");
        }
        return "data";
    }

}
