package one;

public class Pomme extends Fruit{
	
	public Pomme(int p) {
		poids=p;
		System.out.println("Creation d'un Pomme de poids "+poids+" grammes");
 	}
	
	@Override
	public void afficher() {
		System.out.println("C;est un pomme");
	}
	
	public void afficherPoid() {
		System.out.println("Le poid de la Pomme es "+poids);
	}

}
