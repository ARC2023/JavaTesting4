package constructotrs;

public class TestClass {

	public static void main(String[] args) {

		ATM a = new ATM();

        System.out.println("**************************************");
		
		ATM aa = new ATM(1234, 9999, 2000);			
		System.out.println(aa.cardNo);
		System.out.println(aa.pin);
		System.out.println(aa.amount);
		
		aa.cardNo=98;
		aa.pin=89;
		aa.amount=78;
		
		System.out.println(aa.cardNo);
		System.out.println(aa.pin);
		System.out.println(aa.amount);
		
		
		
		System.out.println("**************************************");

		ATM aaa = new ATM(20000);
		System.out.println(aaa.amount);
		System.out.println(aaa.cardNo);
		System.out.println(aaa.pin);
		
	}
	
}
