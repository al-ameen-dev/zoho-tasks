package employee;

public abstract class Employee {
	String name;
	int employeeId;

	Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	abstract public double calculatePay();
	abstract public void showEmployeeDetails();

	public String getEmployeeDetails() {
		return  "EMPLOYEE { Name:"+this.name+" Employee Id:"+this.employeeId+" }";
	}
	
	String getName() {
		return name;
	}
	
	int getEmployeeId() {
		return employeeId;
	}
}
