package pl.com.rkulikowski.java14.null_avoid.football_with_optional;

// FootballClub -> Stadion -> Chair -> Number
// nie ma klubu pilkarskiego bez stadionu, ale stadion moze byc bez siedzen
// wiec Stadion nie jest nullem (bo jak jest klub to jest i stadion) i numberofchair tez nie jest nullem, bo jak juz jest krzeslo to musi miec numer

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        NumberOfChair number = new NumberOfChair(10);
        Chair chair = new Chair(number);
        Stadion stadionWithChair = new Stadion(chair);
        Stadion stadionWithoutChair = new Stadion(null);

        // jak sprobujemy tu stworzyc footballclub ze stadionem rownym null to nawet mi nie pozwoli bo zablokowalismy juz konstruktor

        //FootballClub real = new FootballClub(null);  // juz  w tym miejscu nam wywali wyjatek ze dalismy null, a z zalozenia bylo zeby nie moc dac tu null wiec wszystko ok


        FootballClub barcelona = new FootballClub(stadionWithChair);

        FootballClub realMadryt = new FootballClub(stadionWithoutChair);

        getChairNumber(barcelona);


        getChairNumber(realMadryt); // na to nic nie wyswietla bo przeciez nie ma krzesla wiec nasze opakowanie w ogole nie dochodzi do tego momentu.

    }

private static void getChairNumber(FootballClub footballClub){
    // pakujemy klub pilkarski do optionala zeby przejrzec czy nie ma Nulla

    // najzezdzamy z CTRL na .map lub .flatMap i dowiemy sie co dajemy i co dostajemy.

    // ten zapis z enterami moze byc mylacy, ale to wszystko to jest jeden dlugi kod, kazda .map odnosi sie do tego co zrobilismy w linijce wyzej, tylko byloby to mniej czytelne.

    // przyjmujemy footballClub  i opakowujemy
    Optional.ofNullable(footballClub)
    // pobieramy Stadion, nie jest on opcjonalny bo zalozylismy ze nie moze byc nullem, wiec zrobilismy oddzielna metode validate i tu tylko opakowujemy go w pudelko dlatego .map
            .map(footballClub1 -> footballClub1.getStadion())
    // pobieramy Chair, jest ono opcjonalne bo powiedzielismy ze krzeselka moga byc lub moze ich nie byc, skoro byly opakowane, to zeby nie pakowac znow to robimy .flatMap
            .flatMap(stadion -> stadion.getChair())
    // tutaj uruchamiamy getn=Number z klasy chair i wchodzimy do klasy numberofchair, nie jest on opcjonalny, tylko jezeli jest krzeslo to bedzie on zawsze, wiec zeby go opakowac robimy .map
            .map(chair -> chair.getNumber())
    // z klasy number of chair, wywolujemy metode getNumberOfChair i opakowujemy juz Integer, bo ta metoda zwraca nam juz inta
            .map(number -> number.getNumberOfChair())
    // skoro mamy juz opakowany Integer to wystarczy juz tylko sprawdzic czy cos jest w opakowaniu czy nie, za pomoca metody ifPresent i to wypisac
            .ifPresent(number -> System.out.println("Number of Chair in Stadium is: " + number));


    // wszystko co tu wyzej robimy jest uzaleznione od zalozen, zalozylismy ze klub MUSI miec stadion wiec validujemy odrazu sobie ze nie moze byc null, wiec nie musimy tego pakowac
    // potem zakladamy ze stadion nie musi miec krzesel, wiec to juz jest opcjonalne bo albo beda krzesla albo nie, dlatego optional odrazu w klasie Stadion
    // NumberOfChair jest zawsze kiedy jest krzeslo wiec w klasie Chair validujemy ze getNumber nie moze byc nullem, bo jezeli jest krzeslo to jest i numer
    // i w numberofchair classie juz tylko zwykle setery i getery zeby miec juz ostatnia dana czyli Integer
    // najwazniejsze jest to co jest napisane obok instrukcji .map, lub .flatMap bo wiemy co dostajemy po tym opakowaniu.
    // jezeli cos jest opcjoinale to opakowujemy w klasie i odrazu tutaj uzywamy .flatMap,
    // Jezeli cos nie moze byc nullem z zalozenia to validujemy to w klasie a w Mainie uzywamy .map zeby opakowac ta rzecz.

    // Optional<Integer> oznacza ze moze jest w opakowaniu Integer a moze nie ma, i to srpawdzamy wlasnie Integerem.
}


}
