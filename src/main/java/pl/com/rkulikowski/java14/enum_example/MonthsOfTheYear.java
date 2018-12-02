package pl.com.rkulikowski.java14.enum_example;

public enum MonthsOfTheYear {

    JANUARY(31),
    FEBRUARY(28){       // w taki sposob mozna nadpisac metody tylko dla jednej instancji, bo np wiemy ze luty nie zawsze ma 28 dni, co 4 lata ma 29, i poprzez nawiasy klamrowe mozemy dac jakies nadpisanie
        @Override
        public int getNumberOfDays(){
            return super.getNumberOfDays();
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    NOVEMBER(31),
    OCTOBER(30),
    DECEMBER(31);

    private int numberOfDays;

    private MonthsOfTheYear(int numberOfDays){
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays(){
        return numberOfDays;    // tu returnujemy to ile miesiac ma dni, czyli to co sie przpyisze w constructorze
    }

}
