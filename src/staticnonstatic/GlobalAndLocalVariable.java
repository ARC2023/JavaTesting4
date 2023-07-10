package staticnonstatic;

public class GlobalAndLocalVariable {

	int global=900;
	
	
	
	
	public void local() {
		
		int locally=907;
		
	}

	
	
	public static void main(String[] args) {
		GlobalAndLocalVariable gg=new GlobalAndLocalVariable();
		
		gg.global=00;
		
		gg.locally=99;
	}
	
	
}
