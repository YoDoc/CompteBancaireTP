package formation;

import java.util.Date;

public abstract class Operation implements IOperation {

	// Classe interne
	class Ligne {
		public int montant;
		public String libelle;
		
		@Override
		public String toString() {
			// la methode toString ci dessous, fait appel à la méthode parent, ici la classe objet 
			return super.toString() + "(libelle:<" + libelle + ">, "
									+"Montant: " + montant +" )";
		}
	}

	private Date dateOperation = new Date();
	private Date dateValeur = null;
	private String libelle = "test";
	protected int credit = 0;
	protected int debit = 0;

	private Ligne ligneHT = new Ligne();
	private Ligne ligneTVA = new Ligne();

//	public String getligneHT() {
//		return ligneHT;
//	}
//	
//	public String getligneTVA() {
//		return ligneTVA;
//	}
	
	protected void setLigneHT(String libelle, double montant) {
		ligneHT.libelle = libelle;
		ligneHT.montant = convertSomme(montant);
	}

	public void setLigneTVA(String libelle, double montant) {
		ligneTVA.libelle = libelle;
		ligneTVA.montant = convertSomme(montant);
	}

	public void setLigne(String libelle, double montant, double taux) {
		setLibelle(libelle);
		setMontant(montant * (1. + taux));
		
		setLigneHT(libelle, montant);
		setLigneTVA("TVA", taux * montant);

	}

	public static int convertSomme(double value) {
		return (int) Math.floor(value * 100);
	}

	public static double convertSomme(int value) {
		return (double) value / 100;
	}

	public abstract double getMontant();

	public abstract void setMontant(double montant);

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getCredit()
	 * 
	 */

	public double getCredit() {
		return (double) credit / 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setCredit(double)
	 * 
	 */

	public void setCredit(double credit) {
		this.credit = (int) (credit * 100);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getDebit()
	 * 
	 */

	public double getDebit() {
		return (double) debit / 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setDebit(double)
	 * 
	 */

	public void setDebit(double debit) {
		this.debit = (int) (debit * 100);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getDateOperation()
	 * 
	 */

	public Date getDateOperation() {
		return dateOperation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setDateOperation(java.util.Date)
	 * 
	 */

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getDateValeur()
	 * 
	 */

	public Date getDateValeur() {
		return dateValeur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setDateValeur(java.util.Date)
	 * 
	 */

	public void setDateValeur(Date dateValeur) {
		this.dateValeur = dateValeur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getLibelle()
	 * 
	 */

	public String getLibelle() {
		return libelle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setLibelle(java.lang.String)
	 * 
	 */

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public abstract TypeOperation getTypeOperation();

	// public void setTypeOperation(int typeOperation) {

	// this.typeOperation = typeOperation;

	// }

	public String toString() {
		return "Operation: " +getTypeOperation().toString()+
				"libelle: " +getLibelle()+
				"montant" 	+getMontant()+
				"credit: " 	+getCredit()+
				"debit: " 	+getDebit()+
				"TVA: " 	+ligneTVA.toString()+
				"HT: " 		+ligneHT.toString();
			
	}
	
	Operation() {
		dateOperation = new Date();
		dateValeur = null;
		debit = 0;
		credit = 0;
	}

	@Override
	public double calculTaux (double taux, IcalculTaux calculTaux) {
		return calculTaux.calcule(this, taux);
	}
	
	
	// Operation(int typeOperation) {
	// this();
	// this.typeOperation = typeOperation;
	// }

}