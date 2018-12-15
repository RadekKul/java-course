package pl.com.rkulikowski.java14.anonymous_classes.lambda.exercise;

// chemy lambdy
@FunctionalInterface
public interface Exercise {

    void swim();    // lambda zawsze bedzie dzialac na tej metodzie ktora nie ma ciala, dzieki zapisowi FunctionalInterface wiemy ze mozemy miec tylko jedna taka metode w interfejsie zeby lambdy dzialaly

    default void jogging() {}   // ta metode zawsze bedzie mozna nadpisac, default oznacza -MASZ DOMYŚLNĄ IMPLEMENTACJE, ktora bedzie dzialac, ta domyslna w tym przypadku to jest puste cialo metody {}
    //aby uzyc lambdy na metodzie jednej z interfejsu, trzeba koniecznie przekazac domyslne implementacje dla reszty metod w tym interfejsie
}
