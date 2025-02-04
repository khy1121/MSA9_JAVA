package Day05.Ex03_Car;

import java.util.Scanner;

public class CarTest {
	
	
	public static void main(String[] args) {
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		
		car.model="nissan gtr";
		// private으로 지정하여 외부에서 접근 불가
		//car.speed=100; 
		//setter 활용하여 값에 접근
		car.setSpeed(350);
		
		System.out.println("모델명 : " + car.getModel());
		System.out.println("차량 속도 : "+ car.getSpeed());
		
		car.setSpeed(-50);
		System.out.println("차량 속도 : "+ car.getSpeed());
		
		
		car.setSpeed(400);
		System.out.println("차량 속도 : "+ car.getSpeed());
	}
}
