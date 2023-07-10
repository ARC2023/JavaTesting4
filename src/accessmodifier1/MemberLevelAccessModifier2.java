package accessmodifier1;

public class MemberLevelAccessModifier2 {

	TestClass tc = new TestClass();
	
	public static void main(String[] args) {
		MemberLevelAccessModifier m = new MemberLevelAccessModifier();

		m.publicMethod();
		m.defaultMethod();
		m.protectedMethod();
		m.privareMethod();

	}

}
