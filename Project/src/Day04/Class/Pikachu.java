package Day04.Class;

public class Pikachu {
	
	//클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수 메소드
	
	//변수
	public int energy;
	public String type;
	
	
	
	//생성자
	// - 객체가 생성될 때 실행되는 메소드
	// - 객체의 변수를 초기화하는 역할
	// * 생성자의 이름은 클래스의 이름과 동일해야함
	// [생성자 정의] - 접근지정자 생성자 (매개변수) { }
	
	//생성자를 정의하지 않는 경우 기본생성자를 컴파일러가 자동 생성
	//단 , 매개변수가 있는 생성자를 작성할 경우 컴파일러는 기본 생성자를 생성하지 않는다.
	
	//기본 생성자
	 //public Pikachu() { energy=100; type = "ELETRIC"; }
	
	
	//매개변수가 있는 생성자 
	/*
	 * public Pikachu(int energy, String type) { this.energy = energy; this.type =
	 * type; }
	 */
	
	//생성자 자동완성 단축키 
	// alt shift S : O
	public Pikachu() {
//		energy=100;
//		type="전기";
		
//  	this() 사용 예시 - 항상 생성자의 맨 앞에서 호출할 것!
		this(100,"전기");
	}
	
	public Pikachu(int energy) {
//		this.energy = energy;
		this(energy, " "); //아래에서 이미 this 로 초기화했기에 사용 가능
	}
	
	public Pikachu(int energy, String type) {
//		this 사용 예시
		this.energy = energy;
		this.type = type;
		
//  	this() 사용 예시
	}

	

	//메소드
	// [메소드 정의] - 접근지정자 반환타입 메소드명 (매개변수) { }
	public String aAttack() {
		//energy -=10;
		return ("10만 볼트");
	}
	
	public String bAttack() {
		//energy -=10;
		return ("전광석화");
	}

	/** 
	 * toString ()
	 * 반환하는 문자열을 객체의 출력으로 대체해주는 메소드
	 */

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
}
