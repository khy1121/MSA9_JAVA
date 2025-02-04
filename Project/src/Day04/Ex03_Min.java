package Day04;

import java.util.Scanner;

public class Ex03_Min {
	//첫번째 줄에 입력할 개수 n을 입력받고
	//둘때 줄에 n개의 정수를 공백을 두고 입력받으시오.
	//n개의 정수 중 최솟값을 구하시오
	//ex
	//5
	//90 10 20 40 50
	//출력 : 최댓값 : 10
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 개수를 입력하시오 : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"번째 배열의 점수를 입력하시오 :");
			arr[i]=sc.nextInt();
		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) { //배열의 값보다 최솟값 변수가 크다면
				min =arr[i]; // 최솟값에 해당하는 배열의 값 대입
			}
		}
		System.out.println("최솟값 : " + min);
		
		sc.close();
	}
}
