package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Recherche et affichage du plus grand élément du tableau
		 */
		int valeurMaximum = 0;
		int indexMaximum = 0;
		for (int n = 0; n < array.length; n++) {
			if (array[n] > valeurMaximum) {
				valeurMaximum = array[n];
				indexMaximum = n; 
			}
		}
		System.out.println("Le plus grand élément du tableau est " + valeurMaximum + " et son index est " + indexMaximum + ".");
	}

}
