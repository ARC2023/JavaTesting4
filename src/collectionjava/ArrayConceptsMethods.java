package collectionjava;

public class ArrayConceptsMethods {

	public static void main(String[] args) {

		int[] io = new int[4];

		io[0] = 455;
		io[1] = 456;
		io[2] = 457;
		io[3] = 458;

		for (int temp : io) {
			// System.out.println(temp);

		}
		int[][] io2 = new int[2][2];

		io2[0][0] = 345;
		io2[0][1] = 347;
		io2[1][0] = 300;
		io2[1][1] = 360;

		System.out.println(io2.length);
		System.out.println(io2[0].length);

		for (int i = 0; i < io2.length; i++) {

			for (int j = 0; j < io2[0].length; j++) {

				System.out.print(io2[i][j] + "    ");
				

			}
			System.out.println();
		}

	}
	
	
	
	
	
	
	
	
	

}
