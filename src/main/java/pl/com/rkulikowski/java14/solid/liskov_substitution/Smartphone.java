package pl.com.rkulikowski.java14.solid.liskov_substitution;

public class Smartphone extends FeaturePhone {

    public Smartphone(String model) {
        super(model);
    }

    @Override
    public String getModel() {
        return "Smartphone: " + super.getModel();
    }

    /*@Override
    public boolean equals(Object o) {
        return super.equals(o);
    }*/

    @Override
    protected boolean canBeEqual() {    // nowy moze byc zamiennikiem starego, wiec dajemy ze tak
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) {
            return false;
        }

        Smartphone that = (Smartphone) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }
}
