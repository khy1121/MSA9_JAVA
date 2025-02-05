package Day06.Ex04_Encapsulation;

/*
 * 통장계좌
 *  - 예금액
 *  - 예금주
 *  - 계좌번호
 *  - 은행명
 */
public class Account {
	private int deposit;
	private String depoName;
	private String depoNum;
	private String bank;
	
	
	
	//기본 생성자
	public Account() {
		this(0,"없음", "000000-00-000000", "개설된 계좌가 없습니다");
	}
	
	//매개변수가 있는 생성자
	public Account(int deposit, String depoName, String depoNum, String bank) {
		this.deposit = deposit;
		this.depoName = depoName;
		this.depoNum = depoNum;
		this.bank = bank;
	}
	
	
	//getter & setter 
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		if(deposit<0) return;
		this.deposit = deposit;
	}

	public String getDepoName() {
		return depoName;
	}

	public void setDepoName(String depoName) {
		this.depoName = depoName;
	}

	public String getDepoNum() {
		return depoNum;
	}

	public void setDepoNum(String depoNum) {
		this.depoNum = depoNum;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depoName=" + depoName + ", depoNum=" + depoNum + ", bank=" + bank
				+ "]";
	}
	

	

	
}
