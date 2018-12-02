package pl.com.rkulikowski.java14.vehicle;

public class Vehicle {

    public void printName(){
        System.out.println("Hello ");
    }

    public void move(){
        System.out.println("move()");
    }

    @Override
    public String toString() {  // nadpisujemy toString w taki sposob zeby pokazywal sciezkę do kazdej klasy. public- kadzy korzysta, bez void, vo toString zwraca z Object() cos wiec nie mozemy go zrobic void
        //return super.toString();
        return "Class of Vehicle: "+ getClass(); //toString nadpisujemy dla wszystkich class dziedziczących, ze zamiast dawac nam sama sciezke da nam Tekst + sciezke. Nie musimy dodawac this.
                                                // bo i tak nam ta metoda sama odwola sie do konkretnych class, obiektow na ktorych ją wywołamy.
    }


    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Vehicle");
    }

}
