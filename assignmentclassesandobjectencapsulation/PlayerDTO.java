public class PlayerDTO {
    private String playerName;
    private String position;
    private int jerseyNumber;

    public PlayerDTO(){
    }
    public PlayerDTO(String playerName, String position, int jerseyNumber) {
        this.playerName = playerName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" + "playerName='" + playerName + '\'' + ", position='" + position + '\'' + ", jerseyNumber=" + jerseyNumber + '}';
    }
}
