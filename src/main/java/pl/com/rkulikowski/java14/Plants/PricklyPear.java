package pl.com.rkulikowski.java14.Plants;

public class PricklyPear extends Plant {

    public PricklyPear(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow(){
        heightInCm += 3;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public int getRequiredWaterIncreaseLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Type: PricklyPear {" +
                "heightInCm= " + heightInCm +
                ", waterUseInMl= " + waterUseInMl +
                ", currentWaterLevelInMl= " + currentWaterLevelInMl +
                '}';
    }
}
