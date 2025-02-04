package Day04;

public class Ex07_String {
//참조 자료형 String
	
	public static void main(String[] args) {
		//String 은 참조 자료형
		// - 문자열 한 글자씩 그 자체를 비교할 때는 equals() 를 사용
		
		// 문자열 사용방법
		// 1. 문자열 리터럴 " " 로 지정
		// 2. 문자열 객체 생성
		// 문자열 리터럴
		String a="Hello"; 
		String b="java"; 
		String c="Hello"; 
		
		String d= new String("Hello");
		String e= new String("java");
		String f= new String("java");
		
		System.out.println(" a==c : " + (a==c)); 
		//같은 메모리 주소 참조 
		// == -> 주소가 같은 지 아닌 지 판별
		
		System.out.println(" a==d : " + (a==d));
		//서로 다른 메모리 참조
		// a.Hello != d.Hello
		//-> new 키워드를 이용하면 별도 메모리 생성 == a와 d가 가리키는 메모리 주소가 다름
		
		System.out.println("문자열 비교 : " + a.equals(d));
		//equals() -> 문자열이 같은지 판별
		//문자열 비교 후 참과 거짓 판변 : True -> Hello = Hello
		
		System.out.println(" e==f : " + (e==f));
		//문자열은 같으나 new/String 을 이용해 생성하면 별도의 메모리 생성
		//-> 메모리의 주소가 다름
		
		System.out.println("문자열 비교 : " + e.equals(f));
		//문자열의 비교 -> e = f = java로 같음 
	}
}
