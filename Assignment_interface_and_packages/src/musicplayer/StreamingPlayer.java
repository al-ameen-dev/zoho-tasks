package musicplayer;

public class StreamingPlayer implements Playable{

	@Override
	public void play() {
		System.out.println("Streaming player is playing!");
		
	}

	@Override
	public void pause() {
		System.out.println("Streaming player is paused!");
		
	}

	@Override
	public void stop() {
		System.out.println("Streaming player is stopped!");
		
	}

}
