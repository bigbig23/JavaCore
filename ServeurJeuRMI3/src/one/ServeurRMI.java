package one;

import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
 

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			JeuImpl od = new JeuImpl();
			System.out.println(od);
			//Naming.rebind("rmi://localhost:1099/JEU", od);
			//lest's use JNDI instead of Naming.rebind()
			Context ctx = new InitialContext();
			ctx.rebind("JUX", od);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
