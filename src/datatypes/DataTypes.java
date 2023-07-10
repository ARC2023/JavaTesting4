package datatypes;

public class DataTypes {
	
	byte by = 127;
	short sh=32767;
	int i=2147483647;
	long lo=9223372036854775807l;
	
	
	double db= 7890.90;
	float fl=5766.98f;
	
	char ch =  'A';
	char ch1 =  'a';
	char ch2 =  '1';
	char ch5 =  '0';
	char ch3 =  '*';
	char ch4 =  '_';
	
	boolean boo1= true;
	boolean boo2= false;
	
	String str="Joe Biden is arriving in Austria tomorrow for NATO summit";
	
	
	
	
	public static void main(String[] args) {
		
		new DataTypes();
		
		// Non Primitive Data Type 
		// Reference Variable
		DataTypes calci = new DataTypes();
		DataTypes calci1 = new DataTypes();
		DataTypes calci2 = new DataTypes();
		
		//calci.Addition();
		
		calci1.doAddition(550, 81);
		
		//System.out.println("The address of variable is "+calci);
		
	}
	
	
	
	
	public void  updateAccountBalanceInTravenSystem() {
		System.out.println("Addition");
	}
	

	public void  doAddition(int a,int b) {
		
		int c=a+b;
		
		System.out.println("Addition -->"+c);
	}

	public void doMultiply() {

	}
	public void doSubtract() {

	}
	public void doDivision() {

	}

}
