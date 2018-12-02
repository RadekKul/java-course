package pl.com.rkulikowski.java14.exception.network;

public class ReadDataException extends RuntimeException{

    public ReadDataException(String message){
        super(message);
    }
}
