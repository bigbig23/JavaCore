package demo.one;

public class Compte {
	private int code;
	private float solde;
	
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	
	public void verser(float mt) {
		solde= solde+mt;
	}
	
	public void retirer(float mt) {
		solde = solde-mt;
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	
	
	

}
