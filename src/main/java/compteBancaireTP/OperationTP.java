package compteBancaireTP;

import java.util.Date;

public abstract class OperationTP {

	OperationTP() {
		dateOperation = new Date();
		dateValeur = null;
		debit = 0;
		credit = 0;
	}

	private Date dateOperation = new Date();
	private Date dateValeur = null;
	private String libelle = "test";
	protected int credit = 0;
	protected int debit = 0;

	
	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Date getDateValeur() {
		return dateValeur;
	}

	public void setDateValeur(Date dateValeur) {
		this.dateValeur = dateValeur;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getDebit() {
		return (double) debit / 100;
	}

	public void setDebit(double debit) {
		this.debit = (int) (debit * 100);
	}

	public double getCredit() {
		return (double) credit / 100;
	}

	
	public void setCredit(double credit) {
		this.credit = (int) (credit * 100);
	}
}