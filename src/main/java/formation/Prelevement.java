package formation;

public class Prelevement extends Operation {
	private String destinataire = "Dupont";

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	@Override
	public double getMontant() {
		return -getDebit();
	}

	@Override
	public void setMontant(double montant) {
		setDebit(-montant);

	}
	public Prelevement() {
	super ();
	}
	
	public TypeOperation getTypeOperation() {
	return TypeOperation.PRELEVEMENT;	
	}
}
