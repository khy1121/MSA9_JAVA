package Day06.Ex01;

import java.util.Iterator;

import Day04.Class.Pikachu;

public class CallByReference {
	
	//배열을 전달 받아 배열 요소를 변경하는 메소드
	public static void setArr(int arr[]) {
		for(int i=0;i<arr.length; i++) {
			arr[i]= (i+1)*10;
		}
		System.out.println("setArr 메소드");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//객체를 전달받아 객체의 변수를 변경하는 메소드
	public static void setObject(Pikachu pikachu) {
		pikachu.energy=1000;
		pikachu.type="불";
		System.out.println("setObject 메소드");
		System.out.println(pikachu);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		//배열과 객체를 생성하여 메소드로 전달
		int arr[]= new int [5];
		Pikachu pikachu=new Pikachu();//기본 생성자에서 100,전기 입력해줌
		
		//배열에 값 대입하기
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(i+1);
		}
		
		System.out.println("메인메소드");
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		
		//레퍼런스에 의한 호출 
		// -참조 자료형을 전달하는 방식
		// * 참조자료형을 전달하면 , 전달받은 메소드의 매개변수에서 
		// 해당 레퍼런스로 실제 값을 접근할 수 있어서, 값 변경 시 본래의 변수의 값도 변경된다.
		
		setArr(arr);
		setObject(pikachu);
		
		System.out.println("setXXX 메소드 호출 후");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(pikachu); //pikachu.energy 이런 형식으로 사용해야 눈에 보임 
		// 안그러면 Day04.Class.Pikachu@6c629d6e 이런 식으로 나오므로 Pikachu에 toString 메소드를 추가
	}
}
