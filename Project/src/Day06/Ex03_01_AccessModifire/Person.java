package Day06.Ex03_01_AccessModifire;

public class Person {
	//변수 : 이름 나이 키 체중
	public String name;
	protected int age;
	int height;
	private double weight;
	
	
	
	//생성자
	public Person() {
		this("이름없음", 1, 0, 0);
	}
	
	
	public Person(String name, int age, int height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//alt shift s getter setter 
	//getter setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}
	

	public int getHeight() {
		return height;
	}
	

	public void setHeight(int height) {
		this.height = height;
	}
		
	public double getWeight() {
		return weight;
	}
	
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
	
}
