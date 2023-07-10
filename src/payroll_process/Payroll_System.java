package payroll_process;
abstract class Employee
{
	String phone_number;
	String email_id;
	
	abstract double calculatePay();
	
}
class Salaried_Employees extends Employee
{
	private String name;
	private double salary;
	Salaried_Employees()
	{
		
	}
	Salaried_Employees(String name,String email_id,String phone_number,double salary)
	{
		super.email_id=email_id;;
		super.phone_number=phone_number;
		this.name=name;
		this.salary=salary;
	}

	public double getSalary() {			// per month
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculatePay()		// per year
	{
		return this.salary*12;
	}
	public void getDetails(Salaried_Employees object)
	{
		System.out.println("Name : "+object.name);
		System.out.println("Email : "+object.email_id);
		System.out.println("Phone Number : "+object.phone_number);
		System.out.println("Salary per month : "+object.getSalary());
		System.out.println("Salary per year : "+object.calculatePay());
		System.out.println("-------------------------------");
	}
}
class Hourly_Employees extends Employee
{
	String name;
	double hourlyRate;
	double hoursWorked;
	
	
	public double getSalary()		//per month
	{
		return this.hourlyRate*this.hoursWorked*30;
	}
	public double calculatePay() 		//per year
	{
		return 12*getSalary();
	}
	public Hourly_Employees(String name, String email, String phone_number, double hourly_rate, double hours_worked) {
		// TODO Auto-generated constructor stub
		this.name=name;
		super.email_id=email;
		super.phone_number=phone_number;
		this.hourlyRate=hourly_rate;
		this.hoursWorked=hours_worked;
		
	}
	public void getDetails(Hourly_Employees object)
	{
		System.out.println("Name : "+object.name);
		System.out.println("Email : "+object.email_id);
		System.out.println("Phone Number : "+object.phone_number);
		System.out.println("Salary per month : "+object.getSalary());
		System.out.println("Salary per year : "+object.calculatePay());
		System.out.println("-------------------------------");
	}
}
public class Payroll_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaried_Employees employee_salary=new Salaried_Employees("A","A@gmail.com","1234567898",10000.0);
		Hourly_Employees employee_hourly=new Hourly_Employees("B","B@gmail.com","1478523691",50.0,8.0);
		employee_salary.getDetails(employee_salary);
		employee_hourly.getDetails(employee_hourly);

	}

}
