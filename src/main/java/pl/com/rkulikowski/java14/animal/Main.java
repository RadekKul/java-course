package pl.com.rkulikowski.java14.animal;

public class Main {

    public static void main(String[] args) {
        Dog szarik = new Dog();
        szarik.whichAnimal();       // mozna to wywolac bo metoda jest w klasie Animal, a Dog dziedziczy Animal, jak wcisniemy ctrl i na metode to nam przeniesie do miejsca jej stworzenia.
        szarik.makeSound();     // mozna bo to jest metoda z Dog() a szarik jest z Dog, gdyby bylo Animal szarik= new Dog(); to juz by nie mogl makeSound()

        Animal maybeDog = new Dog();    // pies jest zwierzeciem wiec mozemy przypisac
        maybeDog.whichAnimal();  // posiada tą metode bo przypisalismy naszego maybeDog do Animal, i przez to mozemy wywolac tylko metody z Animal (tylko z tego + wyszszych rzedów)
       // maybeDog.makeSound();   // wiec przypisanie do wyzszej klasy nie jest dobre bo wtedy dziedziczy sie mniej.


        Animal maybeCat = new Cat();
        maybeCat.whichAnimal();

        Animal maybeMonkey = new Monkey();

        Object monkey = new Monkey();   // malpa jest Object, wiec mozna tak zrobic
        monkey.toString();              // monza tylko uzywać na tym metody z Object bo zrobilismy monkey zmienna obiektem typuu Object
        System.out.println(monkey);

    }
}
