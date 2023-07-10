package conditonal;

public class IfElse {

	public static void main(String[] args) {
		
	int accountNo=345511;
	int otp = 3458;
	
	
	    if(accountNo==345511 && otp==3454) {
	    	
	    	System.out.println("OTP Confirmed");
	    } else if(otp==3454){
	    	
	    	System.out.println("OTP OTP");
	    } else {
	    	System.out.println("OTP Incorrect");
	    }
		
	    System.out.println("****************************************************************");
	    int balanceOnScreen=25000;
		  int balanceFromDB=26000;
		  
		
		if(balanceOnScreen==balanceFromDB && balanceOnScreen>balanceFromDB) {
			
			System.out.println("Inside If Block");
			
			
		} else if(balanceOnScreen>balanceFromDB){
			
			
			System.out.println("Changes in GIT");
			if(22==22) {
			}
			System.out.println("Inside  Else If Block");
			
		}else if(balanceOnScreen>balanceFromDB){
			System.out.println("Inside  Else If Block");
			
		}else if(balanceOnScreen>balanceFromDB){
			System.out.println("Inside  Else If Block");
			
		}else if(balanceOnScreen>balanceFromDB){
			System.out.println("Inside  Else If Block");
			
		}else if(balanceOnScreen>balanceFromDB){
			System.out.println("Inside  Else If Block");
			
		}else if(balanceOnScreen>balanceFromDB){
			System.out.println("Inside  Else If Block");
			
		}
		
		
		int pin=1290;
		int amount =9000;

		if(pin==1290 && amount==9000) {
			
			System.out.println("Withdraw Cash");
			
			
		} else {
			System.out.println("Inside  Else If Block");
			
		}
		
		
	}

}
