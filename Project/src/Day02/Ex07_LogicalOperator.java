package Day02;

public class Ex07_LogicalOperator {
	
	public static void main(String[] args) {
		//논리 연산자 
		//and  - && A,B 둘 다 TRUE, 결과 true
		//or   - || A또는 B TRUE, 결과 true
		//not -!A 서로 반대면 true 아니면 false로 변환
		
		//and연산자 - && A,B 둘 다 TRUE, 결과 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println();
		
		//or   - || A또는 B TRUE, 결과 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println();
		
		//not -!A  A가 TRUE이면 FALSE , FALSE이면 TRUE로 변환
		//서로 반대면 true 아니면 false로 변환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트서킷
		// : 논리연산에서 결과를 미리 알아서, 남은 논리식을 확인하지 않는것
		
		//쇼트서킷이 적용되는 예 ( 뒤에 나오는 연산 확인 x)
		int value1=3;
		System.out.println(false && ++value1>10); // and연산에서 false가 나오므로 뒤에 나오는 ' ++value1>10 ' 연산 x => 쇼트서킷 적용 
		System.out.println("value1 : " + value1); // 그래서 결과값이 3
		
		int value2=3;
		System.out.println(true || ++value2>10);  // or 연산에서 true가 하나만 있어도 참이므로 ' ++value1>10 ' 연산 x => 쇼트서킷 적용
		System.out.println("value2 : " + value2);
		
		//비트연산자 (경고문 밑줄 사라짐) == 쇼트서킷이 적용되지 않는다.
		int value3=3;
		System.out.println(false & ++value3>10); 
		System.out.println("value3 : " + value3);
		
		int value4=3;
		System.out.println(true | ++value4>10);
		System.out.println("value4 : " + value4);
		
	}
}
