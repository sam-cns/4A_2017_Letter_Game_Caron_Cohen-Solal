package fr.esiea.unique.caron.cohensolal;

import java.util.Scanner;


public class Main {

	public static void main (String [] args) {
		
		int n;
		
		System.out.println("A combien voulez-vous jouer ? (10 max)");
		
		Scanner scanIn = new Scanner(System.in);
		
		try{
	    n = scanIn.nextInt();
		}
		finally{
			if(scanIn!=null)
		        scanIn.close();
		}
		
		Letter letter = new Letter();
		
		letter.premierTirage(n);
		letter.potCommun(n);
		letter.ordreJoueur(n);
		letter.tirerDeuxLettres();
		letter.potCommun(n);
		letter.ajoutPotCommun();
		
		
		
		
		
		
		
		
		
	}
	
	
}
