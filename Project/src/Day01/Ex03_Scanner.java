package Day01;

import java.util.Scanner;

public class Ex03_Scanner {
	
	public int sum(int x, int y, int z) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int result = x+y+z;
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Ex03_Scanner t3= new Ex03_Scanner();
		int answer= t3.sum(a,b,c);
		
		System.out.println(answer);
	}
}
