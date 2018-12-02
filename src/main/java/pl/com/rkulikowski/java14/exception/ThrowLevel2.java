package pl.com.rkulikowski.java14.exception;

public class ThrowLevel2 {

    public void doIT() throws MyException{
        System.out.println("I'm dangerous :)");

        MyExceptionThrower thrower = new MyExceptionThrower();
        thrower.throwMyException();
    }
}
