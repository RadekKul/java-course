package pl.com.rkulikowski.homework;

public class zad4 {

    public static void main(String[] args) {

        int randomNumber;
        int min = -150;
        int max = 150;

        int randomNumber2;
        int min2 = -10;
        int max2 = 10;

        int iloscLosowan=0;
        double suma1=0;
        double iloczyn2=1;

        double stosunek;


        while(true){

        randomNumber = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println("random 1 = " + randomNumber);
        iloscLosowan++;

        if(randomNumber>0 && randomNumber%2==0){
            suma1 = suma1 + randomNumber;
        }

        if(randomNumber==0) {

            for(int i=0; i<iloscLosowan;i++) {

                randomNumber2 = min2 + (int) (Math.random() * ((max2 - min2) + 1));
                System.out.println("random 2 = " + randomNumber2);

                if(randomNumber2<0 && randomNumber2%2==-1){

                    iloczyn2 = iloczyn2 * randomNumber2;
                }
            }

            stosunek=suma1/iloczyn2;

            System.out.println("Stosunek = " + stosunek);
            System.exit(0);

        }

        }
    }
}
