package one;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) throws Exception {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("code:"); int a = clavier.nextInt();
		System.out.println("sold:"); float s= clavier.nextFloat();
		
		Compte c1 = new Compte(a,s);
		System.out.println("montant verser: ");
		float mt1 = clavier.nextFloat();
		c1.verser(mt1);
	 
		System.out.println("montant retiter: ");
		float mt2 = clavier.nextFloat();
		c1.retirer(mt2);
	 
		
		System.out.println(c1.getSold());
		
	}
	}


