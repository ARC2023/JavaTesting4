package overriding;

public class RBI {

	public double getVehicleLoan() {

		return 8.1;
	}

	public double getHomeLoan() {

		return 6.1;
	}

	public RBI getGoldLoan() {

		RBI r = new RBI();

		return r;
	}

	public void fd() {

		System.out.println("Fixed Deposits");
	}

	public Number MF() {

		return 9.7;

	}

	public final Number CreditCard() {

		return 9.7;

	}

	public static void Insurance() {
		System.out.println("RBI");
	}

}
