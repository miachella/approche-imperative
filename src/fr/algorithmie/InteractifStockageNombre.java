package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		/**
		 * Initialisation d'un tableau et des variables utiles
		 */
		int[] array = new int[10];
		int nb; 
		int val;
		int index = 0;
		
		/**
		 * Présentation du menu
		 */
		System.out.println("Choisissez une option dans le menu :");
		System.out.println("1 - Entrez un nouveau nombre dans le tableau");
		System.out.println("2 - Affichez le tableau");
		
		Scanner scanner = new Scanner(System.in) ;
		
		for (int n = 0; n < 11; n ++) {
			/**
			 * Choix dans le menu
			 */
			System.out.println("Faites votre choix :");
			nb = scanner.nextInt() ;
			
			/**
			 * Action 
			 */
			if (nb == 1) {
				System.out.println("Tapez une valeur du tableau :");
				val = scanner.nextInt() ;
				array[index] = val;
				index = (index + 1) ;
			} else if (nb == 2) {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + ", ");
				}
				System.out.println("sont les valeurs inclues dans le tableau.");
			}
		}
	}

}
