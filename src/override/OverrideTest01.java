package override;

public class OverrideTest01 {

	public static void main(String[] args) {

		//다형성
		int n=1;//1.dog 2.cat
		Animal ani=null;
		
		if(n==1) {
			ani=new Dog();
		}else if(n==2) {
			ani=new Cat();
		}
		
		ani.move();
		
		
		if(n==1) {
			Dog dog=new Dog();
			dog.move();
		}else if(n==2) {
			Cat cat=new Cat();
			cat.move();
		}
		//추상클래스는 단독객체생성불가능합니다.
		//다른클래스에 상속시켜서 사용하세요
		//Animal a=new Animal();

	}

}
