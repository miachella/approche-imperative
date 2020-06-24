package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		/**
		 * Génère une valeur random
		 */
		int random = (int)Math.floor(Math.random()*99) + 1 ;
		
		
		/**
		 * Demande de deviner le nombre
		 */
		boolean trouve = false;
		int nb ;
		int essais = 0;
		Scanner scanner = new Scanner(System.in) ;
		do {
			System.out.println("Tapez un chiffre entre 1 et 100 :");
			nb = scanner.nextInt() ;
			
			if (nb > random) {
				System.out.println("Trop haut !");
				essais = essais + 1;
			} else if (nb < random ){
				System.out.println("Trop bas !");
				essais = essais + 1;
			} else {
				System.out.println("Trouvé !");
				essais = essais + 1;
				trouve = true;
				System.out.println("Bravo ! Vous avez trouvé la bonne réponse en " + essais + " coups.");
			}
			
		} while (trouve == false) ;
		
		
		
	}

}
