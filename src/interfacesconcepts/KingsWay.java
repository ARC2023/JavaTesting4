package interfacesconcepts;

public class KingsWay extends GlobalPatientData implements USMedicalAssociation, UKMedicalAssociation, SLMedicalAssociation {

	@Override
	public void Ortho() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Dental() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Nephro() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Cardiology() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Parkinsons() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Hepatitis() {
		// TODO Auto-generated method stub

	}

	public void Cancer() {

	}

	public void Diabetes() {

	}

	public void Alzeimer() {

	}

	@Override
	public void Pilia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SpineOperation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Covid(String Country) {
		if (Country.equals("USA")) {

		} else if (Country.equals("UK")) {

		} else if (Country.equals("SL")) {

		}
	}

	@Override
	public void Vaccine() {
		// TODO Auto-generated method stub
		
	}
}
