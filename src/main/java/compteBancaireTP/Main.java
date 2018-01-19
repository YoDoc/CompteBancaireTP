package compteBancaireTP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("libellé du portefeuille?");
		int libelle = userInput.nextInt();
		System.out.println(libelle.toString());

	}

}
