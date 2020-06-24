package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Recherche et affichage du plus petit élément du tableau
		 */
		int valeurMinimum = 100;
		int indexMinimum = 0;
		for (int n = 0; n < array.length; n++) {
			if (array[n] < valeurMinimum) {
				valeurMinimum = array[n];
				indexMinimum = n; 
			}
		}
		System.out.println("Le plus petit élément du tableau est " + valeurMinimum + " et son index est " + indexMinimum + ".");
	}

}
