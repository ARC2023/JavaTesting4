package loops;

public class ForLoops {

	public static void main(String[] args) {

		long[] savingsAmt = new long[10];

		savingsAmt[0] = 230000;
		savingsAmt[1] = 30000;
		savingsAmt[2] = 450000;
		savingsAmt[3] = 10000;
		savingsAmt[4] = 870000;
		savingsAmt[5] = 90000;
		savingsAmt[6] = 550000;
		savingsAmt[7] = 70000;
		savingsAmt[8] = 30000;
		savingsAmt[9] = 40000;

		System.out.println("Lenght of Array-->" + savingsAmt.length);

		// 1. traditional loop

		/*
		 * for(int i=0;i<savingsAmt.length;i++) {
		 * 
		 * 
		 * //if(savingsAmt[i]>=200000) { System.out.println(i);
		 * System.out.println("Insert to database-->"+savingsAmt[i]);
		 * 
		 * //}
		 * 
		 * }
		 */

		System.out.println("****************************************************");

		// 2. For Each loop
/*
		for (long r : savingsAmt) {
			// System.out.println(r);
			if (r >= 200000) {

				System.out.println("Insert to database-->" + r);

			}
		}
*/
		// 3. For Loop with decrement
		for (int i = 10; i>=0 ; i--) {

			System.out.println("Insert to database-->" + i);

		}

	}

}
