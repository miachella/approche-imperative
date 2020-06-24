package fr.algorithmie;

public class TriABulle {

	public static void main(String[] args) {
		/**
		 * Déclaration du tableau array
		 */
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		/**
		 * Affichage des items du tableau
		 */
		System.out.println("Les éléments du tableau sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
		
		/**
		 * Tri à bulle du tableau
		 */
        int tmp = 0;  
        for(int n = 0; n < array.length; n++) {
        	for(int m = 1; m < (array.length - n); m++) {  
        		if(array[m - 1] > array[m]) {
        			tmp = array[m - 1];  
        			array[m - 1] = array[m];  
        			array[m] = tmp;  
        		}
        	}
        }
        
        /**
		 * Affichage des items du tableau
		 */
		System.out.println("Les éléments du tableau après tri sont :");
		for (int n = 0; n < array.length; n++) {
			if (n < array.length - 1) {
				System.out.print(array[n] + ", ");
			} else {
				System.out.print(array[n] + ". \n");
			}
		}
	}

}
