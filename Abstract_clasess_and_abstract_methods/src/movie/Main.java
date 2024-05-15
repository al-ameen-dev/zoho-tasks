package movie;

/*
Change 'Movie' class to abstract class and add additional abstract methods in 'Movie' class and define them in the child classes.
 */
public class Main {
	  public static void main(String[] args) {
	        Movie movie1 = new RomcomMovie("When Harry Met Sally", 95, "Harry and Sally");
	        Movie movie2 = new ThrillerMovie("The Sixth Sense", 107, "I see dead people");

	        movie1.displayInfo();
	        movie1.displayAboutTheGenre();

	        movie2.displayInfo();
	        movie2.displayAboutTheGenre();
	    }
}
