package staticnonstatic;

public class SNS {

	static int pin = 987;

	// 1. Non static variable or methods cannot be accessed directly into a static
	// method
	// 2. Calling Static method and variable in a static method in the same class by
	// directly calling
	// 3. Calling static method or variable in another class
	// 4. Calling Non static method in Non Static method
	// 5. A static method or variable can be directly called in a non static method

	public static void main(String[] args) {
		GlobalAndLocalVariable kk=new GlobalAndLocalVariable();
		
		kk.global=00;
		kk.locally=99;
		System.out.println(pin);
		pinner();
		caller();
		SNS tr = new SNS();

		tr.pin = 665;

		SNS tr1 = new SNS();

		tr1.pin = 876;

		// System.out.println(pin);

		System.out.println(tr.pin);
		System.out.println(tr1.pin);
		tr.caller();

	}

	public void caller() {
		System.out.println("Caller");
		joker();
		pinned();
	}

	public static void pinner() {
		System.out.println("pinner");
		joker();
		pinned();
	}

	public void joker() {

	}

	public static void pinned() {

	}
}
