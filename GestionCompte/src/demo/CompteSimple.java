package demo;

public class CompteSimple extends Compte{
	private float decouvert;
	
 
	public CompteSimple(int code, float solde,float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	 
	}
 

	@Override
	public void retirer(float mt) {
		 if(mt < solde+decouvert) {
			 solde-=mt;
		 }
	}


	@Override
	public void afficher() {
		System.out.println("C'est un compte Simple");
	}
	

}
