package arrays;

public class ArraryTest03 {

	public static void main(String[] args) {
		int n=5;
		int[][] arr=new int[n][n];
		int count=1;
		int out=n*2-1;
		for(int i=0; i<out ; i++) {//i:0,1,2,3,4,5,6
			if(i<4) {//i:0,1,2,3
				int r=0;
				for(int j=i; j >=0; j--) {
					arr[r++][j]=count++;
				}
			}else {//i:4,5,6
				int r=(i-n)+1;
				for(int j=n-1 ; j >=(i-n)+1 ; j--) {
					arr[r++][j]=count++;
				}
			}
		}
		//1,3 2,2 3,1
		//2,3 3,2 
		//3,3
		
		
		
		//출력 순차적접근
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();//줄바꿈
		}
		
		

	}

}
