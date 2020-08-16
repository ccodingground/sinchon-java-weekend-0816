package arrays;

import java.util.ArrayList;
import java.util.Vector;

class AAA{
	int a;
	double b;
	String c;
}
public class ListTest {

	public static void main(String[] args) {
		
		//배열의 단점 처음에 사용할때 사이즈를 정해줘야한다..
		int[] arr=new int[4];
		//arr[0]~
		AAA[] aa=new AAA[100];
		
		//무한배열의 일종
		Vector<Integer> list=new Vector<>();
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) );
		}
			
	}

}
