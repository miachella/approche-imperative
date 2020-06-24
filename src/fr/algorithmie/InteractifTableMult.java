package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	
	public static void main(String[] args) {
		/**
		 * Demande de taper un nombre
		 */
		int nb ; 
		do {
				System.out.println("Tapez un chiffre :");
				Scanner scanner = new Scanner(System.in) ;
				nb = scanner.nextInt() ;
		} while (nb < 1 || nb > 10);
		
		/**
		 * Ecriture de la table de multiplication 
		 */
		for (int i = 1; i < 11; i++) {
			int multiple = i * nb;
			System.out.println(nb + " * " + i + " = " + multiple);
		}	
	}
}
