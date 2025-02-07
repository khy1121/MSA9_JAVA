package Day07.Review;

import java.util.Scanner;

public class Ex06_Method {
	
	/**
	 * 덧셈 메소드
	 * -김헌영
	 * @param a 첫번째 피연산자
	 * @param b 두번째 피연산자
	 * @return 덧셈 결과
	 */
	public static int plus(int a, int b) {
		return a+b;
	}
	// 메소드 정의
	// : 접근 지정자 (static ) 반환타입 매소드명 (매개변수) { }
	
	public static int minus(int a, int b) {
		if(a<0 || b<0)
			return 0;
		if(a>500 || b>500)
			return 0;
		return (a>b ? a-b : b-a);
		//return (값) ;
		// 1 (값)을 메소드를 호출한 자리로 반환
		// 2 메소드 종료
		// 3 메모리 해제 
	}
	
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("a의 값을 입력하세요");
 		int a=sc.nextInt();
 		System.out.print("b의 값을 입력하세요");
 		int b=sc.nextInt();
 		
 		System.out.println("a+b = "+ plus(a,b));
 		
 		System.out.println("a-b = "+ minus(a,b));
 		
 		sc.close();
		
	}
}
