package pl.com.rkulikowski.java14.exception;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(){    // konstruktor domyslny
        //
    }

    public MyRuntimeException(String message){  // konstruktor z wiadomoscia
        super (message) ;
    }

    public MyRuntimeException(String message, Throwable cause){ // konstruktor z wiadomoscia i powodem
        super(message, cause);
    }
}
