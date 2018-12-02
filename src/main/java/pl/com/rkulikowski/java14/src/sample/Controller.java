package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField firstNumber;          // znaczek po lewo od linijki oznacza, że połączono zmienną z plikiem sample.fxml
    @FXML
    private TextField secondNumber;
    @FXML
    private TextField actionType;
    @FXML
    private TextArea resultArea;

    public void clickButton() {     // Musimy przypisac tą metode do przycisku bo to ona wywoluje cała reszte

        String firstString = firstNumber.getText();     // przypisujemy zmiennej to co zostanie wpisane przez uzytkownika do kolejnych pól
        String secondString = secondNumber.getText();
        String actionString = actionType.getText();

        if (checkNumber(firstString) && checkNumber(secondString) && checkNumber(actionString)) {        // sprawdzamy metodą, czy przypadkiem ktores z pól nie jest puste, jezeli jest to robimy else

            try {
                float a = Float.valueOf(firstString);       // przerobienie String na Float
                float b = Float.valueOf(secondString);      // przerobienie String na Float
                char action = actionString.charAt(0);       // Pobranie pierwszego znaku z tekstu wpisanego w pole działania
                doAction(a, b, action);                     // Wywolanie metody wykonujacej działania
            } catch (NumberFormatException e) {              // NumberFormatException e to wyjątek, który trzeba dodać, zeby wylapywal inny typ dannych niz oczekujemy powzyej.
                resultArea.appendText("Wprwadzono niepoprawny typ danych \n");
            }
        } else {
            resultArea.appendText("Nie wprowadzono wszystkich danych" + "\n");
        }
    }



    public void doAction(float a, float b, char action) {        // metoda wykonujaca dzialania
        switch (action) {            // petal switch szukajaca wyjsc z sytuacji przedstawionych w case ' '
            case '+':
                resultArea.appendText("Wynik dodawania to: " + plus(a, b) + "\n");       //wyswietli w resultArea tekst (moznaby to zrobic za pomoca poniszej metody displayResult)
                break;
            case '-':
                resultArea.appendText("Wynik odejmowania to: " + minus(a, b) + "\n");
                break;
            case '*':
                resultArea.appendText("Wynik mnożenia to: " + multiply(a, b) + "\n");
                break;
            case '/':
                resultArea.appendText("Wynik mnożenia to: " + division(a, b) + "\n");
                break;
            default:
                resultArea.appendText("Wpisano niepoprawne działanie \n");
                break;
        }
    }


    public float plus(float a, float b) {     // metody do odpowiednich działąn
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float division(float a, float b) {
        return a / b;
    }

    public void displayResult(char action, float result) {       // mozna tego uzyc w case zeby zrobic metodą wywolanie wynikow, duzo szybciej sie to robi bo nie trzeba rozpisywać mozliwości
        resultArea.appendText("Wynik działania " + action + " to: " + result);
    }

    public boolean checkNumber(String number) {
        if (number.isEmpty()) {             //return number.isEmpty() ? true : false;    // skrócony if, jezeli jest pusty to true, inaczej false
            return false;
        } else {
            return true;
        }

    }

}
