package Day03;

import java.util.Scanner;

public class Ex15_Break {
	
	public static void main(String[] args) {
		
		//아래의 코드가 종료되지 않는 이유는 문자열 기본자료형을 비교하는 비교연산자로 비교불가
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력 : ");
			//문자열을 한줄 입력
			String input = sc.nextLine();
			
			//STOP이라는 문자열을 입력받았을때 종료하는 종료 조건 생성
			//문자열 기본자료형을 비교하는 비교연산자로 비교불가
			//문자열.equals("비교문자열")을 통해 비교 가능
			
			//if( input == "STOP")
			
			//아래 방법으로 비교 가능
			if( input.equals("STOP"))
				break;
				
		}System.out.println("프로그램을 종료합니다");
		sc.close(); //<- 종료조건이 없어 도달할 수 없는 코드
		// 해결하기 위해서는 위 주석 참고
		
		//종료조건이 없어 도달할 수 없는 코드 (원문)
		/*Scanner sc = new Scanner(System.in);
		while(true) {
		
		}
		sc.close();*/
		
		//활용
		// 암호 입력 시 데이터와 비교해 제대로 된 암호가 아닌 경우 재입력하도록 하며 5회 이상일 시 BLOCK처리 
		// 게임 퀘스트 진행 중 퀴즈에 대한 오답 제출 시 .equal을 통한 비교 후 재입력 기회 제공
		// 
		
		
	}
}
