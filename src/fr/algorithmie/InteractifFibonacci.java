package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		int nb;
		System.out.println("Donnez l'indice de la suite de Fibonacci dont vous voulez trouver la valeur :");
		Scanner scanner = new Scanner(System.in) ;
		nb = scanner.nextInt() ;
		
		int nb1 = 0;  
		int nb2 = 1; 
		int nb3;
        System.out.print(nb1 + " " + nb2);   
    
        for(int i = 2; i < nb; i++) {    
            nb3 = nb1 + nb2;       
            nb1 = nb2;    
            nb2 = nb3;  
            System.out.print(" " + nb3); 
        }
	}

}
