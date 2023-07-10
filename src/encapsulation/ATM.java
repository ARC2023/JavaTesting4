package encapsulation;

public class ATM {

	private int cardNo = 34578;
	private int pin = 0000;
	private int amount = 90000;
	private int cvv = 998;

		
	public int getCardNo() {
		return cardNo;
	}

	public int getAmount() {
		return amount;
	}


	private void setPin(int pin) {
		this.pin = pin;
	}

	
	public void updatePin(int cardNo, int pin, int newPin) {

		if (this.cardNo == cardNo && this.pin == pin) {

			if (this.pin == pin) {

				setPin(newPin);

			}

		}

	}

	public void withDrawMoney(int cardNo, int pin, int amount) {

		if (this.cardNo == cardNo && this.pin == pin) {

			if (this.amount >= amount) {

				System.out.println("Withdraw Money");

				this.amount=this.amount-amount;
				
				
			} else {

				System.out.println("Insufficient funds!!!!!!!!!!!!!!");
			}

		} else {

			System.out.println("Incorrect details --- Card Blocked");

		}

	}

}
