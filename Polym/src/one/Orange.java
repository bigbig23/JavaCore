package one;

public class Orange extends Fruit {
	
	public Orange(int p) {
		poids=p;
		System.out.println("Creation d'un Orange de poids "+poids+" grammes");
 	}
	
	@Override
	public void afficher() {
		System.out.println("C;est un Orange");
	}
	
	public void afficherPoid() {
		System.out.println("Le poid de l'Orange es "+poids);
	}
	

}
