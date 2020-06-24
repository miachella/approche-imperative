package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		int nb ;
		do {
				System.out.println("Tapez un nombre :");
				Scanner scanner = new Scanner(System.in) ;
				nb = scanner.nextInt() ;
		} while (nb < 1 || nb > 10);
		
		System.out.println("Le chiffre " + nb + " est compris entre 1 et 10.");
	}

}
