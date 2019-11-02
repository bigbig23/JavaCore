package one;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
 
		Scanner clavier = new Scanner(System.in);
		System.out.println("code:"); int a = clavier.nextInt();
		System.out.println("sold:"); float s= clavier.nextFloat();
		
		Compte c1 = new Compte(a,s);
		System.out.println("montant verser: ");
		float mt1 = clavier.nextFloat();
		c1.verser(mt1);
	 
		System.out.println("montant retiter: ");
		float mt2 = clavier.nextFloat();
		try {
			c1.retirer(mt2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(c1.getSold());
		
	}

}
