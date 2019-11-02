package demo.tow;

public class Compte {
	
	private int code;
	private float solde;
	private static int nbCompte;
	
	public Compte(float s){
		nbCompte++;
		code = nbCompte;
		solde = s;
	}
	
	public void verser(float mt) {
		solde = solde+mt;
	}
	public void retirer(float mt) {
		solde = solde -mt;
	}
	
	

	public int getCode() {
		return code;
	}

	public float getSolde() {
		return solde;
	}

	public static int getNbCompte() {
		return nbCompte;
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	

}
