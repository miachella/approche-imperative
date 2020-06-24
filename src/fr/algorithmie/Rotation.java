package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		/**
		 * Déclaration et affichage d'un tableau random d'entiers 
		 */
		/*int[] array = new int[(int)Math.floor(Math.random()*9) + 1];
		
		System.out.println("Le tableau généré est le suivant :");
		for (int n = 1; n < array.length; n++)  {
			array[n] = (int)Math.floor(Math.random() * 10); 
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
	    }*/
		
		/**
		 * Déclaration du tableau array 
		 */
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/**
		 * Affichage du tableau rotationné :p
		 */
		System.out.println("Les éléments du tableau initial sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
		
		/**
		 * Rotation des valeurs à droite
		 */
		int tmp = array[array.length - 1];
		int tmp2 = array[0];
		for (int i = 0; i < array.length - 1 ; i++) {
			tmp2 = array[i];
			System.out.println("Le plop " + tmp2 + " Le array[i] " + array[i] + ".");
			array[i] = tmp;
			tmp = tmp2;
			System.out.println("L'élement d'index " + i + " est devenu " + array[i] + " et le tmp " + tmp);
		}
		
		/**
		 * Affichage du tableau rotationné :p
		 */
		System.out.println("Les éléments du tableau après rotation sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
	}

}
