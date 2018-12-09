package pl.com.rkulikowski.java14.null_avoid;

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

    public Sink getSinkl() {
        return sinkl;
    }

    public void setSinkl(Sink sinkl) {
        this.sinkl = sinkl;
    }
}
