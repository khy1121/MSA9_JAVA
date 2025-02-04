package Day04.Class;

public class Raichu extends Pikachu {
	

	//부모 클래스의 생성자를 따라서 자동완성
	// 생성자 자동완성 : alt shift s+  c
	
	public Raichu() {
		//부모클래스에 있는 생성자 호출
		// 부모클래스를 가리키는 레퍼런스 
		super(300, "메가 전기"); 
		
	}
	
	public Raichu(int energy) {
		super(energy, "메가 전기");
	}
	
	public Raichu(int energy, String type) {
		super(energy, type);
	}

	
	//메소드 오버라이딩
	// : 부모클래스의 메소드를 자식 클래스에서 재정의하여,
	// 부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것
	
	
	
	public String cAttack() {
		return ("아이언 테일");
	}
	
	//오버라이딩 자동완성 : alt shift s v
	// 	@Override == 어노테이션 : 코드에 특별한 기능 또는 설명을 추가하는 방법
	//	" @ 어노테이션 이름 "  의 형태로 사용
	
	@Override		//	부모클래스의 메소드를 재정의한 메소드임을 명시하는 어노테이션(생략 가능)
	public String aAttack() {
		return ("백만 볼트");
	}

	@Override
	public String bAttack() {
		return ("볼트 체인지");
	}
}
