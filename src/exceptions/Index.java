package exceptions;

public class Index {

	public static void main(String[] args) {

		int[] op=new int[3];
		
		try {
		op[0]=1;
		op[1]=1;
		op[2]=1;
		op[3]=1;
		}catch (Exception e) {
System.out.println("EXception handled");		}
		
	}

}
