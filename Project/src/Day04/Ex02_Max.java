package Day04;

import java.util.Scanner;

public class Ex02_Max {
	
	//첫번째 줄에 입력할 개수 n을 입력받고
	//둘때 줄에 n개의 정수를 공백을 두고 입력받으시오.
	//n개의 정수 중 최댓값을 구하시오
	//ex
	//5
	//90 10 20 40 50
	//출력 : 최댓값 : 90
	
	
	/*순서도
	 * 정수 하나 입력받아 N에 대입
	 * N번만큼 N개의 정수 입력받아 배열 arr에 대입
	 * 배열을 반복해서 최댓값 max 배열의 i번째 요소와 비교
	 * 두 요소중 더 큰 요소를 max에 대입
	 * 반복 끝나고, max를 출력
	 * 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//내가 푼 방법
		System.out.print("배열의 개수를 입력하시오 : ");
		int N=sc.nextInt(); //정수를 입력받아서
		int [] arr= new int[N]; // 크기가 N인 배열 arr 생성
		int max=arr[0]; //배열의 최댓값 변수 초기화
		//N대신 arr.length 사용해도 가능
		for(int i=0; i<arr.length; i++) { //0부터 N까지 1씩 증가
			System.out.print(i+"번째 배열의 점수를 입력하시오 :");
			arr[i]=sc.nextInt(); //0부터 N까지 배열의 대한 값 입력
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i+1<arr.length) //i+1이 배열의 크기보다 작을때 
				max = max>arr[i+1] ? max : arr[i+1]; 
				// max의 값이 0번째 인덱스이므로 1번째 배열부터 n번째 배열까지 대소비교 후 큰 값을 max에 삽입
		}
		System.out.print("배열의 최댓값은 " + max);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
		//강의에서 나온 코딩
		System.out.print("배열의 개수를 입력하시오 : ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+"번째 배열의 점수를 입력하시오 :");
			arr1[i]=sc.nextInt();
		}
		
		int max1=Integer.MIN_VALUE;
		for(int i=0; i<arr1.length; i++) {
			if(max1<arr1[i]) {
				max1 =arr1[i];
			}
		}
		System.out.println("최댓값 : " + max1);
		
		sc.close();
	}
}
