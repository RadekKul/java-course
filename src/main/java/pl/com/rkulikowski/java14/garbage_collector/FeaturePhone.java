package pl.com.rkulikowski.java14.garbage_collector;

public class FeaturePhone {

    private String model;

    public FeaturePhone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeaturePhone that = (FeaturePhone) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }

 /*   @Override
    public int hashCode() {
        return model != null ? model.hashCode() : 0;
    }*/
}
