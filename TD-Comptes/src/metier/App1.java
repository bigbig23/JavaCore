package metier;

import java.util.List;

public class App1 {

	public static void main(String[] args) {

		try {
			//with try catch we get our message solde insiffisant rather than the RunTimeException
			Compte cp1 = new CompteCourant(1, 5000, 3000);
			Compte cp2 = new CompteEpargne(2, 7000, 5.0);
			
			cp1.verser(200);
			cp1.retirer(5000);
			cp1.virement(700, cp2);
			
			System.out.println("Solde .. " + cp1.constulterSolde());
			System.out.println("Solde .. " + cp2.constulterSolde());
			System.out.println();
			
			List<Operation> ls = cp1.getOperations();
			for(Operation o : ls) {
				System.out.println(o.getClass().getName()+"......"+o.getNumero()+">>"+o.getDateOperation()+">>"+o.getMontant());
			}
			System.out.println();	
			System.out.println("total versement .. " + cp1.getTotaleRetrait());
			System.out.println("total retirait .. " + cp1.getTotaleRetrait());
			
			System.out.println("update solde");
			cp1.updateSolde();
			cp2.updateSolde();
			System.out.println("Solde .. " + cp1.constulterSolde());
			System.out.println("Solde .. " + cp2.constulterSolde());
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}
