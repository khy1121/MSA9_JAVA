package Day07.Ex03_NestedClass;

import Day07.Ex03_NestedClass.X.Z;

public class NestedClass2 {
	public static void main(String[] args) {
		//x
		// -Y : 인스턴스 이너 클래스
		//- Z : static 이너 클래스
		// * method
		// --L : 로컬 클래스
		
		//아우터 클래스 객체 생성
		X x= new X();
		
		//인스턴스 이너 클래스 객체 생성
		X.Y y=x.new Y();
		y.value=10;
		System.out.println("Y객체의 변수 : "+ y.value);
		y.method1();
		y.method2();
		System.out.println();
		
		//static 이너 클래스 객체 생성
		X.Z z=new X.Z();
		z.a1=20;
		System.out.println("Z객체의 변수 : "+ z.a1);

		// static 변수 초기화
		X.Z.a2=30;
		System.out.println("Z객체의 static 변수 : "+ X.Z.a2);
		
		z.method1(); //일반 메소드
		X.Z.method2(); // static 메소드
		System.out.println();
		//로컬클래스 객체 생성을 위한 메소드 호출
		x.method();
	}
}
