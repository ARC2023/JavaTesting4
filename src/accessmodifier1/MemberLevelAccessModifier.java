package accessmodifier1;

public class MemberLevelAccessModifier {

	public void publicMethod() {
	}

	void defaultMethod() {
	}

	protected void protectedMethod() {
	}

	private void privareMethod() {
	}

	public static void main(String[] args) {
		
		MemberLevelAccessModifier m = new MemberLevelAccessModifier();
		
		
		m.publicMethod();
		m.defaultMethod();
		m.protectedMethod();
		m.privareMethod();
		
		
	}
	
	
}
