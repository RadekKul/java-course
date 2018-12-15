package pl.com.rkulikowski.java14.anonymous_classes.lambda.exercise.exercise2;

// zadanie: interface signign, 3 metody, 2 z domyslna implementacja jedna funkcjonalna dla lambdy, i wywolujemy lambda

@FunctionalInterface
public interface Singing {


    void singSopran ();

    default void singBass(){
        // domyslna implementacja tutaj
    };
    default void singAlt(){
        System.out.println("domyslna implementacja metody singAlt dla wszystkich instacji");
    };


}
