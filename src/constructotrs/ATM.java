package constructotrs;

public class ATM {

	int cardNo;
	int pin;
	int amount;

	public ATM() {

		System.out.println("Non Parameterized Constructor");
	}

	public ATM(int cardNo, int pin, int amount) {

		this.cardNo = cardNo;
		this.pin = pin;
		this.amount = amount;

		System.out.println("Parameterized Constructor");
	}

	public ATM(int amount) {
		this.amount = amount;

		System.out.println("Parameterized Constructor");
	}

	

}
