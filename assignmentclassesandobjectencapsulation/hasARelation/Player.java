package assignmentClassesAndObject.hasARelation;

public class Player  {
private String playerName;
private String playerPosition;
private int jerseyNumber;

public void playGame() {
	System.out.println("player ready");
}
public void train() {}

public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getPlayerPosition() {
	return playerPosition;
}
public void setPlayerPosition(String playerPosition) {
	this.playerPosition = playerPosition;
}
public int getJerseyNumber() {
	return jerseyNumber;
}
public void setJerseyNumber(int jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
}

}
