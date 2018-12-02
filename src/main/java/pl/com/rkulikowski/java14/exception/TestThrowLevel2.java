package pl.com.rkulikowski.java14.exception;

public class TestThrowLevel2 {

    public static void main(String[] args) {
        ThrowLevel2 l2 = new ThrowLevel2();
        try {
            l2.doIT();  // wywolujemy metode, tam tworzymy wyjatek , w niej wywolujemy throwMyException() metode, i dopiero po niej przechwwytujemy i wypisujemy
        } catch (MyException e){
            e.printStackTrace();    // wypisuje nam całą droge wyjatku, gdzie sie zaczeło, przez co szlo i gdzie sie skonczylo! wiec latwiej znalezc blad
        }
        }
}
