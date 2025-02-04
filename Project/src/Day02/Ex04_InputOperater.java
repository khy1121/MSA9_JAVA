package Day02;

import java.util.Scanner;

public class Ex04_InputOperater {
	
	public int sum(int a, int b, int c) {
		int res=a+b+c;
		return res;
	}
	
	public double avg(int a, int b, int c) {
		int res=a+b+c;
		double avg= (double)(res /3); //굳이 안해도 자동 형변환 가능
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex04_InputOperater input=new Ex04_InputOperater();
		System.out.print("x : ");
		int x=sc.nextInt();
		
		
		System.out.print("y : ");
		int y=sc.nextInt();
		
		System.out.print("z : ");
		int z=sc.nextInt();
		
		int ans=input.sum(x, y, z);
		
		double avg=input.avg(x,y,z);
		
		System.out.println("입력된 세 변수의 합 : "+ ans);
		System.out.println("입력된 세 변수의 평균 : "+ avg);
		
		//합계 평균 구하기
	}
}
