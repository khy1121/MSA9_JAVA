package Day08.DesignPattern.Singleton;


// 디자인 패턴?
// : 프로그램 코드를 효율적으로 작성하기 위한 모범 답안
// * 분류 : 생성패턴 , 구조 패턴, 행위패턴
// singleton : 생성 패턴
/**
 *  싱글톤패턴
 *  - 디자인 패턴 중의 하나로, 생성 패턴에 속하며
 *  	클래스의 인스턴스를 메모리 상에 오직 하나만 생성하여 접근하도록 하는 패턴
 *  	
 *  
 *  	프로그램이 시작될때 최초로 한번만 메모리를 할당해서 인스턴스를 활용
 *  	-객체가 필요할 때, 새로운 객체 생성하지 않고 기존의 인스턴스 활용
 *  	- 객체를 하나만 생성하기 때문에, 메모리를 효율적으로 사용
 */
public class Singleton {
	
	// static으로 유일한 객체 생성
	private static Singleton instance= new Singleton();
	
	// 생성자를 private 으로 정의하여 외부에서 객체 생성하는 것을 막음
	private Singleton() {
		
	}
	// 유일한 객체를 가져오는 메소드
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance ;
	}
	
}
