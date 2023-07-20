package finalfinallyfinalise;

public class TheFinallyBlock {

	public static void main(String[] args) throws Exception {

		System.out.println("Before try");
		try {
			System.out.println("inside try before exception");
			throw new Exception("Custom Exception");

		} catch (Exception e) {
			System.out.println("inside catch before exception");

			//throw new Exception("Custom Exception");
			try {
				int i = 9 / 0;
			} catch (Exception ee) {

			}
			int ioo = 9 / 0;
			System.out.println("inside catch After exception");

		} finally {
			System.out.println("After try and inside finally");
			int iaaa = 9 / 0;
			System.out.println("After try and inside finally");

			System.out.println("After try and inside finally");

			System.out.println("After try and inside finally");

			System.out.println("After try and inside finally");
			
		}

		System.out.println("After Finally Block");
	}

}
