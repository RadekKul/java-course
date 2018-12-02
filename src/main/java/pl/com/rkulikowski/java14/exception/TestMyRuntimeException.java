package pl.com.rkulikowski.java14.exception;

public class TestMyRuntimeException {

    public static void main(String[] args) {

        try {
            throw new MyRuntimeException();     // tych wyjatkow nie musimy lapac (try-catch) tak jak tych poprzednich. Runtime moze nie byc lapany, ale program rozwali mimo to. Są to tzw unChecked
        } catch (MyRuntimeException e){
            // empty - jezeli nic nie damy to nie jest zadne rozwiazanie wyjatku, wiec jest on bezuzyteczny
            e.printStackTrace(); // podobnie to, samo wypisanie nic nam nie daje, wiemy tylko co sie stalo, a chodzi o to zeby tutaj rozwiazac ten wyjatek
        }
    }
}
