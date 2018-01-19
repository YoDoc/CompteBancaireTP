package formation;

public class MyClass {

	public static void main(String[] args) {

		
		
		IOperation operation1 = new Prelevement();
		IOperation operation2 = new Prelevement();

		IcalculTaux monTaux = new IcalculTaux() {

			@Override
			public double calcule(IOperation operation, double taux) {
				// TODO Auto-generated method stub
				return operation.getMontant() * taux;
			}
		};

			operation1 = new Operation() {

			private double montant;
			private String libelle;
			private double taux;

			@Override
			public double getMontant() {
				return montant;
			}

			@Override
			public void setMontant(double montant) {
				this.montant = montant;
			}

			@Override
			public TypeOperation getTypeOperation() {
				return TypeOperation.CHEQUE;
			}

			@Override
			public void setLigne(String libelle, double montant, double taux) {
				this.libelle = libelle;
				this.montant = montant;
				this.taux = taux;
			}

			@Override
			public String toString() {
				return "libelle <" + libelle + ">  \n montant : " + montant + " \t taux  " + taux;
			}
		};

		operation1.setLigne("salaire de la Classe Anonymous ", 9999, 0.2);
		
		// Mes systèmes OUT:
		System.out.println(operation1.toString());
		System.out.println("\n");
		System.out.println("Montant du Taux à 20% \n" + monTaux.calcule(operation1, 0.2));

		System.out.println("Mon Taux à 20%" + monTaux.calcule (operation1,0.2));
		System.out.println("Mon Taux à 20%" + operation1.calculTaux(0.2, monTaux));
		System.out.println("Mon Taux à 20% " + operation1.calculTaux(0.2,     (bibi, bobo) -> bibi.getMontant() * bobo));
		
		// operation1.setLigne("Anonymous", -1251, 0.1);
		// System.out.println(operation1.toString());
		//
		// Operation z = new Virement();
		// z.setLigne("Operation z", 10, 2);
		// System.out.println(z.toString());
		//
		// Virement a = new Virement();
		// a.setLibelle("1A58AFF89789");
		// a.setDebit(150);
		//
		// Depot b = new Depot(TypeOperation.CB);
		// b.setLibelle("GR343434");
		// b.setCredit(300);
		//
		// System.out.println("Virement N° " + a.getLibelle() + " de " + a.getDebit() +
		// " Euro, solde: " + a.getMontant()
		// + " euros.");
		//
		// // System.out.println("Dépot N° " + b.getLibelle() + " de type " +
		// // TypeOperationJDK5.getValue(b.getTypeOperation()) + " de " + b.getCredit()
		// // + " Euro, solde: " + b.getMontant() + " euros.");
		//
		// double bTTC = b.calculeMontantTTC(0.2);
		// System.out.println("Le dépot (b) de " + b.getCredit() + " fait en TTC " +
		// bTTC);
		//
		// System.out.println(TypeOperationJDK5.getValue(TypeOperationJDK5.TYPE_CHEQUE));
		// System.out.println(TypeOperationJDK5.getValue(5));
		// System.out.println(TypeOperationJDK5.getValue("CB"));
		//
		// // IOperation operation = new Prelevement();
		// // System.out.println(TypeOperation.getValue("prelèvement").toString()+"\n");
		//
		// System.out.println(TypeOperation.CHEQUE.toString());
		// System.out.println(TypeOperation.ESPECE.toString());
		//
		// // COMMENT: Pour générer une NullPointerException, càd qu'il ne peut pas
		// gérer
		// // le cas ou Le type d'opération est null
		//
		// try {
		// System.out.println(TypeOperation.getValue("toto").toString());
		// } catch (NullPointerException | ExceptionValeurIndefinie e) {
		// System.out.println("erreur de NullPointerException");
		// e.printStackTrace();
		// } finally {
		// System.out.println("Au final");
		// }
		//
		// System.out.println("Héhéhéhé");
		//
		// System.out.println();

	}
}

/*
 * Operation popo; // définit une variable de type classe Operation popo = new
 * Operation("F5848F \n", 1500); // crée un objet créé du constructeur Opération
 * dont la signature est ce nom //et le fait qu'il ait 2 arguments de type
 * String et nb avec pour valeurs:...
 * 
 * System.out.println(popo.libelle + popo.montant); popo=null;
 * 
 * System.gc();
 */
