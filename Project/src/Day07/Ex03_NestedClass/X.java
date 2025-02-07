package Day07.Ex03_NestedClass;

/**
 * 중첩클래스
 */
public class X {
	int xValue1= 1;
	static int xValue2= 2;
	
	
	
	//인스턴스 이너 클래스
	// * 인스턴스 이너 클래스 안에서는 static 멤버 변수 사용 불가??
	class Y{
		int value;
		static int value2=100;
		
		public Y() {
			System.out.println("X의 Y 이너 클래스 객체 생성");
			System.out.println("value2 " + value2);
		}
		void method1() {
			System.out.println("y의 메소드");
			System.out.println("y에서 X 클래스의 static 변수 접근 : "+ xValue2);
		}
		static void method2() {
			System.out.println("y의 statuc 메소드");
		}
		
	}
	//static 이너 클래스
	// * static 이너클래스에서는 static 멤버 사용 가능
	static class Z{
		int a1;
		static int a2=200;
		public Z() {
			System.out.println("x의 Z static 객체 생성");
			System.out.println("a2 "+a2);
		}
		void method1() {
			System.out.println("Z의 메소드");
		}
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
	}
	
	
	//로컬클래스
	// : 메소드 안에 정의한 클래스
	// - 메소드가 실행될 때만 사용되는 이너 클래스
	void method () {
		//로컬 클래스
		class L{
			int b1;
			static int b2;
			
			public L(){
				System.out.println("L객체 생성");
				System.out.println("b2 "+b2);
			}
			void method1() {
				System.out.println("L의 메소드");
			}
			static void method2() {
				System.out.println("L의 static 메소드");
			}
		}
		
		L l= new L();
		l.b1=10;
		System.out.println("로컬클래스의 l변수 : "+ l.b1);
		l.method1();
		l.method2();
	}
	
}
