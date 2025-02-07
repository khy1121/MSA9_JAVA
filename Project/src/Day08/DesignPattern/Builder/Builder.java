package Day08.DesignPattern.Builder;

public class Builder {
	public static void main(String[] args) {
		
		//new Pikachu (100, "전기")
		//new Pikachu (1,"전기);
		
		//빌더를 사용하면 
			Pikachu pikachu= new Pikachu.Builder()
								  .energy(100) //Builder(this)
								  .type("전기") //Builder(this)
								  .level(10)   //Builder(this)
								  .build();
						
			System.out.println(pikachu);	
	}

}
