package override;

public class Dog extends Animal{
	//메서의 재정의
	//똑같은 메서드는 존재할수 없다.
	//있는것처럼 보이지만 Override 된 메서드입니다.
	//@Override 
	void move(){
		System.out.println("강아지가 뛰어갑니다.");
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
