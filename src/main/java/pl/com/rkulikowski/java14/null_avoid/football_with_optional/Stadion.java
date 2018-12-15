package pl.com.rkulikowski.java14.null_avoid.football_with_optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Stadion {

    private Chair chair;

    public Stadion(Chair chair) {
        this.chair = chair;
    }

    // krzeselko jest opcja bo moze byc stadion bez krzeselek
    public Optional<Chair> getChair() {
        return Optional.ofNullable(chair);          // tutaj opakowywujemy w pudeleczko i zwracamy wartosc w pudelku
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Stadion{" +
                "chair=" + chair +
                '}';
    }
}
