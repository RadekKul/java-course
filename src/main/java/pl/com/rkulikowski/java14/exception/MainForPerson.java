package pl.com.rkulikowski.java14.exception;

public class MainForPerson {

    public static void main(String[] args) {
        Person me = null;   // tu przypisujemy i to nam wypisze (jezeli bedzie zle) bo w try tylko sprawdzamy, a nic nie przypisujemy, jezeli beda dobre argumenty to przypisze i wypisze na koniec toStringa
        try{
            me = new Person("Radek","K",1);
        }catch (WrongParameter wrongParameter){
            wrongParameter.printStackTrace();
        }

        System.out.println(me);
        System.out.println();

        PersonIllegalArgument personWithIllegalArgument =  new PersonIllegalArgument(null," ",3);   // w ogole nie pozwala nam tego zrobic, nie lapiemy bo to warunek typu RuntimeException
                                                                                                                        // takie warunki i tak leca przy dzialaniu programu, bo to nasza wina ze poszly
    }
}
