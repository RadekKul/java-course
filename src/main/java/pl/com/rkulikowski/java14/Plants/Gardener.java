package pl.com.rkulikowski.java14.Plants;

public class Gardener {

    public void waterPlant(Plant plant) {   // wywoulujemy metode dla ogrodnika ktory bedzie podlewal
        plant.increaseWaterLevel(200);    // kazda rosline podlewamy 200ml
    }

    public void makePlantGrow(Plant plant){
        plant.grow();
    }

}
