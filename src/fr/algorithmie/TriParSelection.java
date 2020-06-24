package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array
		 */
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		/**
		 * Affichage des items du tableau
		 */
		System.out.println("Les éléments du tableau sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
		
		/**
		 * Tri par sélection du tableau
		 */
		int valeurMin = 100;
		int indexMin = 0;
		for (int n = 0; n <= array.length - 2; n++) {
			for (int m = n; m <= array.length - 1; m++) {
				if (array[m] < valeurMin) {
					valeurMin = array[m];
					indexMin = m;
				}
			}
			System.out.println("Itération " + (n + 1) + " : le plus petit élément du tableau est " + valeurMin + ".");
			array[indexMin] = array[n];
			array[n] = valeurMin;
			valeurMin = 100;
		}
		
		/**
		 * Affichage des items du tableau
		 */
		System.out.println("Les éléments du tableau après tri sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
	}

}
