package interfaces;

public interface InterTest02 {
	 static final int a=10;//final필드입니다.
	 int b=200;//기본으로 필드 무조건 final필드입니다.
	 
	 default void disp() {
		 //a=100;//final필드는 수정불가
		// b=20;
		 
	 }
	 class DD{}
}
