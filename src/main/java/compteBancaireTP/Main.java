package compteBancaireTP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("libellé du portefeuille?");
		String libelle = userInput.next();
		
		
		System.out.println("Nom de la Banque?");
		String nomBanque = userInput.next();
		
		
		System.out.println(libelle.toString());
		System.out.println(nomBanque.toString());
		
		
		userInput.close();
	}

}
