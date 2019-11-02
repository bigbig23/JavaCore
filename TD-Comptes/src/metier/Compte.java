package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Compte {
	protected int code;
	protected double solde;
	protected List<Operation> operations = new ArrayList<>();
	
	public Compte() {
		
	}

	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	
	public void verser(double mt) {
		//when i create verser, it means i create un operation of type Versement()
		//lets retistor this operation to have a registerd opeartion so now we have story of our opeartion 
		Versement v = new Versement(operations.size()+1, new Date(), mt);
		//add this opeartion to our opeartion list
		operations.add(v);
		solde+=mt;
	}
	
	public abstract void  retirer(double mt);
	
	public void virement(double mt,Compte cp2) {
		//transfer money  from this Compte, to another cp2
		//we need retirer method then verser
		retirer(mt);
		cp2.verser(mt);
		
	}
	
	public double constulterSolde() {
		return solde;
	}
	
	//if it's CompteEpargne we update and it's CompteCourant we do nothing
	public abstract void updateSolde();
	
	public List<Operation> getOperations(){
		return operations;
	}
	
	public double totaleVersements() {
		double somme=0;
		for(Operation o :operations) {
			if(o instanceof Versement) {
				somme+=o.getMontant();
			}
		}
		return somme;

	}
	
	
	public double getTotaleRetrait() {
		double somme = 0;
		for(Operation o: operations) {
			if(o instanceof Retrait) {
				somme+=o.getMontant();
			}
		}
		return somme;
	}
	

}
