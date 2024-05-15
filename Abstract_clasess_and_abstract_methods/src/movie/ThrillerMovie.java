package movie;

public class ThrillerMovie extends Movie{
	
	private String plotTwist;
	public ThrillerMovie(String title, int duration,String plotTwist) {
		super(title, duration);
		this.plotTwist = plotTwist;
	}

	@Override
	void displayInfo() {
		System.out.println("\nMovie Information: Thriller Movie");
		System.out.println("Title :"+this.getTitle());
		System.out.println("Duration :"+this.getDuration());
		System.out.println("Main Couple :"+this.getPlotTwist());
		
	}
	
	public String getPlotTwist() {
		return plotTwist;
	}

	@Override
	void displayAboutTheGenre() {
		System.out.println("\nAbout the thriller Movie:\n");
		System.out.println("\nThriller movies are a gripping and suspenseful "
				+ "genre that keeps audiences on the edge of their seats.\n "
				+ "These films often feature intense plotlines filled with "
				+ "mystery, danger, and unexpected twists. Thrillers can \n"
				+ "encompass various subgenres, including psychological thrillers, "
				+ "crime thrillers, and suspense thrillers, each offering a unique \n"
				+ "blend of excitement and intrigue. From heart-pounding chase "
				+ "scenes to intricate plots that keep viewers guessing until \n"
				+ "the very end, thriller movies are known for their ability "
				+ "to provoke adrenaline and suspenseful anticipation. With \n"
				+ "compelling characters, complex narratives, and atmospheric "
				+ "settings, thriller films aim to captivate audiences and \n"
				+ "deliver an unforgettable cinematic experience filled with \n"
				+ "thrills and excitement.");
		
	}
	
}
