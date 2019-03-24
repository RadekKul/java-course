package pl.com.rkulikowski.homework.zad7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


            Person kamil = new Person("Kamil", "Czubaszek", 25, 'M', 182);
            Person przemek = new Person("Przemek", "Matenko", 32, 'M', 195);
            Person kasia = new Person("Kasia", "Chujasia", 23, 'K', 180);
            Person weronika = new Person("Weronika", "Czubaszek", 20, 'K', 150);

        List<Person> listaOsob = new ArrayList<>();

        listaOsob.add(kamil);
        listaOsob.add(przemek);
        listaOsob.add(kasia);
        listaOsob.add(weronika);

        double wiekMezczyzn = 0;
        double iloscMezczyzn = 0;

        double wiekKobiet = 0;
        double iloscKobiet = 0;

        double stosunekSredniejWieku;

        for (Person osoba: listaOsob) {

            if(osoba.getPlec() == 'M'){

                wiekMezczyzn += osoba.getWiek();
                iloscMezczyzn = iloscMezczyzn+1;

                osoba.setWzrost(osoba.getWzrost()+1);
                System.out.println("Zwiększono wzrost " + osoba.getImie() + " o jeden i wynosi teraz " + osoba.getWzrost());

            }else {

                wiekKobiet += osoba.getWiek();
                iloscKobiet = iloscKobiet+1;

                if (osoba.getWzrost()<165){
                    System.out.println(osoba.getImie() + " ma mniej niz 165 cm");
                }

            }
        }

        stosunekSredniejWieku = (wiekMezczyzn/iloscMezczyzn)/(wiekKobiet/iloscKobiet);

        System.out.println("Stosunek: " + stosunekSredniejWieku);


    }
}
