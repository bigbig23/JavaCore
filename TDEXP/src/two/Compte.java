package two;

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
	
	public void retirer(float mt)throws SoldNoSuffisantException {
		if(mt>solde) {
			throw new SoldNoSuffisantException("montant insuffisant");
		}else
		solde = solde-mt;	
	}
	
	public float getSold() {
		return solde;
	}

}
