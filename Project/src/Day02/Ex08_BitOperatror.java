package Day02;

public class Ex08_BitOperatror {
	
	public static void main(String[] args) {
		//and
		int result = 20&16;
		//20 -> 2진수 = 10100
		//16 -> 2진수 = 10000
		//비트연산 시  --> 10000 = 16
		
		//Integer.toBinaryString() : 십진수를 2진수로 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		
		//or
		int result2 = 20|16;
		//20 -> 2진수 = 10100
		//16 -> 2진수 = 10000
		//비트연산 시  --> 10000 = 16
				
		//Integer.toBinaryString() : 십진수를 2진수로 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result2));		
		System.out.println();
		
		//xor
		// : 값이 서로 다르면 1(true) 같으면 0(false)
		int result3 = 20 ^ 16;
		//20 -> 2진수 = 10100
		//16 -> 2진수 = 10000
		//비트연산 시  --> 10000 = 16
				
		//Integer.toBinaryString() : 십진수를 2진수로 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result3));	//100 -> 00100 이지만 앞에 00은 생략	
		System.out.println();
		
	}
}
