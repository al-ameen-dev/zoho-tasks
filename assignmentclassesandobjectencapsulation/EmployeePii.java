package assignmentClassesAndObject;

/*
Create an Employee DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
Maintain encapsulation by giving controlled access to employee's PII.
 */
public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;

	private static int nextEmployeeId = 1;

	public Employee(String firstName, String lastName, String email, double salary) {
		this.employeeId = nextEmployeeId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public static int getNextEmployeeId() {
		return nextEmployeeId;
	}
}
