package pl.com.rkulikowski.java14.exception;

public class WrongParameter extends Exception {

    public WrongParameter(){
        //
    }

    public WrongParameter(String message){
        super(message);
    }

    public WrongParameter(String message, Throwable cause){
        super(message, cause);
    }
}
