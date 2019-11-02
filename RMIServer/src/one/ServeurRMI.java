package one;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	//SERVER SIDE
	public static void main(String[] args) {
		// il cree sa reference distance, apres il va publier sa reference 
		
		try {
			BanqueServiceImp objectDistance = new BanqueServiceImp();
			System.out.println(objectDistance.toString());//return the reference to our distance object 
			
			//maintenant on va publier sa reference en utilisant la class Naming
			//il prend le nom d'object qu'on va publier
			
			LocateRegistry.createRegistry(1099); //here we run the RMI directly from the app
			//to write the down lines, we know already our rmi is running , otherwise use the obove line to do it automatically
			//we can use commandline to run RMI too
			Naming.rebind("rmi://localhost:1099/BANQUE", objectDistance); //BANQUE is needed by Client side
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
