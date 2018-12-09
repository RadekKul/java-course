package pl.com.rkulikowski.java14.null_avoid.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Sink sink = new Sink("KOLO");

        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);

        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

        //never ever!!!

        // do pudelka wurzcamy rozne wartocsi

        // Optional.of uzywamy jezeli jest puste

        Optional<String> maybeString = Optional.empty();    // pusta przejdzie
        Optional<String> stringForSure = Optional.of("Radek");  // String przejdzie
        if(stringForSure.isPresent()) { // isPresent mowi czy jest cos w srodku czy nie
            System.out.println(stringForSure.get());

        }


        String maybeNull = null;
        Optional<String> absentString = Optional.ofNullable(maybeNull);  // ofNullable - bierze pod uwage ze moze byc tez null

        // dostajemy lambde, dwa razy ALT + Enter robimy zeby zamienic na taki typ zapisu. Skrocony zapis na isPresent, za pomoca lambdy, zamiana zapisu if->zrob, na lamde.
        absentString.ifPresent(x -> System.out.println(x));

    }

    // tutaj metoda ktora takze sprawdzi nam czy nie dalismy nulla i czy jest zlew w housie, duzo szybciej i nie musimy siec bac o nulle bo sam sprawdza w ifPresent (tylko wtedy sie wykona jezeli cos jest w "pojemniczku" Optional)

    private static void printLabelWithLambda1(House house){
        Optional.ofNullable(house)                          // opakowujemy przekazany dom w ofNullable, zeby sobie wywalic mozliwe nulle, a potem lecimy juz z ifPressent
                .ifPresent(house1 -> house1.getBathroom()       // house1 generuje sie samo, mozna tam wstawic co tylko sie chcialo
                        .ifPresent(bathroom -> bathroom.getSinkl()  // potem lecimy juz pokolei z ifPresent, sprawdzamy czy jest cos w pudelku i sie nie martwimy o nulle, jak jest to idziemy dalej
                                .ifPresent(sink ->
                                        System.out.println(sink.getLabel()))
                        )
                );
    }

    // flatMap - zamienia typ na drugi typ, odpowiedni, i go zwraca, a ifPresent nic nie zwraca tylko sprawdza czy nie jest pusto
    // ifPresent przekazuje obiekt do interface Consumer, i przyjmuje dany typp.


    private static void printLabelWithLambda2(House house){

        Optional.ofNullable(house)                          // opakowujemy przekazany dom w ofNullable, zeby sobie wywalic mozliwe nulle, a potem lecimy juz z ifPressent
                .flatMap(house1 -> house1.getBathroom())    // to jest rzutowanie, zamienianie jednego obiektu w drugi, zeby mozna bylo posprawdzac
                .flatMap(bathroom -> bathroom.getSinkl())
                        .map(sink -> sink.getLabel())       // tutaj juz nie robimy flatMap, bo nie potrzebne nam kolejne pudelko, bo to juz jest ostatnie odwoalnie do String a nie do Optional
                        .ifPresent(s -> System.out.println("label: " + s));
    }

    //Ważne:  samo Map dajemy jesli metoda mapujaca nie zwraca Optionala tylko zwykly jakis typ, a flatMap dajemy jak metoda zwraca Optionala.
    // flatMapa robi nam z dwoch pudelek jedno, wiec nie mozna jej uzyc na ostatnim pudelku.

    // w null avoid/Main, bedzie pokazane jak to robic na samych mapach, bez flatMap

    // skoro ktos moze nam tutaj przyslac nula to juz sobie opakujemy odrazu zeby miec wyjscie
    // niby cos zrobilismy, zabezpieczylismy sie ale nadal to wszystko pokolei musimy oddzielnie wpisywac
    // tylko jesli obiekty sa w srodku, robimy cos dalej (funkcja isPresent)

    private static void printLabelSlowMode(House house){
        String label = "empty";
        Optional<House> maybeHouse = Optional.ofNullable(house);

        if(maybeHouse.isPresent()){
            Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();       // ten get juz zwroci nam Optionala

            if(maybeBathroom.isPresent()){
                Optional<Sink> maybeSink = maybeBathroom.get().getSinkl();

                if (maybeSink.isPresent()){
                    label = maybeSink.get().getLabel();
                }
            }
        }
    }

}
