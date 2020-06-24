package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	
	
	public static void main(String[] args) {
		/**
		 * Demande de taper un nombre
		 */
		int nb ;
		System.out.println("Tapez un chiffre :");
		Scanner scanner = new Scanner(System.in) ;
		nb = scanner.nextInt() ;
	
		/**
		 * Ecriture des 10 entiers suivants 
		 */
		for (int i = 1; i < 11; i++) {
			System.out.print((nb + i) + ", ");
		}
	}
}
