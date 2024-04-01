import java.util.List;

public class TeamDTO {
    private String teamName;
    private String city;
    private String division;
    private List<PlayerDTO> players;

    public TeamDTO() {
    }

    public TeamDTO(String teamName, String city, String division, List<PlayerDTO> players) {
        this.teamName = teamName;
        this.city = city;
        this.division = division;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "TeamDTO{" + "teamName='" + teamName + '\'' + ", city='" + city + '\'' + ", division='" + division + '\'' + ", players=" + players + '}';
    }
}
