package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Calcul et affichage de la moyenne des éléments du tableau
		 */
		int sommeElements = 0;
		for (int n = 0; n < array.length; n++) {
			sommeElements = sommeElements + array[n];
		}
		int moyenne = sommeElements / array.length ;
		
		System.out.println("La moyenne des éléments du tableau est de : " + moyenne + ".");
	}

}
