package one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BanqueServiceImp extends UnicastRemoteObject implements IBanqueRemote{

	//UnicastRemoteObject this is one of RMI implementain that enable commuinication btwn 2 servers etc
	
	protected BanqueServiceImp() throws RemoteException {
		super();
		//constructor sans paramettre, c'est RMI va creer un port lui meme, 
		//mais on peut fixer le numero port aussi, par le metter dans le constructor
		 
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		 
		return mt*11.3;
	}

	@Override
	public String test() throws RemoteException {
		 
		return "Test";
	}

	@Override
	public Compte consulter(int code) throws RemoteException {
		
		return new Compte(code,Math.random()*70000);
	}

	@Override
	public List<Compte> listComptes() throws RemoteException {
		List<Compte> cptes = new ArrayList<Compte>();
		cptes.add(new Compte(1 ,Math.random()*70000));
		cptes.add(new Compte(2 ,Math.random()*70000));
		cptes.add(new Compte(3 ,Math.random()*70000));
		return cptes;
	}

	

}
