package demo.tow;

public class AppTd2 {

	public static void main(String[] args) {
 
		Compte c1 = new Compte(4000);
		Compte c2 = new Compte(4000);
		
		System.out.println(c1.getSolde());
		System.out.println("nbCompte"+Compte.getNbCompte());
		
	}

}
