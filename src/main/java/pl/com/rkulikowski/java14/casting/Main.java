package pl.com.rkulikowski.java14.casting;


// Castowanie, temat rzutowania)

public class Main {


    public static void main(String[] args) {

        //rzutowanie  - poruszanie sie po drzewie dziedziczenia

        // Robimy object typu Object i do niego przypisujemy String

        Object object = new String("string");

        //tutaj nie mozemy na nim wykonac zadnej metody z Stringu
        //object.lenght // jest ale on sam rzutuje to na String, wiec to nie o to chodzi
        ((String) object).length(); // o to wlasnie chodzi ze rzutuje nam inteliij tylko na chwile na rzecz tego wywolania, a object nadal jest typu Object

        //Dopiero tutaj rzutujemy object z Object na String, czyli dodajemy mu wszystkie moetody typu String

        String string = (String) object;
        string.substring(1);

        ///Number number = (Number) object;

        // wywolanie takeObject na int

        takeObject(Integer.valueOf(1));// to nie jest String wiec nam nie zrzutuje
    }

    public static void takeObject (Object object){

        if(object instanceof String) {  // to jest takie zabezpieczenie sie na rzutowanie, bo jak mamy object jako argument przyjmujacy to mozemy dac wsyzstko nawet int, i inta nie zrzutujemy bo nam sie
            // wywali program, wiec tutaj sobie blokujemy zeby rzutowalo tylko kiedy przekazemy Stringa
            String s = (String) object;
        } else{
            System.out.println("Podano cos innego niz String");
        }
    }

}
