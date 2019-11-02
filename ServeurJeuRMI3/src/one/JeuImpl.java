package one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JeuImpl extends UnicastRemoteObject implements IJeuRemote{

	private int nombreSecret;
	private boolean fin;
	
	protected JeuImpl() throws RemoteException {
		super();
		//nombreSecret=(int) (Math.random()*1000); it can work now, but let's make a method for it now 
		generateSecret();
	}

	private void generateSecret() {
		nombreSecret=(int) (Math.random()*1000);
	}
	
	//le suel method exist en distance c'est jouer()
	@Override
	public String jouer(int nombre) throws RemoteException {
		if(fin==false) {
			if(nombre>nombreSecret) {
				return "votre nombre est plus gande";
			}else if(nombre<nombreSecret) {
				return "votre nombre est plus petit";
			}else {
				fin = true;
				return "Bravo";
			}
		 
		}else {
			return "jeu termine le nombreSecret est " + nombreSecret;
		}
	
	}

}
