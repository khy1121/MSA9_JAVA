package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width=0.0;
		double height=0.0;
		double radius=0.0;
		
		Shape shapeList[]= new Shape[3];
		int index=0;
		while(true) {
			if(index == 3) break;
			System.out.println("1.삼각형 2.사각형 3.원");
			System.out.print(">>");
			String input = sc.next(); //next = String (문자열 입력)
			
			if( input.equals("그만")) {
				System.out.print("시스템이 종료되었습니다 ");
				break;
			}
					
			switch (input) {
			case "1":
					System.out.println("삼각형을 선택했다");
					System.out.print("가로 : ");
					width=sc.nextDouble();
					System.out.print("세로 : ");
					height=sc.nextDouble();
					new Triangle(width, height);
					shapeList[index++]= new Triangle(width, height);
					break;
			case "2":
					System.out.println("사각형을 선택했다");
					System.out.print("가로 : ");
					width = sc.nextDouble();
					System.out.print("세로 : ");
					height = sc.nextDouble();
					new Rectangle(width, height);
					shapeList[index++]= new Rectangle(width, height);
					break;
			case "3":
					System.out.println("원을 선택했다");
					System.out.print("반지름 : ");
					radius = sc.nextDouble();
					new Circle(radius);
					shapeList[index++] = new Circle(radius);
					break;
			} // -switch 끝
			
			
			
			
		}// -while
		//넓이 둘레 구하기 
		
		double areaSum=0.0;
		double roundSum=0.0;
		
		for (Shape shape : shapeList) {
			double area= shape.area();
			double round = shape.round();
			
			areaSum+=area;
			roundSum+=round;
			
			//instanceof : 인스턴스를 비교하는 연산
			// -같은 인스턴스면 true 아니면 false를 반환
			if(shape instanceof Triangle) System.out.println("삼각형 ");
			if(shape instanceof Rectangle) System.out.println("사각형 ");
			if(shape instanceof Circle) System.out.println("원형 ");
			System.out.println("넓이 : "+ area+ "\t");
			System.out.println("둘레 : "+ round + "\t");
		}//-for each 끝
		
		
		System.out.println();
		System.out.println("넓이의 합은 : "+ areaSum);
		System.out.println("둘레의 합은 : "+ roundSum);
		
		sc.close();
	}  // -main
}		 	
	
	
	
	
	
	
	/*static final int MAX_SIZE=10;
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		Rectangle r= new Rectangle();
		Circle c=new Circle();
		Triangle tArr[]= new Triangle[MAX_SIZE];
		Rectangle rArr[]= new Rectangle[MAX_SIZE];
		Circle cArr[] = new Circle[MAX_SIZE];
		String menuNum = "이름없음";
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 삼각형, 2사각형, 3원형 중 1개 입력 || 종료시 종료 입력");
			menuNum=sc.next();
			if(menuNum == "삼각형") {
				System.out.println(menuNum + " 을 입력하셨습니다");
				int i=0;
				
				System.out.print("삼각형의 높이를 입력하시오 : ");
				tArr[i].height= sc.nextDouble();
				System.out.print("삼각형의 밑변을 입력하시오 : ");
				tArr[i].width = sc.nextDouble();
				
				i++;
				}
			
			
			else if(menuNum == "사각형") {
				System.out.println(menuNum + " 을 입력하셨습니다");
				int i=0;
				
				System.out.print("사각형의 높이를 입력하시오 : ");
				rArr[i].height= sc.nextDouble();
				System.out.print("사각형의 밑변을 입력하시오 : ");
				rArr[i].width = sc.nextDouble();
				
				i++;
			}
				
			
			else if(menuNum == "원") {
				System.out.println(menuNum + " 을 입력하셨습니다");
				int i=0;
				
				System.out.print("원의 반지름을 입력하시오 : ");
				cArr[i].radius= sc.nextDouble();

				i++;
			}
			
			
			 else System.out.println("잘못 입력하셨습니다");
			
		} while (menuNum !="종료");
		
		for(int i=0; i<tArr.length; i++) {
			if(tArr.length == 0) return;
			tArr[i].area();
			tArr[i].round();
			System.out.println(i +"번째 삼각형의 넓이는 : "+ tArr[i].area());
			System.out.println(i +"번째 삼각형의 둘레는 : "+ tArr[i].round());
		}
		
		for(int i=0; i<rArr.length; i++) {
			if(rArr.length == 0) return;
			rArr[i].area();
			rArr[i].round();
			System.out.println(i +"번째 사각형의 넓이는 : "+ rArr[i].area());
			System.out.println(i +"번째 사각형의 둘레는 : "+ rArr[i].round());
		}
		for(int i=0; i<cArr.length; i++) {
			if(cArr.length == 0) return;
			cArr[i].area();
			cArr[i].round();
			System.out.println(i +"번째 원각형의 넓이는 : "+ cArr[i].area());
			System.out.println(i +"번째 원각형의 둘레는 : "+ cArr[i].round());
		}
		
		System.out.println("프로그램을 종료합니다 !");
		sc.close();
		
	}*/

