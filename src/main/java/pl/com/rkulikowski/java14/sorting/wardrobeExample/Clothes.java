package pl.com.rkulikowski.java14.sorting.wardrobeExample;

public class Clothes {

    private boolean cleanOrNot;
    private int size;

    public Clothes(boolean cleanOrNot, int size) {
        this.cleanOrNot = cleanOrNot;
        this.size = size;
    }

    public boolean isCleanOrNot() {
        return cleanOrNot;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "cleanOrNot=" + cleanOrNot +
                ", size=" + size +
                '}';
    }



}
