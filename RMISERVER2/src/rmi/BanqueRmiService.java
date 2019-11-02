package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote{

	//UnicastRemoteObject represent the SKELETON
	public BanqueRmiService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		System.out.println("conversion "+ mt);
		return mt*9.5;
	}

	@Override
	public Compte constulterCompte(int code) throws RemoteException {
		System.out.println("onstulterCompte "+ code);
		Compte cp = new Compte(code, Math.random()*800, new Date());
		return cp;
	}

	@Override
	public List<Compte> listCompte() throws RemoteException {
		System.out.println("listCompte ");
		List<Compte> cps = new ArrayList<Compte>();
		cps.add(new Compte(1, Math.random()*800, new Date()));
		cps.add(new Compte(2, Math.random()*800, new Date()));
		cps.add(new Compte(3, Math.random()*800, new Date()));
		return cps;
	}

	 

}
