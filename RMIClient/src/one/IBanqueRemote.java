package one;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IBanqueRemote extends Remote {
	
	//since the Client side needs the interance of all class that implements it,
	//i just copied the package one, into my RMIClient, as we gonna need them
	//but it's not a good idea, it's better export the needed class as jar then
	//go ur clas path and add external jar ,this jar file which contains the classess
	
	public double conversion(double mt) throws RemoteException;
	public String test() throws RemoteException;
	public Compte consulter(int code) throws RemoteException;
	public List<Compte> listComptes() throws RemoteException;
	
	

}
