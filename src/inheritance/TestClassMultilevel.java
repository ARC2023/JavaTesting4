package inheritance;

public class TestClassMultilevel {

	public static void main(String[] args) {

		Audi a = new Audi();

		a.price = 98;
		a.getMRFTyre();
		a.getRadio();
		a.getRedColor();

		a.getAutomaticFuelCleaner();

		a.getAutomaticGear();
		a.getBoschInfotainment();
		a.getMaroonColor();

		Volkswagen v = new Volkswagen();

		v.price = 900000000;

		v.getMRFTyre();

		v.getRadio();

		v.getRedColor();

		v.getAutomaticGear();

		v.getBoschInfotainment();

		v.getMaroonColor();

		v.getAutomaticFuelCleaner();
		
	}

}
