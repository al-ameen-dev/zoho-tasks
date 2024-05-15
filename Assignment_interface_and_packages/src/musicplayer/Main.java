package musicplayer;

/*
Define an interface named Playable with methods like play() , pause() , and stop() .
Implement this interface in classes representing different types of music players such as MP3Player , CDPlayer , and StreamingPlayer .
Allow the user to control the playback of these players through the implemented interface.

 */
public class Main {
	public static void main(String[] args) {
		Playable mp3Player = new Mp3Player();
		Playable streamingPlayer = new StreamingPlayer();
		Playable cdPlayer = new CDPlayer();
		mp3Player.play();
		streamingPlayer.pause();
		cdPlayer.stop();
	}
}
