package pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception;

public class UserNotFoundChecked extends Exception {   // tworzymy checked Excepttion

    public UserNotFoundChecked(){
        // empty
    }

    public UserNotFoundChecked(String message){
        super(message);
    }

    public UserNotFoundChecked(String message, Throwable cause){
        super(message, cause);
    }
}
