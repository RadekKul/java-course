package pl.com.rkulikowski.java14.data_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTimeExample {

    // inna biblioteka, nowa, calkiem nowe metody i sposoby wypisywania dat

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();  // wypisanie czasu z teraz
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(18,5);
        System.out.println(localTime1);

        LocalTime fiveMinutesEarlier = localTime1.minusMinutes(5);

        System.out.println("Local time: " + localTime1);
        System.out.println("5 minutes ago local time: " + fiveMinutesEarlier);

        System.out.println("////////////////");

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate bitwGrunwald = LocalDate.of(1410,7,15);
        System.out.println(bitwGrunwald);

        System.out.println(localDate.getMonth());

        System.out.println("//////////////");

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);       // metoda ktora moze laczyc inne, no Data + czas

        System.out.println(localDateTime1);

        String formatedTime = localDateTime.format(DateTimeFormatter.ofPattern("YYYY_MM_dd : HH:mm"));  // formatowanie daty, jest w dokumentacji DateTimeFormatter, symbole od 280 linijki, podajemy s Stringu

        System.out.println("Formated Time: " + formatedTime);   // i wypisze nam nasze sformatowane daty, tak jak sobie wypisalismy

        // przechodzenie ze starej daty na nowa (stara biblioteka na nowa)

        Date maybeNow = new Date();
        maybeNow.getTime(); // bierzemy liczbe w longu

        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(maybeNow.toInstant(), ZoneId.systemDefault());  // w taki sposob przechodzimy, znaleziono na stackoverflow.com, strefa domyslna z systtemu- default
        System.out.println("Intant form Date: \n" + maybeNowNewWay);

        // Mozna tez w taki sposob zrobic instance
        //Instant instant = Instant.ofEpochMilli(maybeNow.getTime());
        //LocalDateTime maybeNowNewWay2 = LocalDateTime.ofInstant(instant,ZoneId.systemDefault());
    }
}
