package abstractclasses;

public abstract class SBI extends IndianArmy implements IndianNavy, IndianAirForce {

	int minFees=89;
	
	static final int maxFees=870;
	
	static int overalFees=78;
	
	
	public SBI() {
		
		System.out.println("SBI");
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//SBI sbi = new SBI();
	}

	public abstract void militaryTax();

	public String CanteenCard() {
		return null;

	}

	public static void Armoury() {

	}

	public abstract void navyTax();

public  abstract void airForceTax();

	
	public final String DebitCard() {
		return null;

	}

}
