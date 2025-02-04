package Day04;

import java.util.Scanner;

public class Ex06_Arrays {
	//비정방행렬
	
	public static void main(String[] args) {
		
		//행만 입력해두고
		int arr[][] = new int[3][];
		
		//각 행에 따른 열 따로 입력
		arr[0]= new int[2];
		arr[1]= new int[4];
		arr[2]= new int[2];
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++ ) {
			System.out.println(i+"번 인덱스 안의 배열의 요소를 입력하시오" );
			System.out.print(arr[i].length + "개의 수를 입력하시오 : ");
			for(int j=0; j<arr[i].length; j++) {
				int num=sc.nextInt();
				arr[i][j]=num;
			}
			
		}
		
		

		//출력
		for(int i=0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("["+i+"]" + " , "+"[" + j+ "]" +" = " + arr[i][j]);
			}
			
		}
		sc.close();
	}
}
