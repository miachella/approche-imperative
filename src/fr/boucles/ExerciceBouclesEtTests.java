package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		/**
		 * Declaration du tableau
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Affichage des elements du tableau
		 */
		System.out.println("Les éléments du tableau dans l'ordre sont :");
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n]);
		}
			
		/**
		 * Affichage des elements du tableau dans l'ordre inverse
		 */
		System.out.println("Les éléments du tableau dans l'ordre inverse sont :");
		for (int m = array.length - 1 ; m >= 0 ; m--) {
			System.out.println(array[m]);
		}
		
		/**
		 * Affichage des elements superieurs a 3 du tableau
		 */
		for (int o = 0; o < array.length; o++) {
			if (array[o] > 3) {
				System.out.println(array[o] + " est un chiffre supérieur à 3 du tableau.");
			}
		}
		
		/**
		 * Affichage des elements entiers pairs du tableau
		 */
		for (int a = 0; a < array.length; a++) {
			if (array[a] % 2 == 0) {
				System.out.println(array[a] + " est un entier pair du tableau.");
			}
		}
		
		/**
		 * Affichage des elements d'index pairs du tableau
		 */
		for (int b = 0; b < array.length; b++) {
			if (b % 2 == 0) {
				System.out.println(array[b] + " est un élément d'index pair du tableau.");
			}
		}
		
		/**
		 * Affichage des elements entiers impairs du tableau
		 */
		for (int c = 0; c < array.length; c++) {
			if (array[c] % 2 != 0) {
				System.out.println(array[c] + " est un entier impair du tableau.");
			}
		}
		
	}

}
