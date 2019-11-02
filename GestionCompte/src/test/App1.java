package test;

import demo.Compte;
import demo.CompteSimple;

public class App1 {

	public static void main(String[] args) {
 
		//Compte c1 = new Compte(1,600); //cant be initiated as it's from abstract class
		Compte c = new CompteSimple(1, 1000, 500);
		c.verser(100);
		c.retirer(100);
		System.out.println(c.toString());
		
		
	}

}
