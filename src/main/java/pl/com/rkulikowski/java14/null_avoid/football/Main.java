package pl.com.rkulikowski.java14.null_avoid.football;

// FootballClub -> Stadion -> Chair -> Number
// nie ma klubu pilkarskiego bez stadionu, ale stadion moze byc bez siedzen
// wiec Stadion nie jest nullem

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        NumberOfChair number = new NumberOfChair(10);
        Chair chair = new Chair(number);
        Stadion stadionWithChair = new Stadion(chair);
        Stadion stadionWithoutChair = new Stadion(null);
        FootballClub barcelona = new FootballClub(stadionWithChair);

        getChairNumber(barcelona);

    }

private static void getChairNumber(FootballClub footballClub){
    // pakujemy klub pilkarski do optionala zeby przejrzec czy nie ma Nulla

    Optional.ofNullable(footballClub)
            .map(footballClub1 -> footballClub1.getStadion())
            .map(stadion -> stadion.getChair())
            .map(chair -> chair.getNumber())                 // ten Optional w srodku moze miec numerek ale nie musi wiec sprawdzamy
            .ifPresent(integer -> System.out.println("Number: " + integer));        // integer to jakakolwiek nazwa tylko pokazanie co sie dzieje z tym co przyjmuje program.

}


}
