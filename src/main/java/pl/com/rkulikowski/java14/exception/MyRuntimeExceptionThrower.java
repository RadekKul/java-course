package pl.com.rkulikowski.java14.exception;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException() throws MyRuntimeException{
        System.out.println("throwMyRuntimeException() go!");

        throw new MyRuntimeException("haahaha");
    }

}
