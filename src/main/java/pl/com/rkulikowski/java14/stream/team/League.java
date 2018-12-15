package pl.com.rkulikowski.java14.stream.team;

import java.util.ArrayList;
import java.util.List;

public class League {

    private String leagueName;
    private List<Team> teamList = new ArrayList<>();

    // metoda dodajaca druzyne do ligi
    public void addTeamToLeague (Team team){
        teamList.add(team);
    }

    // konstruktor tylko przyjmujacy nazwe ligi
    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
}
