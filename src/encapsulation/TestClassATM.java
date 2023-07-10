package encapsulation;

public class TestClassATM {

	public static void main(String[] args) {
		
		ATM atm= new ATM();
		
		
		System.out.println(atm.getAmount());
		
		atm.updatePin(34578, 0000, 1000);
		
		//atm.pin=9000;
		
		atm.withDrawMoney(34578, 1000, 900);
		
		
		

	}

}
