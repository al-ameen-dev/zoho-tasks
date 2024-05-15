package employee;

public class HourlyEmployee extends Employee {
	double hourlyRate;
	int hoursWorked;

	HourlyEmployee(String name, int employeeId,double hourlyRate,int hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("EMPLOYEE { Name:"+this.getName()+" Employee Id:"+this.getEmployeeId()+" Salary:"+calculatePay()+" }");
	}

}
