package pl.com.rkulikowski.java14.Plants;

public class Cactus extends Plant {

    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) { // Constructor domyslny, musimy je ulokowac juz w tej classie zeby kod byl bardziej czytelny, jezeli dziedziczymy po plant,
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);                  // to musimy zrobic Constructor, ktory wpisze odpowiednie dane przy tworzeniu obiektu Cactus
    }


        @Override
        public void grow(){
            heightInCm += 1;        // to jest to samo heightInCm = heightInCm + 1

            currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
        }

    @Override
    public int getRequiredWaterIncreaseLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Type: Cactus {" +
                "heightInCm= " + heightInCm +
                ", waterUseInMl= " + waterUseInMl +
                ", currentWaterLevelInMl= " + currentWaterLevelInMl +
                '}';
    }
}

