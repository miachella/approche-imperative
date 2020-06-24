package fr.algorithmie;

public class ComparaisonTableau {
	
	public static void main(String[] args) {
		/**
		 * Déclaration des tableaux array1 et array2
		 */
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		/**
		 * Affichage et comptage des éléments communs aux deux tableaux
		 */
		int nombreElementsCommuns = 0;
		for (int n = 0; n < array1.length; n++) {
			for (int m = 0; m < array2.length; m++) {
				if (array1[n] == array2[m]) {
					System.out.println(array1[n] + " est un élément commun aux deux tableaux.");
					nombreElementsCommuns++;
				}
			}
		}
		
		/**
		 * Affichage du nombre d'éléments communs aux deux tableaux
		 */
		System.out.println("Le nombre total d'éléments communs aux deux tableaux est : " + nombreElementsCommuns + ".");
	}

}
