package assignmentClassesAndObject;

/*
 Create a Movie DTO class.
 */
public class MovieDTO {
private String movieName;
private String dirctorName;
private String HeroName;
private String HeroineName;
private int noOfActors;
public MovieDTO(String movieName, String dirctorName, String heroName, String heroineName, int noOfActors) {
	super();
	this.movieName = movieName;
	this.dirctorName = dirctorName;
	HeroName = heroName;
	HeroineName = heroineName;
	this.noOfActors = noOfActors;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getDirctorName() {
	return dirctorName;
}

public void setDirctorName(String dirctorName) {
	this.dirctorName = dirctorName;
}

public String getHeroName() {
	return HeroName;
}

public void setHeroName(String heroName) {
	HeroName = heroName;
}

public String getHeroineName() {
	return HeroineName;
}

public void setHeroineName(String heroineName) {
	HeroineName = heroineName;
}

public int getNoOfActors() {
	return noOfActors;
}

public void setNoOfActors(int noOfActors) {
	this.noOfActors = noOfActors;
}

@Override
public String toString() {
	return "MovieDTO [movieName=" + movieName + ", dirctorName=" + dirctorName + ", HeroName=" + HeroName
			+ ", HeroineName=" + HeroineName + ", noOfActors=" + noOfActors + "]";
}

}
