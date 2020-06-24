package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		/**
		 * Déclaration des tableaux array1 et array2
		 */
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		
		/**
		 * Création et remplissage du tableau contenant la somme des array1 et array2
		 */
		int[] arraySomme = new int[array1.length];
		for (int n = 0; n < array1.length; n++) {
			arraySomme[n] = array1[n];
		}
		for (int n = 0; n < array2.length; n++) {
			arraySomme[n] = arraySomme[n] + array2[n];
		}
		
		/**
		 * Affichage des items du tableau arraySomme
		 */
		System.out.println("Les éléments du tableau arraySomme sont :");
		for (int n = 0; n < arraySomme.length; n++) {
			if (n < arraySomme.length - 1) {
				System.out.print(arraySomme[n] + ", ");
			} else {
				System.out.print(arraySomme[n] + ". \n");
			}
		}
	}

}
