package employee;

public class SalariedEmployee extends Employee {
	
	double salaryPerMonth;
	
	SalariedEmployee(String name, int employeeId,double salaryPerMonth) {
		super(name,employeeId);
		this.salaryPerMonth = salaryPerMonth;
	}

	@Override
	public double calculatePay() {
		return salaryPerMonth;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("EMPLOYEE { Name:"+this.getName()+" Employee Id:"+this.getEmployeeId()+" Salary:"+calculatePay()+" }");
	}
	
}
