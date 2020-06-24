package fr.algorithmie;

public class FirstLast {
	
	public static void main(String[] args) {
		/**
		 * Déclaration et affichage d'un tableau random d'entiers 
		 */
		int[] array = new int[(int)Math.floor(Math.random()*10)];
		
		System.out.println("Le tableau généré est le suivant :");
		for (int n = 1; n < array.length; n++)  {
			array[n] = (int)Math.floor(Math.random() * 10); 
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
	    }
		
		/**
		 * Test si le tableau a au moins un élément ET les 1er et dernier éléments ont la même valeur
		 */
		boolean firstLast6 = false;
		if (array.length > 0 && array[0] == array[array.length - 1]) {
			firstLast6 = true;
		}
		
		System.out.println("La variable firstLast6 vaut : " + firstLast6 + ".");
		
	}

}
