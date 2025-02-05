package Day06.Ex04_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account(0, "김헌영", "110-123-456789", "신한은행");
		
		//account.deposit(10000); deposit -> 접근 지정자 private 으로 보호되어 접근 불가
		account.setDeposit(10000);
		
		//메소드를 통해 값을 지정하도록 하면  ex ) if(deposit<0) return;
		// 값을 직접 접근하게 되면 유효하지 않은 값을 임의로 지정할 수도 있지만
		// 캡슐화하여, 값을 setter 메소드를 통해 접근하게 되면
		// 값에 대한 유효성 검사와 제약조건을 지정할 수 있다
		// 		(데이터 보호 , 정보 은닉을 위해) 캡슐화를 사용한다.
		
		int money=account.getDeposit();
		System.out.println("예금액 : " + money);
		System.out.println(account);
	}
}
