package inheritance;

public class TestClassHierarchy {

	public static void main(String[] args) {
		
		Car c = new Car();
		Volkswagen v=new Volkswagen();
		Jaguar j= new Jaguar();
		
		
		
		c.getRedColor();
		c.price=890;
		
		
		v.getBoschInfotainment();
		v.getRedColor();
		v.price=89;
		
		j.price=78;
		j.getRedColor();
		j.getAdasSystem();
		
		
		
		
		
		
		

	}

}
