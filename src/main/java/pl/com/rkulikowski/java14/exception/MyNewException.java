package pl.com.rkulikowski.java14.exception;

public class MyNewException extends Exception {

    public MyNewException() {

    }

    public MyNewException(String message) {
        super(message);
    }

    public MyNewException(String message, Throwable cause) {
        super(message, cause);
    }
}
