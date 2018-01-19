package formation;
import java.util.Date;
public interface IOperation {
	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getDateOperation()
	 */
	Date getDateOperation();
	void setDateOperation(Date dateOperation);
	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#getDateValeur()
	 */
	Date getDateValeur();
	void setDateValeur(Date dateValeur);
	String getLibelle();

	void setLigne (String libelle, double montant, double taux);
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see formation.IOperation#setLibelle(java.lang.String)
	 */
	void setLibelle(String libelle);
	double getDebit();
	// Mathfloor pour un arrondi minimal
	void setDebit(double debit);
	double getCredit();
	void setCredit(double credit);
	public default double calculeMontantTTC(double taux) {
		return (getCredit() - getDebit()) * (1 + taux);
	}
	
	public TypeOperation getTypeOperation ();
	
	public double getMontant();
	
	double calculTaux (double taux, IcalculTaux calculTaux);
}


