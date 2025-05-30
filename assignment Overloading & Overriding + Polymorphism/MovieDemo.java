
/*
Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc.
 Demonstrate polymorphism using them.
 */
class Movie {
    private String title;
    private int duration;
    private String genre;

    public Movie(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
    }
}

class RomComMovie extends Movie {
    private String mainCouple;

    public RomComMovie(String title, int duration, String mainCouple) {
        super(title, duration, "Romantic Comedy");
        this.mainCouple = mainCouple;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Main Couple: " + mainCouple);
    }
}

class ThrillerMovie extends Movie {
    private String plotTwist;

    public ThrillerMovie(String title, int duration, String plotTwist) {
        super(title, duration, "Thriller");
        this.plotTwist = plotTwist;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Plot Twist: " + plotTwist);
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        Movie movie1 = new RomComMovie("When Harry Met Sally", 95, "Harry and Sally");
        Movie movie2 = new ThrillerMovie("The Sixth Sense", 107, "I see dead people");

        System.out.println("Romantic Comedy Movie:");
        movie1.displayInfo();

        System.out.println("Thriller Movie:");
        movie2.displayInfo();
    }
}
