package pl.com.rkulikowski.java14.object;

public class Main {

    public static void main(String[] args) {



        Person person1 = new Person();

        Person person2 = new Person("Radek","Kulikowski",10);

        Person person3 = new Person("Jan",15, "Dog");

        person1.introducePerson();
        person2.introducePerson();
        person3.introducePerson();

        // Static odwoluje sie do klasy a nie do obiektu!!

        //Person.introducePerson(); // nie bedzie dzialac boo nie ma static i nie moze odnosic sie do klasy tylko do obiektow

        Person.somethingAboutPersons(); // to zadziala bo jest static i nawet jak nie ma obiektow to odnosi sie do klasy

        // ???
        person1.somethingAboutPersons();    // java nam pokazuje ze tak sie nie powino robic, tylko powinno sie Person.something... bo jedno jest static a drugie nie, a java domyslnie to zaminenia na Person

        Person nullPerson = null;   // nullPerson nie wskazuje na zaden obiekt!
//        nullPerson.introducePerson();     // ta metoda wskazuje nigdzie wiec nie ma skad wziac danych wiec wyskakuje nullpointoer

        nullPerson.somethingAboutPersons(); // ta metoda zadziala i uruchomi ona zawsze przy static , podmieni nam referencje na nazwe klasy, czyli nullPerson na Person i wykona metode.

        Person.printNumberOfPersons();
    }

    public static void accesToObjectPropertiesFromStatic(){
        //System.out.println("Name: " +name);   // to nie zadziala bo on nie wie ktore name ma wybrac z wielu, dlatego static moze odczytywac tylko metody static lub dane static.
    }
}
