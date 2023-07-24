package interfacesconcepts;

public interface USMedicalAssociation extends WHO {

	int minFees=900;
	
	public void Ortho();
	public void Pilia(); 
	
	public void Dental();
	
	public void SpineOperation();
	
	public static void Neurology() {
		
		
	}
	
	
	default void Opthalmology() {
		
		
	}
	
	
	
	public void Covid(String Country);
}
