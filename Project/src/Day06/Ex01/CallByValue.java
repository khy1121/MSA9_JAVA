package Day06.Ex01;

public class CallByValue {
	
	//int타입의 매개변수 2개를 전달받아 합을 구하여 반환하는 메소드를 정의하시오
	// 접근지정자 (static) 반환타입 메소드명 (매개변수)
	public static int sum(int a, int b) { //합을 구하는 메소드 
		a=100; //지역 변수 
		b=200;
		int sum=a+b;
		System.out.println("sum 메소드 ");
		System.out.println("(a,b) : " + a + " , "+b); //a,b = 100,200
		return sum;
		
	}
	
	public static void main(String[] args) {
		CallByValue c= new CallByValue();
		
		int a=10;
		int b=20;
		
		System.out.println("메인 메소드 호출");
		System.out.println("(a,b) : " + a + " , "+b);	//a,b = 10,20
		
		int sum= c.sum(a,b); // 위에 있는 sum 메소드 호출 
		System.out.println("sum : "+sum);
		
		System.out.println("sum 메소드 호출"); 
		System.out.println("(a,b) : " + a + " , "+b); //a,b = 10,20
		
		//main 의 변수와 sum의 변수는 같은 변수가 아니므로  서로 다른 메모리 공간을 할당.
		//sum 이 실행된 후 변수의 메모리 공간은 사라진다.
	}
}
