package pl.com.rkulikowski.java14.generic;

public class GenericHolder<E> { // jezeli mamy zmienne ktore sa roznych typow mozemy je generalizowac, poprzez dopisanie np. <E>, E oznacza tutaj cokolwiek, jakkkikolwiek typ

    E secret;

    public E getSecret(){       // wstawiamy typ zmiennej E
        return secret;
    }

    public void setSecret(E secret){        // wkladamy do set typ E
        this.secret = secret;
    }
}
