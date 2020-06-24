package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		/**
		 * Initialisation des variables utiles
		 */
		int batons = 21;
		int nb;
		int tour = 0;
		String player = "vous";
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Il y a " + batons + " bâtons dans le jeu.");
		
		/**
		 * Début du jeu
		 */
		
		
		for (tour = 0; batons > 1; tour++) {
			if (tour%2 == 0) {
				/**
				 * Tour player réel
				 */
				do {
					System.out.println("Entrez le nombre de bâtons que vous voulez prélever :");
					nb = scanner.nextInt();
					if (nb <= 3 && nb >= 1) {
						batons = batons - nb;
					} else if (nb > 3) {
						System.out.println("Vous êtes trop gourmand ! Vous avez le droit de prélever entre 1 et 3 bâtons seulement.");
					} else {
						System.out.println("Je n'ai pas compris votre entrée, veuillez entrer un nombre entre 1 et 3 :");
				}
				} while (nb > 3 || nb < 1); 
				player = "l'ordinateur";
			} else {
				/**
				 * Tour player ordinateur
				 */
				nb = (int)Math.floor(Math.random()*2) + 1;
				System.out.println("Il choisit de prélever " + nb + " bâtons.");
				batons = batons - nb;
				player = "vous";
			}
			System.out.println("Il reste " + batons + " bâtons dans le jeu.");
			System.out.println("C'est à " + player + " de jouer !");
		}
		System.out.println("Ah bah non ... La partie est finie ! ");
		if (player == "l'ordinateur") {
			System.out.println("Félicitations, vous avez vaicu l'ordinateur !");
		} else {
			System.out.println("Dommage, ce sera pour une autre fois ... ");
		}
	}
}
