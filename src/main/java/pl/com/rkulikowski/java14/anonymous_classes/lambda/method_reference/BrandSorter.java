package pl.com.rkulikowski.java14.anonymous_classes.lambda.method_reference;

// umownie kolejnosc parametrow w wywolywanych metodach : <0 - jako pierwszy, >0 jak drugi, =0, obojetnie ktory pierwszy


public class BrandSorter {

    // tworzymy sortowanie po Stringach, alfabetycznie a zwracam nam int, -1 jesli mniejsze, 0 jesli rowny, 1 jesli wiekszy. (w kolejnosc przekazanej). w modelSorter zrobilismy odwrotnie i dostalismy
    // odwrotne wyniki. Czyli porownuje brand2 wzgledem brand 1, jako ze jest aaa mniejsze od bbb wyrzuca nam -1, jesli porownamy odwrotnie to 1

    static int brandOrder(String brand1, String brand2){
        return brand1.compareTo(brand2);    // to zwraca nam inta, porownuje brand1 z brand2, zwroci nam inta to zobaczymy co jest wieksze i potem przy wywoalniu w Mainie nam zaznaczy
    }

}
