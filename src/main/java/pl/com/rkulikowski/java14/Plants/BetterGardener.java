package pl.com.rkulikowski.java14.Plants;

public class BetterGardener extends Gardener {

    @Override
    public void waterPlant(Plant plant) {
        plant.increaseWaterLevel(plant.getRequiredWaterIncreaseLevelInMl());        // skoro dzialamy na plant, to wszystkie metody wywolujemy w plant.metoda(). bo inaczej nie bedzie dzialac.
        //plant.increaseWaterLevel(plant.waterUseInMl);   // to samo moznaby zrobic bez metody w taki sposob
    }
}
