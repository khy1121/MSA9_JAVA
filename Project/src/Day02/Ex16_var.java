package Day02;

import java.util.Scanner;

public class Ex16_var {
	
	
	
	public static void main(String[] args) {
		var a=10;
		var b='a';
		var c="김헌영";
		var d=3.14;
		var e=3.141592;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 :");
		var num=sc.nextInt();
		var text=sc.nextLine();
		System.out.println("int타입으로 추론된 숫자 : "+ num);
		System.out.println("string타입으로 추론된 문자 : "+ text);
	}
}
