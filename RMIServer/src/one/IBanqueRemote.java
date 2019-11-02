package one;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IBanqueRemote extends Remote {
	//to create RMI,
	//must first create interface and entends Remote 
	//all rmi method much throws RemoteException
	
	public double conversion(double mt) throws RemoteException;
	public String test() throws RemoteException;
	public Compte consulter(int code) throws RemoteException;
	public List<Compte> listComptes() throws RemoteException;
	
	

}
