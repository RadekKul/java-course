package pl.com.rkulikowski.java14.solid.liskov_substitution;

public class FeaturePhone {

    protected String model;

    public FeaturePhone(String model) {
        this.model = model;
    }

    protected boolean canBeEqual(){ // domyslnie podtypy nie moge reprezentowac nadtypow, dlatego tutaj jest false w smartphone jest juz true
        return true;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeaturePhone)) { // smartphone jest instancja bo dziedziczy po featurephone
            return false;
        }
//        if (o == null || getClass() != o.getClass()) return false;

        FeaturePhone that = (FeaturePhone) o;

        if (!that.canBeEqual()) { // jezeli przyjdzie smartfon to canBeEqual bedzie brane ze smartfona, bo mimo rzutowania na featurephone to metody nadpisane zostaja przy tym obiekcie
            return false;
        }

        return model != null ? model.equals(that.model) : that.model == null;
    }

//    @Override
//    public int hashCode() {
//        return model != null ? model.hashCode() : 0;
//    }
}

