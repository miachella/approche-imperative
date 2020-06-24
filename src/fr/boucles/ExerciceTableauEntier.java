package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		/**
		 * Declaration du tableau
		 */
		int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/**
		 * Manipulations du tableau
		 */
		
		System.out.println(tableau[0]);
		System.out.println(tableau.length);
		System.out.println(tableau[tableau.length - 1]);
		
		/**
		 * Modification de l'element d'index 4
		 */
		
		tableau[4] = 8;
		System.out.println("Le nouvel element d'index 4 est " +tableau[4]);
		
	}

}
