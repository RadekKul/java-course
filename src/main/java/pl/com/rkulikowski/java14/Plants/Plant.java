package pl.com.rkulikowski.java14.Plants;

public class Plant {

    protected int heightInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;


    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public void grow(){
        // empty        // w kazdej roslince bedzie inaczej wiec przeslonimy/zoverajdujemy tę metodę w kazdej z roslin
    }

    public int getRequiredWaterIncreaseLevelInMl(){ // metoda znajdujaca ilosc potrzebnej wody do podlania
        return 20;  // wpisane na sztywno, bo i tak jest nadpisana ta metoda dla kazdej rosliny
    }

    public void increaseWaterLevel(int waterUseInMl){   // zwiekszymy level wody w roslince o tyle ilu zuzywa.

        currentWaterLevelInMl += waterUseInMl;

    }


    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }

    public int getCurrentWaterLevelInMl() {
        return currentWaterLevelInMl;
    }


}
