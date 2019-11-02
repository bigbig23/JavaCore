package demo;

public abstract class Compte {
	
	protected int code;
	protected float solde;
	
	public Compte() {
		
	}

	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	
	public void verser(float mt) {
		solde+=mt;
	}
	
	public void retirer(float mt) {
		solde-=mt;
	}
	
	public float getSolde() {
		return solde;
	}
	
	public abstract void afficher();

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	
	
	

}
