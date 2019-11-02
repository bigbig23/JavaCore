package one;

import java.rmi.Naming;
import java.util.List;

public class ClientRMI {

	public static void main(String[] args) {
		 
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BANQUE");
			System.out.println(stub.conversion(90));
			System.out.println(stub.test());
			Compte cp = stub.consulter(9);
			System.out.println("Code" + cp.getCode());
			System.out.println("Code" + cp.getSolde());
			List<Compte> cptes = stub.listComptes();
			for(Compte cs :cptes) {
				System.out.println(cs.getSolde());
			}
			
			
	 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
