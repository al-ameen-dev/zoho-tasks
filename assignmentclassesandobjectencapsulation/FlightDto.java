package assignmentClassesAndObject;

/*
Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
 */

public class FlightDto {
private String flightName;
private static int seats;
private String flightCompany;
private int noOfFlight;
private int flightEmployee;

public FlightDto(String flightName, String flightCompany, int noOfFlight, int flightEmployee) {
	this.flightName = flightName;
	this.flightCompany = flightCompany;
	this.noOfFlight = noOfFlight;
	this.flightEmployee = flightEmployee;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public static int getSeats() {
	return seats;
}
public static void setSeats(int seats) {
	FlightDto.seats = seats;
}
public String getFlightCompany() {
	return flightCompany;
}
public void setFlightCompany(String flightCompany) {
	this.flightCompany = flightCompany;
}
public int getNoOfFlight() {
	return noOfFlight;
}
public void setNoOfFlight(int noOfFlight) {
	this.noOfFlight = noOfFlight;
}
public int getFlightEmployee() {
	return flightEmployee;
}
public void setFlightEmployee(int flightEmployee) {
	this.flightEmployee = flightEmployee;
}
@Override
public String toString() {
	return "FlightDto [flightName=" + flightName + ", flightCompany=" + flightCompany + ", noOfFlight=" + noOfFlight
			+ ", flightEmployee=" + flightEmployee + "]";
}

}
