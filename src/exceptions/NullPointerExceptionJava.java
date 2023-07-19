package exceptions;

public class NullPointerExceptionJava {

	
	
	
	public static void main(String[] args) {
		NullPointerExceptionJava np= new NullPointerExceptionJava();
		System.out.println("before Try");
		try {
		System.out.println(np);
		np=null;
		np.calling();
		}catch (NullPointerException e) {
			System.out.println("Inside Catch block");
		}catch (Exception e) {
			
		}
		System.out.println("After Try");
	}
	
	public void calling() {
		System.out.println("Calling");
	}
}
