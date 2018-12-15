package pl.com.rkulikowski.java14.stream.team;


import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Player ronaldo = new Player("Ronaldo", 95, BigDecimal.valueOf(30_000));
        Player ronaldinho = new Player("Ronaldinho", 92, BigDecimal.valueOf(20_000));
        Player radinho = new Player("Radinho", 99, BigDecimal.valueOf(50_000));
        Player michalinho = new Player("Michalinho", 45, BigDecimal.valueOf(2_000));
        Player messi = new Player("Messi", 93, BigDecimal.valueOf(35_000));

        Coach guardiola = new Coach("Pep", "Guardiola", BigDecimal.valueOf(10_000));
        Coach mourinho = new Coach("Jose", "Mourinho", BigDecimal.valueOf(13_000));
        Coach smuda = new Coach("Franciszek", "Smuda", BigDecimal.valueOf(3_000));
        Coach nawalka = new Coach("Adam", "Nawalka", BigDecimal.valueOf(5_000));
        Coach zidane = new Coach("Zinedine", "Zidane", BigDecimal.valueOf(12_000));

        // ogolnie klasy z dodatkiem s np Objects, Arrays, sa to klasy z metodami pomocniczymi do ich klas glownych tj Object Array itd, wiec tam mozemy cos szukac zawsze
        Team barcelona = new Team(guardiola);
        barcelona.setPlayers(Arrays.asList(ronaldinho,ronaldo));        // Arrays.asList - metoda ktora sama zamieni nam na liste elementy ktore wprowadzimy jako parametry

        Team realMadryt = new Team(mourinho);
        realMadryt.setPlayers(Arrays.asList(messi, michalinho,radinho));

        League championsLeague = new League("Champions League");
        championsLeague.addTeamToLeague(barcelona);
        championsLeague.addTeamToLeague(realMadryt);

        System.out.println(getPlayersOldWay(championsLeague));

        //wyswietlamy wszystkich graczy z ligi a pomoca strumienia
        System.out.println(getAllLeeaguePlayers(championsLeague));

        // wyswietlamy teraz graczy ze skilem 94+, ale to jest slabsza opcja , ponizej jest lepsza, ze w ogolnej metodzie juz wywolujacej graczy sortujemy

        List<Player> players94AndMore = genericFilter(getAllLeeaguePlayers(championsLeague), player -> player.getSkill() >94 );
        System.out.println(players94AndMore);
        // moznaby to samo zrobic dodajac filter w metodzie getAllLeaguePlayers, ale jak zrobimy sobie genericFilter to juz wszystko bedziemy mogli dzieki niemu filtrowac

        System.out.println(getAllLeeaguePlayersWithMoreThan94Skill(championsLeague));    // i tez bedzie dzialac


        // Najlepsze wyjscie to jednak to, jak mamy juz zawodnikow i filtrujemy odrazu w metodzie, np po zawodnikach na R

        List<Player> playersNameR = getAllLeeaguePlayersWithSomeFilter(championsLeague,player -> player.getNick().startsWith("R"));
        System.out.println(playersNameR);

        // rozwiazanie zadania z lista trenerow z imieniem z 4 znakow, najpierw na szybko stworzyc ich liste

        //List<Coach> coachess = Arrays.asList(guardiola,mourinho,smuda,nawalka,zidane);    // moznaby tak stworzyc ale ta lista jest niezmienna, wiec rzadziej sie tego uzywa

        List<Coach> coaches = new ArrayList<>();

        coaches.add(guardiola);
        coaches.add(mourinho);
        coaches.add(smuda);
        coaches.add(nawalka);
        coaches.add(zidane);


        System.out.println(nameLongFilter(coaches));


        // tutaj robimy ostatnia metode czyli wyswietlenie listy dzieki foreachcc przez playersow

        getAllLeeaguePlayers1(championsLeague);

        System.out.println(players);


    }

    private static List<Player> getPlayersOldWay(League league){

        List<Player> result = new ArrayList<>();

        for (Team teams: league.getTeamList()) {
         // moznaby tak zrobic ale ten dolny sposob jest szybszy
            /*for(Player player: teams.getPlayers()){
                result.add(player);
            }*/

            result.addAll(teams.getPlayers());  // addAll to jest metoda ktora dodaje calą liste podana jaka parametr, a do niej podajemy getPlayers z danej druzyny i wszystko smiga
        }
        return result;
    }


    private static List<Player> getAllLeeaguePlayers(League league) {

        // bardzo wazne sa tutaj podpowiedzi

        // dodajemy druzyny do streamienia, ale sa tutaj dwie listsy z dwoch druzyn, wiec nam nie odpowiada taki strumien bo tam zawodnicy sa na oddzielnych listach
        return league.getTeamList().stream()
        // wyciagamy tutaj graczy z danych druzyn, mapujemy po to zeby dostac strumien z czyms co jest w team czyli z playerami (kazda liste z osobna), ale otrzymujemy nadal dwie listy wiec musimy
         // zlaczyc w jedno (rysunek w zeszycie)
                .map(team -> team.getPlayers())
         // tutaj wykonujemy kolejny strumien, za pomoca stream(),ale uzywamy flatMapa do połączenia tych dwoch strumieni w jeden
          // czyli nie pakujemy juz tego co jest spakowane tylko chcemy bez spakowania utworzyc strumien z graczy, dlatego flatMap
         // flatMap razem z funkcja stream() - splaszcza i laczy te strumienie playersow (z dwoch malych strumieni list Playersow w Teamach)
          // w jeden duzy, czyli flatMap mowi przekstalc mi playersow w strumien playersow, czyli wybierz z list roznych druzyn i walnij w jedno
                .flatMap(players -> players.stream())
         // i na koniec jak sie uda to robimy dodanie do listy.
                .collect(Collectors.toList());
    }


    // ta metode moznaby zamienic zeby filtrowala odrazu nam w sobie tych graczy 94 skilla, ale jak nam potrzebne duzo filtrow to lepiej zrobic genericFilter i na jego podstawie robic rozne filtry
    // zamiast kazdy pojedynczo

    private static List<Player> getAllLeeaguePlayersWithMoreThan94Skill (League league) {

        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(player -> player.getSkill()>94)
                .collect(Collectors.toList());
    }


    // Najlepsze wyjscie jeszcze ponizej, mamy wtedy wszystkich zawodnikow i w srodku ogolny filter i wtedy mozemy filtrowac Playerow po czym tylko chcemy
    private static List<Player> getAllLeeaguePlayersWithSomeFilter (League league, Predicate<Player> predicate) {

        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(predicate)
                .collect(Collectors.toList());
    }

    // odrazu mamy ogolny filter

    private static List<Player> genericFilter (List<Player> players, Predicate<Player> predicate){

        return players.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    // stworzyc metode przyjmujaca liste trenerow i wywalajaca trenerow ktorych imie ma 4 znaki, ale jako Optional, bo moze sie okazac ze nie ma takiego trener

    private static Optional<Coach> nameLongFilter (List<Coach> coaches){

        // puszczamy strumien trenerow, potem filtrujemy odrazu bo mamy strumien Coachow wiec mozemy pobrac ich imiona i porownac
          return coaches.stream()
                 .filter(coach -> coach.getName().length()==4)
                 .findFirst(); // jak zrobimy tak to to wysiwetli nam pierwszego ktory spelni warunek, ale dziala to z Optional wiec jak zaden nie bedzie pasowal to nam o tym powie

        //.collect(Collectors.toList()); // tak tutaj nie zrobimy bo collection nie jest Optionalem wiec sie w ogole nie skonwertuje
    }

    private static List<Player> players = new ArrayList<>();
    private static void getAllLeeaguePlayers1 (League league) {

        league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .forEach(player -> players.add(player));    // wez kazdego kto przyszedl i wpisz do listy powyzej.
    }
}

