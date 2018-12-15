package pl.com.rkulikowski.java14.null_avoid.football_with_optional;

public class FootballClub {

    private Stadion stadion;

    public FootballClub(Stadion stadion) {
        this.stadion = validate(stadion);
    }

    // zwraca stadion bo dalismy validacje
    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {   // tutaj juz uzywamy validacje
        this.stadion = validate(stadion);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadion=" + stadion +
                '}';
    }

    // metoda do validacji czy ktos nie przekazal null w stadionie, jezeli tak to leci wyjatek jezeli nie to zwraca stadion.
    private Stadion validate(Stadion stadion){
        if (null == stadion){
            throw new IllegalArgumentException("Stadium cannot be null");
        }
        return stadion;
    }
}
