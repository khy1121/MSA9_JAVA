package Day02;

public class Ex02_Char {

	public static void main(String[] args) {

		char a1='A';
		char a2= 65;
		char a3='\u0041';
		
		String a4="가";
		char a5=44032;
		char a6='\uac00';
		
		int unicode = a1;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println("A의 코드번호는 : "+ unicode);
		
		char some= (char)(a2+1);
		System.out.println("some 은 무엇일까요 ? " + some);
		
	}
}
