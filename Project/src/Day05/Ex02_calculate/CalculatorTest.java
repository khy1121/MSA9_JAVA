package Day05.Ex02_calculate;

import java.util.Scanner;

public class CalculatorTest {

	public void menu() {
		Calculate c=new Calculate();
		Scanner sc = new Scanner(System.in);
		int a=0; int b=0;
		int num=0;
		do {
			System.out.println();
			System.out.println("-----계산기 메뉴-----");
			System.out.println("1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈, 5.나머지, 6.합 7.평균   0:종료");
			System.out.print("메뉴를 입력하세요 : ");
			num=sc.nextInt();
			System.out.println();
			if(num==0) break;
			switch(num) {
				case 1:
					int res1 =c.plus(a, b);
					System.out.println("a + b = "+ res1);
					break;
				case 2:
					int res2 =c.minus(a, b);
					System.out.println("a - b = "+ res2);
					break;
				case 3:
					double res3 =c.multi(a, b);
					System.out.println("a x b = "+ res3);
					break;
				case 4:
					double res4 =c.devide(a, b);
					System.out.println("a / b = "+ res4);
					break;
				case 5:
					double res5 =c.remain(a, b);
					System.out.println("a % b = "+ res5);
					break;
				
				case 6:
					int res6= c.sum(null);
					System.out.println("배열의 합은 : " + res6);
					break;
				
				case 7:
					double res7= c.avg(null);
					System.out.println("배열의 평균은 : " + res7);
					break;
						
			}
		} while (num != 0);
		System.out.print("계산기를 종료합니다");
	}
	
	public static void main(String[] args) {
		CalculatorTest ct=new CalculatorTest();
		Scanner sc = new Scanner(System.in);

		ct.menu();
		

		
	}
}
