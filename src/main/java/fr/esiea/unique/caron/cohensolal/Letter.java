package fr.esiea.unique.caron.cohensolal;

import java.util.Random;

public class Letter {

	public static char pot[] = new char [100];
	public static int ordreJoueur[] = new int [10];
	char alphabet [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static int x=0;
	
	public void premierTirage(int n){
	
	for(int i=1; i<=n; i++){
		Random randomer = new Random();
		int indice = randomer.nextInt(alphabet.length);
		char lettre_tiree = alphabet[indice];
		pot[i-1] = lettre_tiree;
		ordreJoueur[i-1] = indice;
		System.out.println("Le joueur " + i + " a tiré la lettre " + lettre_tiree);
		x=n;
		}
	}
	
	public void tirerDeuxLettres(){
		for(int i=x+1; i<=x+2; i++){
		Random randomer = new Random();
		int indice = randomer.nextInt(alphabet.length);
		char lettre_tiree = alphabet[indice];
		pot[i-1] = lettre_tiree;
		System.out.println("Vous avez tiré la lettre " + lettre_tiree);
		}
	}
		
	public void ajoutPotCommun(){
		
		for(int i=x+1; i<=x+2; i++){
			System.out.print(pot[i-1] + " ");
		}
		
		x=x+2;
		
	}
	
	public void potCommun(int n){
	
		System.out.println("");
		System.out.println("Contenu du pot commun :");
	
		for(int i=1; i<=n; i++){
			System.out.print(pot[i-1] + " ");
		}
	
		
	}
	
	
	public void ordreJoueur(int n){
		
		int premierJoueur = 1;
		int min = ordreJoueur[0];
		
		for(int i=1; i<n; i++){
			if(ordreJoueur[i]<min){
				min=ordreJoueur[i];
				premierJoueur=i+1;
			}
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Le joueur " + premierJoueur + " joue en premier");
		System.out.println("");
	}
	
	
	
	
	
}
	
	
	

