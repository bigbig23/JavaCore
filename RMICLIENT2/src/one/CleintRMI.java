package one;

import java.rmi.Naming;
import java.util.List;

import metier.Compte;
import rmi.IBanqueRemote;

public class CleintRMI {

	public static void main(String[] args) {
 
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.conversion(800));
			System.out.println("Consultantion d'un Compte");
			Compte cp = stub.constulterCompte(1);
			System.out.println("Code : "+ cp.getCode());
			System.out.println("Sold "+cp.getSolde());
			System.out.println("Date "+cp.getDateCreation());
			List<Compte> ls = stub.listCompte();
			for(Compte l:ls) {
				System.out.println("__________________");
				System.out.println("Code : "+ l.getCode());
				System.out.println("Sold "+l.getSolde());
				System.out.println("Date "+l.getDateCreation());
			}
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
