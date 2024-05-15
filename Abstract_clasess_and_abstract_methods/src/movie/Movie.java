package movie;

public abstract class Movie {
	private String title;
	private int duration;

	public Movie(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}

	abstract void displayInfo();

	abstract void displayAboutTheGenre();

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

}