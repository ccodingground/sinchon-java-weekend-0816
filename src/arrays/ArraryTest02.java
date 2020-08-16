package arrays;

public class ArraryTest02 {

	public static void main(String[] args) {
		int row=3;
		int column=4;
		int[][] arr=new int[row][column];
		
		int count=1;
		for(int i=0; i<column; i++) {
			if(i%2 == 0) {//i: 0,2
				//순차접근
				for(int j=0; j<row; j++) {
					arr[j][i]=count++;
				}
			}else {//i:1,3
				//뒤에서 순차접근
				for(int j=row-1; j>=0; j--) {
					arr[j][i]=count++;
				}
			}
		}
		
		
		//출력 순차적접근
		for(int i=0; i<row ; i++) {
			for(int j=0; j<column ; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();//줄바꿈
		}
		
		

	}

}
