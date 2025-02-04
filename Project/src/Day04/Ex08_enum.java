package Day04;
//열거타입 정의
// - 열거타입 enum은 파일로도 정의할 수 있고, 
// - 클래스 파일 내부에서 정의할 수 있다/

enum Test {A,B,C,D,E,F};
public class Ex08_enum {

	public static void main(String[] args) {
		//ENUM -> 열거타입
		//- 요소들을 명명한 값으로 집합을 이루는 자료형
		// 특징
		// 1. enum을 비교할때는 값뿐만 아니라 타입도 비교한다
		// 2. enum의 상수값이 재정의되도 다시 컴파일 할 필요가 없다.
		
		// enum 관련 메소드
		
		
		
		// - values() : 열거타입의 모든 요소를 배열로 반환
		Rainbow_Ex08 [] rainbow = Rainbow_Ex08.values();
		
		for (Rainbow_Ex08 color : rainbow) {
			System.out.print(color+ " ");
		}
		System.out.println();
		
		// - valueOf() : 전달된 문자열과 일치하는 열거타입 상수를 반환
		Rainbow_Ex08 G = Rainbow_Ex08.valueOf("PURPLE");
		System.out.println( "G : "+G);
		
		// - ordinal() : 해당 열거체 상수가 정의된 순서 (index)를 반환
		int index=G.ordinal();
		System.out.println("PURPLE의 INDEX : " + index);
	}
}
