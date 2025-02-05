package Day06.Ex03_02_AccessModifire;

import Day06.Ex03_01_AccessModifire.Person;

public class Student extends Person {
	
	//생성자 

	public Student() {
		super();
	}

	public Student(String name, int age, int height, double weight) {
		super(name, age, height, weight);
	}
	
	
	//메소드
	
	public void defualtSetting() {
		name="이름없음"; // 접근 지정자가 public : 모든 곳에서 접근 가능
		age=20;			// 접근 지정자가 protected : Person 상속받았기 때문에 다른 패키지도 접근 가능
		// height=178; 	// 접근 지정자가 defualt : 같은 패키지 안에서만 접근 가능
		// weight=73;	// 접근 지정자가 private  : 해당 클래스에서만 접근 가능
		setHeight(170);
		setWeight(78);
	}
	
}
