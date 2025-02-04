package Day01;

import java.util.Scanner;

public class Ex02_Print {
	int a =10;
	int b=20;
	
	public int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
//전체 import : ctrl + shift + o
	public static void main(String[] args) {
		//기본 출력문
		Ex02_Print t2 = new Ex02_Print();
		
		System.out.println(t2.a);
		System.out.println(t2.b);
		int answer1 = t2.sum(7, 8);
		System.out.println(answer1);
		
		int a= 22;
		int b= 12;
		System.out.println(a);
		System.out.println(b);
		int answer2 =t2.sum(a, b);
		System.out.println(answer2);
		
		
		Scanner sc = new Scanner(System.in);
		t2.a =sc.nextInt();
		t2.b =sc.nextInt();
		int answer3 = t2.sum(t2.a, t2.b);
		System.out.println(answer3);
		
	}
}
