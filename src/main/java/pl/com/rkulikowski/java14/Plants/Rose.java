package pl.com.rkulikowski.java14.Plants;

public class Rose extends Plant {

    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow(){
        heightInCm += 2;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public int getRequiredWaterIncreaseLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Type: Rose {" +
                "heightInCm= " + heightInCm +
                ", waterUseInMl= " + waterUseInMl +
                ", currentWaterLevelInMl= " + currentWaterLevelInMl +
                '}';
    }
}
