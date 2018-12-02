package pl.com.rkulikowski.java14.Plants;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {

        // to nam potrzebne jak nie mamy tablicy z roslinkami, podobnie sysout. na dole tez juz zamienilismy na petle for w tablicach

     /*   Plant cactus1 = new Cactus(1, 20, 20);
        Plant cactus2 = new Cactus(2, 30, 30);

        Plant rose1 = new Rose(3, 150, 150);
        Plant rose2 = new Rose(5, 200, 200);

        Plant pricklyPear1 = new PricklyPear(1, 100, 100);
        Plant pricklyPear2 = new PricklyPear(2, 120, 120);

          //Gardener gardener1 = new Gardener();      // ten ogrodnik podlewal kazda rosline tyle samo

        BetterGardener gardener1 = new BetterGardener(); //ten ogrodnik podlewa kazda rosline tyle ile jej potrzeba dziennie, poprzez zastosowaną metode plant

        for (int i=1; i<=7; i++) {

            gardener1.waterPlant(cactus1);
            gardener1.waterPlant(cactus2);

            gardener1.waterPlant(rose1);
            gardener1.waterPlant(rose2);

            gardener1.waterPlant(pricklyPear1);
            gardener1.waterPlant(pricklyPear2);

            gardener1.makePlantGrow(cactus1);
            gardener1.makePlantGrow(cactus2);

            gardener1.makePlantGrow(rose1);
            gardener1.makePlantGrow(rose2);

            gardener1.makePlantGrow(pricklyPear1);
            gardener1.makePlantGrow(pricklyPear2);
        }

        System.out.println("Cactus 1: " + cactus1);
        System.out.println("Cactus 2: " + cactus2);


        System.out.println("Rose 1: " + rose1);
        System.out.println("Rose 2: " + rose2);


        System.out.println("Prickly pear 1: " +pricklyPear1);
        System.out.println("Prickly pear 2: " +pricklyPear2);

    }
*/


        //Gardener gardener1 = new Gardener();      // ten ogrodnik podlewal kazda rosline tyle samo

        BetterGardener gardener1 = new BetterGardener(); //ten ogrodnik podlewa kazda rosline tyle ile jej potrzeba dziennie, poprzez zastosowaną metode plant

        Plant[] plantsArray = makePlantsArray();

        for(DayOfWeek weekDay: DayOfWeek.values()){
            System.out.println("Day of the week: " + weekDay);
            for (Plant plant : plantsArray) {       // dla kazdego elementu (kazdej roslny ) z tablicy plantsArray (niewazne czy kaktus czy roza) wykonujemy dane czynnosci
                gardener1.waterPlant(plant);
                gardener1.makePlantGrow(plant);
            }
        }

        for (Plant plant : plantsArray){        // dla kazdego elementu (kazdej rosliny) z tablicy plantsArray, wyswietlamy jej toString
            System.out.println(plant);
        }


// Wyzej to samo z zastosowaniem typu wyliczeniowego z Enum, z wykorzystaniem dni tygodnia
/*

        for (int i = 0; i < 7; i++) {               // Wykonujemy czynnosci 7 dni
            for (Plant plant : plantsArray) {       // dla kazdego elementu (kazdej roslny ) z tablicy plantsArray (niewazne czy kaktus czy roza) wykonujemy dane czynnosci
                gardener1.waterPlant(plant);
                gardener1.makePlantGrow(plant);
            }
        }

        for (Plant plant : plantsArray){        // dla kazdego elementu (kazdej rosliny) z tablicy plantsArray, wyswietlamy jej toString
            System.out.println(plant);
        }
*/


    }

    public static Plant[] makePlantsArray() {

        Plant[] result = new Plant[6];

        // Pierwsza mozliwosc ( przepisanie referencji result[0] na cactus stworzony wyzej

        Plant cactus = new Cactus(1, 20, 20);
        result[0] = cactus;

        // Druga mozliwosc to przypisywanie do tablicy odrazu nowych obiektow)

        result[1] = new Cactus(1, 30, 30);
        result[2] = new Rose(3, 150, 150);
        result[3] = new Rose(5, 200, 200);
        result[4] = new PricklyPear(1, 100, 100);
        result[5] = new PricklyPear(2, 120, 120);


        return result;
    }
}
