package interfaces;

public interface InterTest {
	//추상메서드만 허용한다.
	abstract void disp();
	void disp1();//abstract 생략해도 추상메서드
	 //추상클래는 생성자 있으나 생성자기능을 사용못한다.
	//interface 는 생성자가 없다.
	//public InterTest(){}
	//void display() {}
	//1.8 
	//일반메서드{}가있는 메서드를 허용할려면 default 키워드를 써주세요
	default void display() {		
	}
	static void display2() {}
}
