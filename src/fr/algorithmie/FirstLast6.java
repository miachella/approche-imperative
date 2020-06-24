package fr.algorithmie;

public class FirstLast6 {

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
		 * Test si le tableau a au moins un élément ET commence ou finit par 6
		 */
		boolean firstLast6 = false;
		if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
			firstLast6 = true;
		}
		
		System.out.println("La variable firstLast6 vaut : " + firstLast6 + ".");
		
	}

}
