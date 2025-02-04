package Day04.Class;

public class Jiwoo {
	
	public static void main(String[] args) {
		//객체 생성
		// - 클래스타입 객체명 = new 클래스명();
		Pikachu p1 = new Pikachu(); // <- 인스턴스
		
		
		
		//(.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		
		System.out.println(" 피 카 츄 ");
		System.out.println("에너지 : " + p1.energy);
		System.out.println("타입 : " + p1.type);
		System.out.println("공격 A : "+p1.aAttack());
		System.out.println("공격 B : "+p1.bAttack());
		System.out.println();
		
		
		Pikachu p2 = new Pikachu(150, "진화"); // <- 인스턴스
		
		System.out.println(" 피 카 츄 ");
		System.out.println("에너지 : " + p2.energy);
		System.out.println("타입 : " + p2.type);
		System.out.println("공격 A : "+p2.aAttack());
		System.out.println("공격 B : "+p2.bAttack());
		System.out.println();
		
		Pikachu p3 = new Pikachu(150); // <- 인스턴스
		
		System.out.println(" 피 카 츄 ");
		System.out.println("에너지 : " + p3.energy);
		System.out.println("타입 : " + p3.type);
		System.out.println("공격 A : "+p3.aAttack());
		System.out.println("공격 B : "+p3.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		System.out.println(" 라이츄 ");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : "+raichu.aAttack());
		System.out.println("공격 B : "+raichu.bAttack());
		System.out.println("공격 C : "+raichu.cAttack());
		System.out.println();
		

	}
}
