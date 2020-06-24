package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Copie des elements du tableau dans un tableau copie dans l'ordre inverse
		 */
		int[] arrayCopy = new int[array.length];
		for (int n = 0; n < array.length; n++) {
			arrayCopy[array.length - n - 1] = array[n];
		}
		
		/**
		 * Affichage des items du tableau array
		 */
		System.out.println("Les éléments du tableau array sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
		
		/**
		 * Affichage des items du tableau arrayCopy
		 */
		System.out.println("Les éléments copiés dans le tableau arrayCopy sont :");
		for (int n = 0; n < arrayCopy.length; n++) {
			if (n < arrayCopy.length - 1) {
				System.out.print(arrayCopy[n] + ", ");
			} else {
				System.out.print(arrayCopy[n] + ". \n");
			}
		}
	}

}
