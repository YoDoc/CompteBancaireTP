package formation;

public class Virement extends Operation {
	private String compteVirement = "test";

	public String getCompteVirement() {
		return compteVirement;
	}

	public void setCompteVirement(String compteVirement) {
		this.compteVirement = compteVirement;
	}

	@Override
	public double getMontant() {
		return -getDebit();
	}

	@Override
	public void setMontant(double montant) {
		setDebit(-montant);

	}
	
	public Virement() {
	super ();
	}

	public TypeOperation getTypeOperation() {
		return TypeOperation.VIREMENT;
	}
}
