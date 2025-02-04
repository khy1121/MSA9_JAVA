package Day03;

import java.util.Scanner;

public class Ex06_switchbreak {
	
	
	/*public boolean check(int x) {
		boolean check;
		if (x%5 > 2)
			check= true;
		else
			check= false;
		return check;
	}
	*/
	public static void main(String[] args) {
		//정수를 입력받아 입력받은 수를 5로 나눈 나머지가 2보다 작으면 "*"출력 / 그렇지 않으면 "**"출력
		Scanner sc = new Scanner(System.in);
	
		
		int num=0;
		
		
		while(num!=-1) {
			System.out.print("정수 입력 : ");
			num= sc.nextInt();
			int result=num%5;
			switch (result) {
				case 0:		
				case 1:
					System.out.println("*");
					break;
					
				default:
					System.out.println("**");
					break;
	
			}
		}
	}
}
