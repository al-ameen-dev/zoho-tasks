
/*
Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and override getEmployeeDetails.
Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
 */
abstract class Employee{
    String name;
    int age;
    String phoneNo;
    String email;
    int salary;
    Employee(String name,int age,String phoneNo,String email,int salary){
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
        this.salary = salary;
    }

    abstract public void getEmployeeDetails();
}

class HourlyEmployee extends Employee{
    HourlyEmployee(String name, int age, String phoneNo, String email, int salary) {
        super(name, age, phoneNo, email, salary);
    }

    public void getEmployeeDetails() {
        System.out.println("Hourly Employee:");
        System.out.println("Name :" +name+" Age:"+age+" Phone No:"+phoneNo+" Email:"+email+" Salary:"+salary);
    }
}

class SalariedEmployee extends Employee{

    SalariedEmployee(String name, int age, String phoneNo, String email, int salary) {
        super(name, age, phoneNo, email, salary);
    }

    public void getEmployeeDetails() {
        System.out.println("Salaried Employee:");
        System.out.println("Name :" +name+" Age:"+age+" Phone No:"+phoneNo+" Email:"+email+" Salary:"+salary);
    }
}




public class EmployeeDemo {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("al ameen",22,"8768578547","al@gmail.com",40000);
        Employee hourlyEmployee = new HourlyEmployee("ameen",21,"8876578547","ameen@gmail.com",20000);
        salaridEmployee.getEmployeeDetails();
        hourlyEmployee.getEmployeeDetails();
    }
}
