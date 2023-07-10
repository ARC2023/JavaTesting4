package conditonal;

public class LogIn {

	public static void main(String[] args) {
		
		String UN="Lucky";
		String PW="Lucy123";
		
		
		if(UN.equals("Lucky") && PW.equals(PW)) {
			
			System.out.println("Allow user to login");
			
		} else if(UN.equals("Lucky") && !PW.equals("Lucy123")){
			
			System.out.println("Pls input correct password");
		}else if(!UN.equals("Lucky") && PW.equals("Lucy123")){
			
			System.out.println("Our records shows you are not our customer kindly register to et started");
		}
		

	}

}
