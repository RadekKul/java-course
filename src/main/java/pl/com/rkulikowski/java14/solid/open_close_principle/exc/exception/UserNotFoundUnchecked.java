package pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception;

public class UserNotFoundUnchecked extends RuntimeException {

    public UserNotFoundUnchecked() {
    }

    public UserNotFoundUnchecked(String message) {
        super(message);
    }

    public UserNotFoundUnchecked(String message, Throwable cause) {
        super(message, cause);
    }
}
