package ex;

public class AbstractDemo {
	
	public static void main(String[] args) {
		//Employee e=new Employee("검은사막", "서울시 서대문구 신촌", 111) {};
		//Employee e=new Employee("검은사막", "서울시 서대문구 신촌", 111);
		//e.mailCheck();
		
		Salary s=new Salary("유지은", "서울", 10, 80000000);
		Employee e=new Salary("은지", "서울", 11, 70000000);
		
		s.mailCheck();
		e.mailCheck();
	}

}
