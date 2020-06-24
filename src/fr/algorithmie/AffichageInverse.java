package fr.algorithmie;
public class AffichageInverse {

	public static void main(String[] args) {
		
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Affichage des items du tableau
		 */
		System.out.println("Les éléments du tableau dans l'ordre sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
			
		/**
		 * Affichage des elements du tableau dans l'ordre inverse
		 */
		System.out.println("Les éléments du tableau dans l'ordre inverse sont :");
		for (int m = array.length - 1 ; m >= 0 ; m--) {
			if (m > 0) {
				System.out.print(array[m] + ", ");
			} else {
				System.out.print(array[m] + ". \n");
			}
		}
		
		/**
		 * Copie des elements du tableau dans un tableau copie
		 */
		int[] arrayCopy = new int[array.length];
		for (int o = 0; o < array.length; o++) {
			arrayCopy[o] = array[o];
		}
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
