package pl.com.rkulikowski.java14.exception;

public class MyException extends Exception {    // aby stworzyc swoj wyjatek musimy extends dac, zeby java wiedziala ze to wyjatek

    public MyException(){
        //
    }


    public MyException(String message){  // konstruktor z wiadomoscia
        super (message) ;
    }

    public MyException(String message, Throwable cause){ // konstruktor z wiadomoscia i powodem, typy String, Throwable sa dlatego takie ze taki mozemy uzyć dzieki super - bo super przneosi nas do
                                                        // konstruktorow z javy, gotowych, mozna dac ctrl + myszka na super i sie dowiemy
        super(message, cause);
    }
}
