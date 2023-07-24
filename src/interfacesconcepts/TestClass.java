package interfacesconcepts;

public class TestClass {

	public static void main(String[] args) {
		
		KingsWay kw= new KingsWay();
		kw.Cardiology();
		kw.Dental();
		kw.Hepatitis();
		kw.Nephro();
		kw.Ortho();
		kw.Parkinsons();
		kw.Cancer();
		kw.Diabetes();
		kw.Alzeimer();
		
		
		USMedicalAssociation usa= new KingsWay();
		
		usa.Dental();
		usa.Ortho();

		UKMedicalAssociation uk= new KingsWay();
		uk.Hepatitis();
		uk.Parkinsons();
		
		SLMedicalAssociation sl=new KingsWay();
		sl.Cardiology();
		sl.Nephro();
		
	/*	USMedicalAssociation ussa= new USMedicalAssociation();
		KingsWay ki= new UKMedicalAssociation();*/
		System.out.println(usa.minFees);
		
		USMedicalAssociation.minFees=890;
		
		System.out.println(USMedicalAssociation.minFees);
		
		USMedicalAssociation.Neurology();
		
		usa.Opthalmology();
		
	}

}
