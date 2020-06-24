package fr.boucles;

public class ExerciceBoucleBase {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			/** 
			 * Cette boucle sert a afficher les nombres 1 à 10 inclus
			 */
			System.out.println(i);
		}
		
		int j = 0;
		do {
			/** 
			 * Cette boucle sert a afficher mon nom 20 fois
			 */
			System.out.println("Mathilde Iachella");
			j++;
		}	while (j < 20);
		
		for (int k = 2; k < 102; k += 2) {
			/** 
			 * Cette boucle sert a afficher les nombres pairs de 2 à 100 inclus
			 */
			System.out.println(k);
		}
		
		for (int l = 1; l < 100; l += 2) {
			/** 
			 * Cette boucle sert a afficher les nombres impairs de 1 à 99 inclus
			 */
			System.out.println(l);
		}
	}
}
