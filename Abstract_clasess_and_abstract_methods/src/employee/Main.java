package employee;

import java.util.Scanner;

/*
Change Employee class as abstract and add abstract methods like calculatePay() with concrete methods like getEmployeeDetails(), etc.
Extend this abstract class in subclasses - HourlyEmployee and SalariedEmployee.
Allow the user to input details of employees and calculate their respective pay using the abstract class reference.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter details for Hourly Employee:");
		System.out.print("Name: ");
		String hourlyName = scanner.nextLine();
		System.out.print("Employee ID: ");
		int hourlyId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Hourly Rate: ");
		double hourlyRate = scanner.nextDouble();
		System.out.print("Hours Worked: ");
		int hoursWorked = scanner.nextInt();

		HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyName,hourlyId, hourlyRate, hoursWorked);

		System.out.println("\nEnter details for Salaried Employee:");
		System.out.print("Name: ");
		scanner.nextLine();
		String salariedName = scanner.nextLine();
		System.out.print("Employee ID: ");
		int salariedId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Monthly Salary: ");
		double monthlySalary = scanner.nextDouble();

		SalariedEmployee salariedEmployee = new SalariedEmployee(salariedName, salariedId, monthlySalary);

		System.out.println("\nHourly Employee Details:");
		hourlyEmployee.showEmployeeDetails();

		System.out.println("\nSalaried Employee Details:");
		salariedEmployee.showEmployeeDetails();

		scanner.close();
	}
}
