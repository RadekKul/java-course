package pl.com.rkulikowski.java14.Computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer pc = new PC();
        Computer laptop = new Laptop();
        Computer mainframe = new Mainframe();

        makeDiskChanged(computer);
        makeDiskChanged(pc);
        makeDiskChanged(laptop);
        makeDiskChanged(mainframe);
        makeDiskChanged(new PC());      // mozna i w taki sposob wywolac metode na nowym obiekcie typu PC

        showTypeOfComputer(computer);
        showTypeOfComputer(pc);
        showTypeOfComputer(laptop);
        showTypeOfComputer(mainframe);

        doPrint(computer);
        doPrint(pc);            // mimo ze dalismy pc, to nie nadpisalo metody static, tylko wzielą ją z nadklasy Computer, musimy recznie wpisac wywolanie metody z Classy PC, zeby zadziałała
                                // tak jak jest zrobione to nizej.
    }

    public static void makeDiskChanged (Computer someComputer){
        System.out.println("Some guy change Disk: ");
        someComputer.changeDisk();
        System.out.println();
    }

    public static void showTypeOfComputer(Computer someComputer){
        System.out.println("The type of Computer: \n"  + someComputer);    // mozna tu napisac someComputer.toString(), lub po prostu someComputer, bo to i tak i tak wywoluje metode toString, bo jest
        System.out.println();                                               // to reprezentacja obiektu.

    }

    public static void doPrint(Computer someComputer){
        //someComputer.print();       // podswietla nam bo chce powiedziec ze nie mozemy metody statycznej przypisywac do obiektu bo on i tak sam nam to przepisze do klasy z ktorej jest ten obiekt
                                        // Static nie wolamy na rzecz referencji tylko na rzecz klas
        Computer.print();               // powinnismy wiec wpisywac NazwaClassy.print()
       //PC.print();                     // dodatkowo nie da sie tego nadpisac, zauważ ze jak sie wyprintuje computer i pc to i tak zawsze wypisze Printed from Computer, dopiero jak wskażemy
        System.out.println();              // PC.print() - czyli bezposredni dostep do nadpisanej metdoy static, da nam wydru z tego miejsca, nawet gdy wywolamy doPrint(computer)
    }
}
