package pl.com.rkulikowski.java14.solid.single_object_responsibility;

// w tym single object responsibility chodzi o to zeby jedna klasa robila jedna rzecz, ze jak robi duzo rzeczy jedna klasa to nie jest za dobrze
public class Main {
    // (1) 5 psow
    // (2)
    // stworzy tresera psow
    // uczy sztuczek
    // wyprowadza na spacer
    // mozliwosc leczenia psow
    // dieta dla psow

    public static void main(String[] args) {
        Dog azor = new Dog("Azor", "kundel", 15.0,"Mariusz");
        Dog diana = new Dog("Diana", "kundel", 11.0,"Arek");
        Dog fiona = new Dog("Fiona", "pudel", 7.0,"Stefan");
        Dog szrek = new Dog("Szrek", "kaukaz", 8.0,"Olek");
        Dog filip = new Dog("Filip", "kundel", 25.0,"Franek");



    }
}
