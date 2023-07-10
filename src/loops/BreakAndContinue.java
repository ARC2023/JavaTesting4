package loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		String[] names=new String[5];
		
		names[0]="Sagar";
		names[1]="Kalyani";
		names[2]="Surekha";
		names[3]="Priyanka";
		names[4]="Chandu";
		
		
		
		// 1. Break 
		
	/*	for(String str:names) {
			
			System.out.println(str);
			System.out.println("**********************");
			if(str.equals("Surekha")) {
				System.out.println("Name Found");
				break;
			}
			
		}*/
		
		
		
		
		
		// 2. Continue
		
		for(int i=0;i<23;i++) {
			
			if(i<=11 || i>=18) {
				continue;       // To skip the iteration
			}
			
			System.out.println(i);
		}
		
		

	}

}
