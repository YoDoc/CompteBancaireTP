package formation;

public class Enregistrement extends Operation{
	private String modeDePaiement = "test";

	public String getModeDePaiement() {
		return modeDePaiement;
	}

	public void setModeDePaiement(String modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}

	@Override
	public double getMontant() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMontant(double montant) {
		// TODO Auto-generated method stub
		
	}
	

}
