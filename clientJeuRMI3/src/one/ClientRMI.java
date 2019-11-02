package one;

import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ClientRMI {

	public static void main(String[] args) {
		
		try {
			Context ctx = new InitialContext();
			IJeuRemote stub = (IJeuRemote) ctx.lookup("JUX");
			Scanner clavier = new Scanner(System.in);
			while(true) {
				System.out.println("Deviner un nombre ...");
				int nb = clavier.nextInt();
				if(nb==-1) break; //to break the client enter -1
				String rep = stub.jouer(nb);
				System.out.println(rep);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}

}
