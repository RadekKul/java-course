package pl.com.rkulikowski.java14.null_avoid.optional;

import java.util.Optional;

public class Bathroom {
    private Sink sinkl;

    public Bathroom(Sink sinkl) {
        this.sinkl = sinkl;
    }

    public Bathroom() {

    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "sinkl=" + sinkl +
                '}';
    }

    public Optional<Sink> getSinkl() {
        return Optional.ofNullable(sinkl);  // ulepszamy tak zeby program wylapal jak przyjdzie null w zlewie.
    }

    public void setSinkl(Sink sinkl) {
        this.sinkl = sinkl;
    }
}
