package formation;

public class Depot extends Operation {
	private TypeOperation typeOperation;
	
	@Override
	public double getMontant() {
		return getCredit();
	}

	@Override
	public void setMontant(double montant) {
		setCredit(montant);
	}
	
	Depot(TypeOperation typeOperation) {
	super ();
	this.typeOperation = typeOperation;
	}
	
	
	public TypeOperation getTypeOperation() {
		return typeOperation;
	}
}
