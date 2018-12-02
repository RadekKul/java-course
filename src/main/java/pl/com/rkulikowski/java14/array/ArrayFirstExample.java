package pl.com.rkulikowski.java14.array;

import pl.com.rkulikowski.java14.animal.Animal;
import pl.com.rkulikowski.java14.animal.Cat;
import pl.com.rkulikowski.java14.animal.Dog;

public class ArrayFirstExample {

    public static void main(String[] args) {
        int[] firstArray = new int[4];  //utowrzenie tablicy do przechowywania danych typu int cztero elementowy
        Object o = firstArray;  // teraz o wskazuje na tablice czteroelementowa
        firstArray = new int[5];  // zmieniamy referencje na nową tablice piecioelementowa, ale "o" nadal wskazuje na tamta czteroelementowa

        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;
        //firstArray[5] = 6;    // wyswietli blad przy kompilacji ze tablica nie ma tyle elementow (przekraczamy indeks - nie ma tam elementu), podobnie gdybysmy uzyli ujemny index np -2.

        Object[] objects = new Object[2];

        for (int i=0 ; i<firstArray.length ; i++){      // sprawdzamy az do konca dlugosci tablicy, od 0 bo pierwszy index to 0, az do jej dlugosci, zeby wykorzystac wszystkie elementy
            firstArray[i]=i+1;
        }

        Animal[] animals = makeAnimals(); // stwarzamy tablice animals typu Animal - poprzez metode ( metoda zwraca nam animalArray, i przypisuje do tablicy animals)
        for(int i = 0; i<animals.length; i++){  // wywolujemy petle for recznie dla tablicy
            System.out.println(animals[i]);
        }

        for(Animal aaa: animals){    // dla kazdego elementu typu Animal z tablicy animals, ktory bedzie nazwany w ciele aaa, wykonaj to co w ciele petli. To samo co wyzej tylko prosciej
            System.out.println(aaa);
        }

        //checkEnhancedFor();       // wydrukuje null-e bo nie ma nic przypisanego do tych wszystkich elementow w tablicach w tej metodzie.

        System.out.println();
        System.out.println();

        // tworzymy tablice, wszystkich zwierzat, samych psow, samych kotow

        Animal[] allAnimals = new Animal[2];

        allAnimals[0] = new Dog();
        allAnimals[1] = new Cat();
        processAnimalArray(allAnimals);

        //same psy
        Dog[] onlyDogs = new Dog[2];        // tablica psow jest jednoczesnie tablica zwierzat, bo psy rozszerzaja zwierzeta

        onlyDogs[0] = new Dog();
        onlyDogs[1] = new Dog();
        processAnimalArray(onlyDogs);

        //same koty
        Cat[] onlyCats = new Cat[2];

        onlyCats[0] = new Cat();
        onlyCats[1] = new Cat();
        processAnimalArray(onlyCats);


        System.out.println();


        addCatToArray(allAnimals);  // tu tez wyskoczy warunek z instanceof - bo ten warunek jest bardzo silny i puszcza tylko Cat[] nawet tych co extends nie puszcza, wiec jest to gubiace czasem
        addCatToArray(onlyCats);
        addCatToArray(onlyDogs); // tak nie mozna zrobic bo nie mozemy do tablicy Dog dopisac Obiektu typu Cat, przed tym nas sama java broni. Tablica zna typ obiektow jakie przechowuje a lista nie do konca
                                    // przed tym mozna sie ochronic w sposob instanceof tak jak na dole zrobilismy(chociaz to za mocne obciecie)
    }

    public static Animal[] makeAnimals(){

        Animal[] animalArray = new Animal[2];

        animalArray[0] = new Dog();
        animalArray[1] = new Cat();

        return animalArray;
    }

    public static void checkEnhancedFor(){
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[5];

        for(Object o: objects){
            System.out.println(o);
        }

        for(Dog dog: dogs){
            System.out.println(dog);
        }

        for(Cat cat: cats){
            System.out.println(cat);
        }


        }
    public static void processAnimalArray(Animal[] animals) {
        for(Animal animal : animals){
            animal.whichAnimal();
        }
    }

    public static void addCatToArray(Animal[] cats){
        if(cats instanceof Cat[]) {
            cats[0] = new Cat();
            System.out.println(cats[0]);
        }
        else{
            System.out.println("Warning! Cannot add cat!");
        }
    }
}
