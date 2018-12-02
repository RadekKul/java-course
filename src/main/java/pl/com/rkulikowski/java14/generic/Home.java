package pl.com.rkulikowski.java14.generic;

//generic
//only Animals and extends
//method enterHome(xxx)
//method Dog goOutside(xxx)
//xxx = placeholder

import pl.com.rkulikowski.java14.animal.Animal;
import pl.com.rkulikowski.java14.animal.Dog;

public class Home<E extends Animal> {   // tutaj dziedziczymy po zwierzeciu wiec mozna uzyc tylko metody ze zwierzecia, zeby nie bylo opcji ze zrobimy Cat i bedzie mogl zrobic metode Dog.

    private E xanimal;    // deklarujemy zmienna typu E, czyli tego co przyjdzie

    public void enterHome(E xanimal){        // pozwalamy zeby E bylo czymkolwiec co rozszerza E

        this.xanimal=xanimal;  // tu przpyisujemy do zmiennej typu E, to co moze wejsc do tej metody, czyli np Cat, Dog, wszystko co moze wjesc.
        System.out.println(xanimal + " entered home");

    }

    public Dog goOutside(Dog d){        // tutaj zrobilismy tylko metode ktora przyjmie Dog, nic wiecej

        System.out.println(d + " goes outside");
        return d;
    }

    public void giveMeAnimal (E animal){

        System.out.println("I give You animal which is a : + " + animal.toString());    // tu obojetnie animal lub animal.toString()
    }

}
