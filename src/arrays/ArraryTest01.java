package arrays;

public class ArraryTest01 {

	public static void main(String[] args) {
		int n=4;
		int[][] arr=new int[n][n];
		int count=1;
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {//i: 0,2
				//순차접근
				for(int j=0; j<n; j++) {
					arr[i][j]=count++;
				}
			}else {//i:1,3
				//뒤에서 순차접근
				for(int j=n-1; j>=0; j--) {
					arr[i][j]=count++;
				}
			}
		}
		
		
		//출력 순차적접근
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();//줄바꿈
		}
		
		

	}

}
