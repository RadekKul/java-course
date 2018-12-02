package pl.com.rkulikowski.java14.enum_example;

public class Main {

    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;
        System.out.println(maybeSummer.name()); // zwraca nazwe tego z typu obliczeniowego, bo w Enum toString jest nadpisany ze zwraca name, tak czy siak

        maybeSummer = Seasons.WINTER;
        System.out.println(maybeSummer);    //w Enum toString jest nadpisany ze zwraca name, tak czy siak, dlatego i tak z dobrej praktyki pisze sie .name() tak jak wyzej

        WeekDays maybeMonday = WeekDays.MONDAY;

        System.out.println(maybeSummer.ordinal()); // winter jest na idexie 0

        System.out.println();

        for(MonthsOfTheYear months: MonthsOfTheYear.values()){
            System.out.println("Days of the " + months + " = " + months.getNumberOfDays());
        }

        System.out.println();

        for(Subjects subject: Subjects.values()){
            System.out.println("Hours of " + subject + " in week : " + subject.getNumberOfHours());
        }

    }
}
