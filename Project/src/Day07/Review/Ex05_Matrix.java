package Day07.Review;

import java.util.Scanner;

public class Ex05_Matrix {
	public static void main(String[] args) {
		//양수 M N 입력받아 저장
		// M행 N열 2차월 배열 생성
		// 각 요소의 값을 입력받고 , 그대로 출력
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
	
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기를 입력하시오 : ");
		int M=sc.nextInt();
		System.out.print("열의 크기를 입력하시오 : ");
		int N=sc.nextInt();
		
		int arr[][]= new int[M][N];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(i + "번째 행 "+ j+" 번째 열의 값을 입력하시오 : ");
				arr[i][j]=sc.nextInt();
			}
		}
//		for(int i=0; i<M; i++) {
//			for(int j=0; j<N; j++) {
//				System.out.print(i + "번째 행 "+ j+" 번째 열의 값을 입력하시오 : ");
//				arr[i][j]=sc.nextInt();
//			}
//		}
		
		for(int i=0; i<M; i++) {
			
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
