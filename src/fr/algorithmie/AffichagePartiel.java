package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Affichage des elements superieurs a 3 du tableau
		 */
		System.out.println("Les éléments du tableau supérieurs à 3 sont :");
		for (int n = 0; n < array.length; n++) {
			if (array[n] > 3) {
				System.out.print(array[n] + ", ");
			}
		}
		System.out.println("\n");
		
		/**
		 * Affichage des elements entiers pairs du tableau
		 */
		System.out.println("Les entiers pairs du tableau sont :");
		for (int n = 0; n < array.length; n++) {
			if (array[n] % 2 == 0) {
				System.out.print(array[n] + ", ");
			}
		}
		System.out.println("\n");
		
		/**
		 * Affichage des elements d'index pairs du tableau
		 */
		System.out.println("Les éléments d'index pair du tableau sont :");
		for (int n = 0; n < array.length; n++) {
			if (n % 2 == 0) {
				System.out.print(array[n] + ", ");
			}
		}
		System.out.println("\n");
		
		/**
		 * Affichage des elements entiers impairs du tableau
		 */
		System.out.println("Les entiers impairs du tableau sont :");
		for (int n = 0; n < array.length; n++) {
			if (array[n] % 2 != 0) {
				System.out.print(array[n] + ", ");
			}
		}
		System.out.println("\n");
		
	}

}
