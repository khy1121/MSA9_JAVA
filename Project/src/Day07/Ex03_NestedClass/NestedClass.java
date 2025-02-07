package Day07.Ex03_NestedClass;

public class NestedClass {
	public static void main(String[] args) {
		A a=new A();
		a.a=10;
		a.b=20;
		System.out.println("A의 a: "+a.a);
		System.out.println("A의 b: "+a.b);
		System.out.println();
		a.aMethod();
		
		
		//A클래스의 객체인 a를 사용해 B클래스에 접근하여 b객체 생성
		A.B b=a.new B();
		
		b.x=30;
		b.y=40;
		System.out.println("B의 x: "+b.x);
		System.out.println("B의 y: "+b.y);
		System.out.println();
		b.bMethod();
	}
}
