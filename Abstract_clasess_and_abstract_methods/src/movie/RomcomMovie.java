package movie;

public class RomcomMovie extends Movie {
	private String mainCouple;

	public RomcomMovie(String title, int duration,String mainCouple) {
		super(title, duration);
		this.mainCouple = mainCouple;
	}

	public String getMainCouple() {
		return mainCouple;
	}

	@Override
	void displayInfo() {
		System.out.println("Movie Information: Romcom Movie");
		System.out.println("Title :" + this.getTitle());
		System.out.println("Duration :" + this.getDuration());
		System.out.println("Main Couple :" + this.getMainCouple());
	}

	@Override
	void displayAboutTheGenre() {
		System.out.println("\nAbout the Romcom Movies:\n");
		System.out.println("Romantic comedies, often affectionately "
				+ "abbreviated as romcoms, are a beloved genre in film \n"
				+ "that blend romance and humor to create heartwarming "
				+ "and entertaining stories. These films typically \n"
				+ "revolve around the romantic journey of endearing characters "
				+ "who face various obstacles and misunderstandings on \n"
				+ "their path to love. With their witty dialogue, charming "
				+ "characters, and feel-good plots, romcoms aim to elicit \n"
				+ "laughter, warmth, and sometimes even tears from audiences. "
				+ "Whether set against the backdrop of bustling cities,\n "
				+ "picturesque countryside, or exotic locales, romcoms "
				+ "offer a delightful escape into the whimsical world of love,\n "
				+ "showcasing the beauty and hilarity of human relationships. "
				+ "From classic favorites to modern interpretations, romcoms \n"
				+ "continue to captivate audiences worldwide with their timeless \n"
				+ "appeal and enchanting storytelling.");
	}

}
