package Day02;

import java.util.Scanner;

public class Ex11_triangle {
	
	public int triangle(int x, int y) {
		int extent = (x*y)/2;
		return extent;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Ex11_triangle t=new Ex11_triangle();
		
		
		
		System.out.print("삼각형의 밑변을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("삼각형의 높이를 입력하시오 : ");
		int b = sc.nextInt();
		
		int res=t.triangle(a,b);
		System.out.println("삼각형의 넓이는 : "+res);
	}
}
