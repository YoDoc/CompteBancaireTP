package formation;

// conteneur de type enum contenant les constantes et leur String associée
public enum TypeOperation {
	CB("CB"), CHEQUE("Chèque"), ESPECE("Espèce"), VIREMENT(" Virement"), PRELEVEMENT("Prélevement");

	private String libelle = "";

	TypeOperation(String libelle) {
		this.libelle = libelle;
	}

	public String toString() {
		return libelle;
	}

	public static TypeOperation getValue(String value) throws NullPointerException, ExceptionValeurIndefinie {

		// TODO: Implémentation de la méthode getValue();
		
		//Nouvelle facon d'écrire une boucle for, veut dire qu'il parcourt les values du conteneur TypeOperation2
		if (value == null)
			throw new NullPointerException("'value' est null");
				
				for (TypeOperation v : TypeOperation.values())
			if (value.equals(v.toString())) {
				return v;
			}
		
		throw new ExceptionValeurIndefinie ("Valeur <" +value+ "> n'est pas définie");
		
//		switch (value) {
//		case "CB":
//			return TypeOperation2.CB;
//		case "Chèque":
//			return TypeOperation2.CHEQUE;
//		case "Espèce":
//			return TypeOperation2.ESPECE;
//		case "Virement":
//			return TypeOperation2.VIREMENT;
//		case "Prélevement":
//			return TypeOperation2.PRELEVEMENT;
//		}
//
//		return TypeOperation2.CB;
	}
}