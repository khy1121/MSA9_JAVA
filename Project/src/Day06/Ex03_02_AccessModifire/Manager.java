package Day06.Ex03_02_AccessModifire;

import Day06.Ex03_01_AccessModifire.Person;

public class Manager{
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defualtSetting();
		
		System.out.println("name : " + student.name);
		
		// protected 같은 패키지 혹은 상속받은 자식 패키지에서만 접근 가능 -> student는 접근 가능하나 , manager에선 접근 불가
		//System.out.println("age : " + student.age); 
		// 따라서 getter 이용하여 우회적으로 접근하기.
		System.out.println("age : " + student.getAge()); 
		
		// 따라서 getter 이용하여 우회적으로 접근하기. defualt 와 private 은 접근 범위가 더 좁기에 당연히 우회접근
		// # 선언한 클래스를 기준으로 접근 지정자가 적용된다.
		// 같은 패키지인 manager 클래스에서 Student클래스의 height를 접근할 수 없는 이유?
		// height 의 선언은 Person 클래스에서 이루어지기에 다른 패키지라 접근이 불가하다.
		System.out.println("height : " + student.getHeight());
		System.out.println("weight: " + student.getWeight());
		System.out.println();
		
		Person person = new Person();
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.getAge()); 
		System.out.println("height : " + person.getHeight());
		System.out.println("weight: " + person.getWeight());
		System.out.println();
		
	}
}
