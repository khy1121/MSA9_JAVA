package Day01;

import java.util.Scanner;

//클래스 
// public class 클래스명
// * 클래스명 = 파일명 (이름이 같아야한다)
// * class 영역 바깥엔 코드 작성 불가. 
public class Ex01_기본구조 {
	
	// * 하나의 실행문은 ; (세미콜론) 으로 끝나야한다.
	//변수 (필드) 작성 
	//(구조 :  자료형  변수명 = 값;)
	int age=20; int level=99;
	
	//변수 선언 (값 초기화 x)
	int energy;
	
	//메소드
	//접근지정자 (static)반환타입 메소드명( 매개변수 ) {살행문;}
	
	public int sum(int a, int b) {
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		int result = a+b;
		//return 
		// 1.메소드종료
		// 2.값을 메소드를 호출한 자리로 반환
		return result;
	}
	
	
	//main 메소드 =
	//main : ctrl + space	
	//메인 메소드는 하나의 프로그램 당 하나만 필요
	public static void main(String[] args) {
		//객체 생성 
		//클래스타입 객체 명 = new 클래스명();
		Ex01_기본구조 test1 = new Ex01_기본구조();
		// * 객체를 생성해야만, 내부의 변수와 메소드에 접근할 수 있다
		// * (.) 접근 연산자로 객체의 변수와 메소드 접근 및 호출 가능
		
		
		// *객체명.변수
		// *객체명.메소드
		// 기본 출력 Sysout : ctrl + space
		// 기본 입력 Sysin: ctrl + space
		System.out.println("나이 = " + test1.age);
		System.out.println("레벨 = " + test1.level);
		System.out.println("에너지 = " + test1.energy);
		int answer = test1.sum(10,20);
		System.out.println("a+b : "+ answer);
		
		Scanner sc= new Scanner(System.in);
	
		test1.energy= sc.nextInt();
		System.out.println("에너지 = " + test1.energy);

	}
}


