package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		/**
		 * Demande de taper les nombres du tableau nombre
		 */
		int nb ;
		for (int i = 0; i < 10; i++) {
			System.out.println("Tapez une valeur du tableau :");
			Scanner scanner = new Scanner(System.in) ;
			nb = scanner.nextInt() ;
			array[i] = nb ;
		}
		
	
		/**
		 * Calcul et écriture de la somme arithmétique  
		 */
		int valeurMax = 0;
		for (int n = 0; n < array.length; n++) {
			if (array[n] > valeurMax) {
				valeurMax = array[n];
			}
		}
		System.out.println("La plus haute valeur du tableau entré est égale à " + valeurMax + ".");
	}

}
