package ex;

public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		this.salary=salary;
		//setSalary(salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double computePay() {
		System.out.println( "Computing salary pay for "+ getName());
		return salary/52;
	}
	@Override
	public void mailCheck() {
		System.out.println("With mailCheck of Salary class");
		System.out.println("Mailling a chenk to "+ getName()+" with salary "+ salary);

	}
	
}
