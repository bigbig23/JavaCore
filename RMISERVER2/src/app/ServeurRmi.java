package app;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmi.BanqueRmiService;

public class ServeurRmi {

	public static void main(String[] args) {

		try {
			LocateRegistry.createRegistry(1099);
			BanqueRmiService ob = new BanqueRmiService();
			System.out.println(ob.toString());
			Naming.rebind("rmi://localhost:1099/BK", ob);
			//in order this app works , the anuaire muste be running before it otherwise 
			//it won't work, so we gonna uss LocateRegistry to run it before,
			//it needs the port to be at running state before it
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
