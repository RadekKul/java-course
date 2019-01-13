package pl.com.rkulikowski.java14.exercise;

public class ArrayExercise {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        Integer[] arrayOfIntegers = {1,2,3};
        System.out.println(array.toString());
        System.out.println(Integer.toHexString(array.hashCode()));  // kody te beda takie same, trzeba tylko przekonwertowac do szesnastkowego,

        Object[] objects = arrayOfIntegers;
        System.out.println(objects.length);
        System.out.println(arrayOfIntegers.toString()); // L tutaj oznacza ze jest to typ obiektowy np.Java Lang Integer, czyli wszystko co dziedziczy po Object i nie jest prymitywem jest oznaczone L

        Object o = array;   // array jest objectem wiec mozemy przypisac do tego bo jest typem prymitywnym.

        Anonymous anonymous = new Anonymous();
        System.out.println(anonymous.toString());

    }
}

class Anonymous{

}