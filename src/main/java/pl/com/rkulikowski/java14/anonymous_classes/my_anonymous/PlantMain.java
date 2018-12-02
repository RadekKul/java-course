package pl.com.rkulikowski.java14.anonymous_classes.my_anonymous;

public class PlantMain {

    public static void main(String[] args) {

        // tworzymy 3 rosliny, 1 referencje, dwie anonimowe. Ogrodnik zajmuje sie wszystkim

        Gardener gardener = new Gardener();

        // pierwsza rooslina

        Cactus cactus = new Cactus();

        gardener.processPlant(cactus);

        // druga - referencja je

        Plant rose = new Plant() {
            @Override
            public void grow() {
                System.out.println("Rose is growing");
            }

            @Override
            public void smell() {
                System.out.println("Rose smells perfect");
            }

            @Override
            public void wilt() {
                System.out.println("Rose isn't wilting");
            }
        };

        gardener.processPlant(rose);

        //trzecia bez referencji, odrazu w gardenerze, jest klasa anonimowa, nawert nie wiemy jak sie nazywa ale jest gdzies w pamieci

        gardener.processPlant(new Plant() {
            @Override
            public void grow() {
                System.out.println("Grass is growing");
            }

            @Override
            public void smell() {
                System.out.println("Grass smells bad");
            }

            @Override
            public void wilt() {
                System.out.println("Grass isn't wilting");
            }
        });


    }
}
