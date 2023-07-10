package accessmodifier2;


import accessmodifier1.ClassLevelPublic;
import accessmodifier1.MemberLevelAccessModifier;

public class TestClassAM2 {

	public static void main(String[] args) {

		ClassLevelPublic p = new ClassLevelPublic();
		
		ClassLevelDefault d = new ClassLevelDefault();
		
		
		MemberLevelAccessModifier m = new MemberLevelAccessModifier();

		m.publicMethod();
		m.defaultMethod();
		m.protectedMethod();
		m.privareMethod();

		
		
	}

}
