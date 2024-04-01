import java.util.List;

public class MovieDTO {
    private String title;
    private int year;
    private String director;
    private List<String> actors;
    private String genre;
    private double rating;

    // Constructors
    public MovieDTO() {
    }

    public MovieDTO(String title, int year, String director, List<String> actors, String genre, double rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieDTO{" + "title='" + title + '\'' + ", year=" + year + ", director='" + director + '\'' + ", actors=" + actors + ", genre='" + genre + '\'' + ", rating=" + rating + '}';
    }
}
