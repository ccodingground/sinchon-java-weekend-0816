package override;

public class Cat extends Animal{
	//메서의 재정의
	//똑같은 메서드는 존재할수 없다.
	//있는것처럼 보이지만 Override 된 메서드입니다.
	//@Override 
	void move(){
		//super.move();
		System.out.println("고양이가 살금살금 걸어갑니다.");
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
