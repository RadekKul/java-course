package pl.com.rkulikowski.java14.constructor;

public class Main {

    public static void main(String[] args) {
        Dish myLunch;
        myLunch = new Dish();

        Dish secondLunch = new Dish();

        System.out.println("///////////////////////////////////////////////");
        Pizza pizza = new Pizza();

        Cutlet cutlet = Cutlet.giveMeNewNormalCutlet(); // musimy wykonać Constructor który zrobi nam kotleta, bo Constructor Cutlet() jest prywatny wiec nie mamy bezposrednio do niego dostepu

        Cutlet cutlet1 = Cutlet.giveMeCoutletWithOnion();   // rozne rodzaje kotleta za pomoca roznych parametrów ktore mamy wpisac

        Cutlet cutlet2 = Cutlet.giveMeCoutletWithGrilledOnion();



    }
}
