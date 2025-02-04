package Day02;

import java.util.Scanner;

public class Ex10_circle {
	//상수 키워드 -final
	final double PI=3.141592;
	
	public double circle(double r) {
		//double extend = r * r * PI;
		double area=PI*Math.pow(r,2);   	// Math.pow(a,b) = a^b
		return area;
		//return extend;
	}
	public static void main(String[] args) {
		
		Ex10_circle c= new Ex10_circle();
		
		//원의 반지름을 입력받은 후, 넓이를 구하라 
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시오 : ");
		double radius=sc.nextDouble();
		
		double res= c.circle(radius);
		System.out.printf("원의 넓이는 : "+ "%.1f", res);
		sc.close();
		
		
	}
	
}
