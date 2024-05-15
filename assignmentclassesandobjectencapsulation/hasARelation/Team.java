package assignmentClassesAndObject.hasARelation;

/*
 Write two DTO classes to exhibit the has-a relationship.
 */

public class Team {
    private String teamName;
    private String teamCity;
    private String teamDivision;
	private List<Player> playerList;

	public Team(){
	}

	public Team(String teamName, String teamCity, String teamDivision, List<Player> playerList) {
		this.teamName = teamName;
		this.teamCity = teamCity;
		this.teamDivision = teamDivision;
		this.playerList = playerList;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void addPlayer(Player player){
		this.playerList.add(player);
	}
	public void playGame() {
        System.out.println("team ready");
    }

    public void hireCoach() {

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamDivision() {
        return teamDivision;
    }

    public void setTeamDivision(String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public static void main(String[] args) {
        Team t = new Team();
    }
}
