package abstractclasses;

public class CanaraBank extends SBI{

	
	public CanaraBank() {
		
		System.out.println("Canara Bank");
	}
	/*public  String DebitCard() {
		return null;

	}*/
	public String CanteenCard() {
		return "Override";

	}
	
	@Override
	public void militaryTax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navyTax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void airForceTax() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		CanaraBank can = new CanaraBank();
		
		SBI sbi= new CanaraBank();
		
		sbi.minFees=90;
		//sbi.maxFees=89;
		sbi.overalFees=999;
		
		System.out.println(sbi.CanteenCard());
	}
	
	
	

}
