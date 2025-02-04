package Day04;

public class Ex05_Arrays {
	//2차원 배열 선언 
	// - 1차원: 2 (2행)
	// - 2차원: 3 (3열)
	
	public static void main(String[] args) {
		
		int arr[][]= new int[2][3];
		
		arr[0][0]= 1;
		arr[0][1]= 2;
		arr[0][2]= 3;
		
		arr[1][0]= 4;
		arr[1][1]= 5;
		arr[1][2]= 6;
		
		int i=0,j=0;
		for(i=0;i<arr.length;i++) { //1차원의 배열 요소의 개수
			for(j=0;j<arr[i].length;j++) { //2차원의 배열 요소의 개수 
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int [][] week= {{1,2,3},{4,5,6}};
			for(i=0;i<week.length;i++) { //1차원의 배열 요소의 개수
				for(j=0;j<week[i].length;j++) { //2차원의 배열 요소의 개수 
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
	}
	
}
