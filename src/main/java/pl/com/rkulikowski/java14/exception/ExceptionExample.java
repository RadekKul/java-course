package pl.com.rkulikowski.java14.exception;

public class ExceptionExample {

    public static void main(String[] args) throws MyException {

        MyExceptionThrower exception1 = new MyExceptionThrower();

  //      try { // jak sobie zakomentujemy to i dodamy wyzej do maina throws MyException, to program zatrzyma sie odrazu na wyjatku, nie bedzie kontynuowany
            exception1.throwMyException();
            System.out.println("here"); // jezeli java znajdzie jakis wyjatek, to nawet nie wykona tej linijki, tylko odrazu skoczy do catch, i zrobi to co tam jest
                                        // jezeli bysmy zakomentowali throws w tym throwMyException, to wypisaloby here, bo by nie wyrzucilo wyjatku
       /* } catch (MyException e) {       // wniosek taki ze jezeli przechwycamy wyjatek to wazne zeby cos wyrzucic zeby bylo wiadome
                                         // tam gdzie w try zostanie rzucony wyjatek, przestaje sie wykonywac to co w try i przechodzi odrazu do catch!!!

           e.printStackTrace();    // ta linijka drukuje nam to co jest przypisane do takiego wyjatku
        }*/
        System.out.println("here 2");   // to sie wyswietli bo wyjatek zostal obsluzony, ale program idzie dalej bo to jest nasze obsluzenie, celowe.
                                        // w try warto wyswietlac kod ktory jest "niebzepieczny" - moze sie wywalic, dzieki temu mozemy przejac jakies wyjatki
    }
}
