package Day03;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num =sc.nextInt();
		//입력받은 값이 홀 수 인지, 짝수인지 조건문으로 판단
		if(num/2==0)
			System.out.println(num +"은(는) 짝수입니다");
		else
			System.out.println(num+ "은(는) 홀수입니다");
			
		sc.close();
	}
}
