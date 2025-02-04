package Day05.Ex02_calculate;

import java.util.Scanner;

// 계산기
// -피연산자를 2개로 하는 계산기
// - 기능
//		1.덧셈 : 정수 2개 덧셈
//		2.뺄셈 : 정수 인자 1- 인자 2 연산하는뺄셈
//		3.곱셈 : 실수 2개 곱셈
//		4.나눗셈 : 실수  인자 1/인자2 연산하는 나눗셈
//		5.나머지 : 실수  인자 1%인자2 나머지 연산
//		6.합계 : 배열 매개변수 , 모든요소 합
//		7.평균 : 배열 배개 변수 ,모든요소평균

//	-메소드명
//		: plus, minus, multi, divide, remain, sum, avg
public class Calculate {
	Scanner sc = new Scanner(System.in);
	public Calculate() {
		
	}
	//덧셈
	public int plus(int a,int b) {
		System.out.print("a 입력: ");
		a=sc.nextInt();
		System.out.print("b 입력: ");
		b=sc.nextInt();
		return a+b;
	}
	
	//뺄셈
	public int minus(int a,int b) {
		System.out.print("a 입력: ");
		a=sc.nextInt();
		System.out.print("b 입력: ");
		b=sc.nextInt();
		int res=a-b;
		return res;
	}
	
	//곱셈
	public double multi(double a,double b) {
		//double res=a*b;
		//return res;
		System.out.print("a 입력: ");
		a=sc.nextInt();
		System.out.print("b 입력: ");
		b=sc.nextInt();
		return a*b;
	}
	
	//나눗셈
	public double devide(double a,double b) {
		//double res=a/b;
		//return res;
		System.out.print("a 입력: ");
		a=sc.nextInt();
		System.out.print("b 입력: ");
		b=sc.nextInt();
		return a/b;

	}
	//나머지
	public double remain(double a,double b) {
		
		System.out.print("a 입력: ");
		a=sc.nextInt();
		System.out.print("b 입력: ");
		b=sc.nextInt();
		double res=a%b;
		return res;
	}
	//합
	public int sum(int arr[]) {
		int sum=0;
		System.out.print("배열 크기 입력: ");
		int a=sc.nextInt();
		arr=new int [a];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+" 번째 배열 값 입력 : ");
			int x=sc.nextInt();
			arr[i]=x;
		}
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.print("배열의 합은 : ");
		return sum;

	}
	//평균
	public double avg(int arr[]) {
		/*double avg=0.0;
		int sum=sum(arr);
		avg=(double)sum/arr.length;
		//return avg;
		
		return (double)sum(arr)/arr.length;
		*/
		
//		System.out.print("배열 크기 입력: ");
//		int a=sc.nextInt();
//		arr=new int [a];
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+" 번째 배열 값 입력 : ");
//			int x=sc.nextInt();
//			arr[i]=x;
//		}
		
		System.out.print("배열의 평균은 : ");
		return (double)sum(arr)/arr.length;
		
	}

	
}
