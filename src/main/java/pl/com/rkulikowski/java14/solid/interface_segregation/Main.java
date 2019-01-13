package pl.com.rkulikowski.java14.solid.interface_segregation;

public class Main {

    // Bardzo fajne wykorzystanie zalozen tej zasady, dobrze opisane w StandardEngine i w reszcie klas, ogolnie chodzi o to zeby bazujac na jednym interfjesie zmieniac pod nim rozne klocki, a to nie bedzie
    // widoczne na tym poziomie + metody beda ukryte, my mozemy wlaczyc i wylaczyc pranie, nic wiecej, reszta dzieje sie pod spodem w klasach.

    public static void main(String[] args) {


        WashMachine washMachine = new WashMachine(new PolishEngine(new StandardEngine())); // tworzymy pralke polska ze standardowym silnikiem,
        // pralka jest ucieszona bo ma tylko dwie metody z interfejsu, a reszte przejmuje z innych klas np z Enginge (start stop itp)

        WashMachine washMachine1 = new WashMachine(new ChineaseWrapperEngine(new ChineaseEngine()));

        WashMachine washMachine2 = new WashMachine(new HinduskiWrapperEngine(new HinduskiEngine()));

        WashMachine washMachine3 = new WashMachine(new RussianWrapperEngine(new RussianEngine()));

        washMachine.beginWash();
        washMachine.endWash();

        System.out.println();

        washMachine1.beginWash();
        washMachine1.endWash();

        System.out.println();

        washMachine2.beginWash();
        washMachine2.endWash();

        System.out.println();

        washMachine3.beginWash();
        washMachine3.endWash();


    }
}
