package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		/**
		 * Demande de taper un nombre
		 */
		int nb ;
		System.out.println("Tapez un chiffre :");
		Scanner scanner = new Scanner(System.in) ;
		nb = scanner.nextInt() ;
	
		/**
		 * Calcul et écriture de la somme arithmétique  
		 */
		int somme = 0;
		for (int i = 1; i <= nb; i++) {
			somme = somme + i;
		}
		System.out.println("La somme arithmétique de 1 à " + nb + " est égale à " + somme + ".");
	}

}
