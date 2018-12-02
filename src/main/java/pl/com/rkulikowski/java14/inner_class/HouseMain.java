package pl.com.rkulikowski.java14.inner_class;

public class HouseMain {

    public static void main(String[] args) {
        House house1 = new House("Nowa rezydencja dla Javowców w JWC");

       // House.Apartment apartment = new House.Apartment(); // tak sie nie da tu zrobic bo Apartment nie jest static, wiec nie jest czyms stalym dla klasy wiec nie wiemy "ktory Apartment"

        House betterHouse1 = new House();
        betterHouse1.setHouseName("Java home");     // to wywolujemy na obiekcie typu House, bo setHouseName jest w classie House, a printName sa juz w Apartament
        House.Apartment myNewApartment = betterHouse1.new Apartment(80);    // wywolujemy w taki sposob , poniewaz nie mozemy miec zmiennej typu Apartment, bez zmiennej typu House
        // dlatego jezeli mamy classe w classie to musimy robic to w taki sposob. betterHouse1.new , wywolujemy new na rzecz House, tworzaca nowy aparment w konkretnym House (rezydencji)
        House.Apartment mySecondApartment = betterHouse1.new Apartment(60);



        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home");
        House.Apartment firendApartment = betterHouse2.new Apartment(40);   // tutaj tworzymy mieszkanie w drugiej rezydencji


        // wszystki te mieszkania, niezaleznie od rezydencji w ktorej sa tworzone, maja metode setHouseName i printNameOfHouse i wyswietli rezydencje w ktorej sa te apartamenty
        myNewApartment.printNameOfHouse();  // to wywoulujemy juz na obiekcie Apartment, bo metoda printNameOfHouse jest w Apartment
        mySecondApartment.printNameOfHouse();
        firendApartment.printNameOfHouse();


    }
}
