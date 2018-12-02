package pl.com.rkulikowski.java14.exception;

public class MyRuntimeExceptionTest {
    // 3 levels
    //level 3 throw MyRuntimeException
    // catch in main
    public static void main(String[] args) {    // jezeli nie zlapiemy tego wyjatku to kompilator nam nie bedzie kazal, ale pprzy starcie sie wywali program.

        try{
            level1();
        }catch (MyRuntimeException e){
         e.printStackTrace();
        }

        level1();
    }

    public static void level1(){
        level2();
    }

    public static void level2() throws MyRuntimeException{
        level3();
    }

    /**
     *
     * @throws MyRuntimeException
     *
     */

    public static void level3() throws MyRuntimeException{      // tutaj dopisujemy throws, zeby pokazac ze go przekazujemy, bez tego tez by dzialalo ale nikt by nie wiedzial czy cos naprawiac itd
        throw new MyRuntimeException("Problem with level 3()");
    }


}
