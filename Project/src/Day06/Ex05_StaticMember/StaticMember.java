package Day06.Ex05_StaticMember;

public class StaticMember {
	
	//static 변수 선언
	static int a;
	static int b;
	
	// 인스턴스 변수
	int c;
	
	//static 상수
	static final double PI=3.141592;
	
	//static 메소드
	public static int sum(int x, int y) {
		int sum= a+b+x+y;
		// sum += c; 
		// static 메소드 안에 위치하고 있기 때문에 
		// static 멤버만 접근 가능하다. 따라서 인스턴스 변수이기에 접근 불가.
		//  * 객체가 생성되기 전엔 인스턴스 변수 c 에 메모리 할당이 되지않는다.
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		// static 메소드이기 때문에 객체 생성 없이 호출 가능
		// 객체 호출 후 c.sum 처럼 사용해야함 (static 이 없다면)
		int sum=sum(10,20);
		a=100;
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		StaticMember s3 = new StaticMember();
		
		//s1 s2 s3 는 전~부 , 같은 메모리 공간에 있는 같은 a 에 접근   
		int a1=s1.a ; 
		int c1=s1.c = 10;
		
		int a2=s2.a ;
		int c2=s2.c = 20;
		
		int a3=s3.a;
		int c3=s3.c = 30;
		
		//PI=100;
		// final 키워드로 지정한 상수는 
		// : 한번 값을 초기화 한 이후 값을 변경할 수 없다.
		System.out.println("sum : " + sum);
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		
		System.out.println("a3 : " + a3);
		System.out.println("c3 : " + c3);
		
	}
	
}
