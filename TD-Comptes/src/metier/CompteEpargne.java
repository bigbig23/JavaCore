package metier;

import java.util.Date;

public class CompteEpargne extends Compte{

	private double taux;
	@Override
	public void retirer(double mt) {
		 if(mt > solde) throw new RuntimeException("solde insuffisant");
		 Retrait r = new Retrait(operations.size()+1, new Date(), mt);
		 operations.add(r);
		 solde-=taux;
	}

	@Override
	public void updateSolde() {
		solde= solde+(solde*taux/100);
		//solde = solde*(1+taux/1000); the second solutions
		
	}

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(int code, double solde, double taux) {
		super(code, solde);
		this.taux = taux;
	}

	 
	 
	
	

}
