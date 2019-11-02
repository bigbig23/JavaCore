package one;

import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
 
		//Pomme pme = new Pomme(30);
		//Fruit p = new Pomme(30);
		//((Pomme)p).afficherPoid(); //without casting it won't find the method becoz it's no in Fruit class
		//the best way to declare afficherPoids() in fruit as abstract
		
		//making table
		Fruit[] fruits = new Fruit[3];
		ArrayList<Fruit> fruit = new ArrayList<Fruit>(); //this is more flexible than the table[]
		
		fruits[0] = new Pomme(30);
		fruits[1] = new Orange(50);
		fruits[2] = new Pomme(70);
		
		for(int i = 0;i<fruits.length;i++) {
			fruits[i].afficher();
		}
		
		
		
			

	 
	}

}
