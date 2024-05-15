package musicplayer;

public class Mp3Player implements Playable{

	@Override
	public void play() {
		System.out.println("Music Player is playing!");
		
	}

	@Override
	public void pause() {
		System.out.println("Music Player is paused!");
		
	}

	@Override
	public void stop() {
		System.out.println("Music Player is stopped!");
		
	}

}
