package overriding;

public class HDFCBank extends RBI {

	public Number CreditCard() {

		return 9.7;

	}
	public static void Insurance() {
		System.out.println("HDFC");
	}
	public double getHomeLoan() {

		return 9.1;
	}

	public double getPersonalLoan() {

		return 6.7;
	}

	public RBLBank getGoldLoan() {

		RBLBank r = new RBLBank();

		return r;
	}

	public Integer MF() {

		return 9;

	}
}
