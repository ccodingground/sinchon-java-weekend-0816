package ex;

public abstract class Employee {
	private String name;
	private String address;
	private int number;
	//public Employee() {}
	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay() {
		System.out.println("Employee computPay");
		return 0.0;
	}

	/*
	 * public void mailCheck() { System.out.println("Mailling a chenk to "+
	 * name+" "+ address); }
	 */
	public abstract void mailCheck();
	@Override
	public String toString() {
		return name+" "+address+" "+number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNumber() {
		return number;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
