package accessmodifier2;

import accessmodifier1.MemberLevelAccessModifier;

public class ProtectedInheritance extends MemberLevelAccessModifier{

	public static void main(String[] args) {
		ProtectedInheritance m = new ProtectedInheritance();

		m.publicMethod();
		m.defaultMethod();
		m.protectedMethod();
		m.privareMethod();


	}

}
