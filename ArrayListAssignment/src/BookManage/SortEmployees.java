package BookManage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Write a program that sorts an ArrayList of custom objects based on a specific property using a custom comparator class implementing the Comparator interface.
 */
class Employees {
	private int empid;
	private String empName;
	private int age;
	
	public Employees(int empid,String empName,int age) {
		this.empid = empid;
		this.empName =empName;
		this.age =age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", age=" + age + "]";
	}
}

class EmployeeSorter implements Comparator<Employees>{
	@Override
	public int compare(Employees o1, Employees o2) {
		return Integer.compare(o1.getEmpid(), o2.getEmpid());
	}
}

public class SortEmployees{
	public static void main(String[] args) {
		List<Employees> employeesList = new ArrayList<Employees>();
		employeesList.add(new Employees(3,"Mark zuckerberg",35));
		employeesList.add(new Employees(10,"John",30));
		employeesList.add(new Employees(22,"Al Ameen",22));
		employeesList.add(new Employees(12,"Bill gates",55));
		employeesList.add(new Employees(2,"Elon musk",50));
		employeesList.add(new Employees(1,"jeff bezos",55));
		employeesList.add(new Employees(33,"Dennis ritchie",76));
		employeesList.add(new Employees(43,"James gosling",65));
		Collections.sort(employeesList,new EmployeeSorter());
		employeesList.stream().forEach(emp->System.out.println(emp));
	}
}
