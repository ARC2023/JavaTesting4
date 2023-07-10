package javaprogrammingquestion;

public class PrimeNumber {

	
	public static boolean isPrimeNumber(int number) {
		
		if(number==0 || number==1) {
			System.out.println("0 or 1 are ineligible");
			
			return false;
		}
		
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				//System.out.println("Not a Prime Number");
				return false;
				
			}
			
		}
		
		//System.out.println("It is a Prime Number");
		return true;
		
		
	}
	
	
	
	public static void listOfPrimeNumber(int number) {
		
		for(int i=2;i<=number;i++) {
			
			if(isPrimeNumber(i)) {
				
				System.out.println(i);
				
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(isPrimeNumber(9));
		listOfPrimeNumber(999);
		
		
	}

}
