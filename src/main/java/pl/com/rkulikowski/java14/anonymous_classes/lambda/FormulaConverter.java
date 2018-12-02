package pl.com.rkulikowski.java14.anonymous_classes.lambda;


@FunctionalInterface    // sposob na to aby pokazywac innemu uzytkownikowi ze to jest funkcyjny interfejs dla lambdy i ostrzega nas przy dodaniu drugiej metody
public interface FormulaConverter {

    double fromCelsiusToFahrenheit(double celsius);

    // jednak jest opcja na obejscie tego, Functional broni nas przed druga abstrakcyjna metoda, a tutaj mamy jedna absstrackyjna a druga defaultowa, wiec nic niczemu nie przeszkadza

   default double fromFahrToCel(double fahr){
       return 0;
   }

}
