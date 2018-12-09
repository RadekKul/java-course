package pl.com.rkulikowski.java14.null_avoid;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Sink sink = new Sink("KOLO");

        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);

        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

        displaySinkLabelVeryNaive(withBathroomWithoutSink);     // tu wywali blad bo w naszej prymitywnej metodzie nie mozemy przyjac null, bo tego nie obslugujemy ogolnie.

    }

    // sprawdzamy czy nie ma nulla wpisanego w taki sposob, operujac na .map bo to nie sa Optionalem w tym momencie tylko getery zwykle, jakby byly optional to bysmy uzyli flatMap

    private static void printLabelWithLambda(House house){
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSinkl())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: " + s));
    }


    // metoda pokazujaca label z Sink , bardzo naiwna, prymitywna
    private static void displaySinkLabelVeryNaive (House house){

        String label = house.getBathroom().getSinkl().getLabel();
        //String label2 = house?.getBathroom()?.getSinkl()?.getLabel();     // ? oznacza- jesli nie jest nullem to idz dalej, jesli jest to przypisz null do label2s
        System.out.println(label);
    }

    // tutaj metoda obslugujaca przekazany null

    private static void displaySinkLabelWithNull (House house){

        String label = "default";

        System.out.println(label);

      /*  if(house != null || house.getBathroom() != null || house.getBathroom().getSinkl() != null ){ // dla label nie trzeba sprawdzac czy jest null bo mamy oddzielnie obsluzony w Sinku

        }*/

      // to jest inny sposob na to co w linijce wyzej, bardziej czytelny
      if (null !=house){
          Bathroom bathroom = house.getBathroom();

          if(null !=bathroom){
              Sink sink = bathroom.getSinkl();

              if(null !=sink){
                  label = sink.getLabel();
              }
          }
      }

    }


    String name = "";
}
