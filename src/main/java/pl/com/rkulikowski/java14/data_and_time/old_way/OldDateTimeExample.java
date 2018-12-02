package pl.com.rkulikowski.java14.data_and_time.old_way;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample {

    public static void main(String[] args) {
        Date now = new Date(); //Ctrl+P podpowiada parametry jakie mozna wpisac, to jest stworzenie daty z teraz, java util pobiera samo date i robi toStringa automatycznie
        System.out.println("now: " + now);

        System.out.println(now.getTime());  // ilosc milisekund od 1 stycznia 1970

        Date nowAgain = new Date(1543152390583L); // ten czas do wpisania z parametrem long jest od 1 stycznia 1970 roku w milisekundach

        System.out.println(nowAgain);

        Date tomorow = new Date(1543152435752L + (24*60*60*1000));  // dodanie do dzis 24 h przemienione na ms
        System.out.println(tomorow);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime());

        System.out.println();

        calendar.add(Calendar.DAY_OF_MONTH, -1);    // od pola ktore przechowuje dzien miesiaca odejmij 1, wiec cofneliscmy czas o dzien
        System.out.println(calendar.getTime());

        System.out.println();

        calendar.setTime(new Date());   // tu resetujemy czas na dzis bo wyzej cofnelismy o dzien

        calendar.add(calendar.DAY_OF_MONTH,-1);
        calendar.add(calendar.YEAR,-1);
        System.out.println("Date in past: " + calendar.getTime());

    }
}
