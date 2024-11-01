package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import business.Compte;

public class ServiceBanqImpl extends UnicastRemoteObject implements ServiceBanque  {

	public ServiceBanqImpl() throws RemoteException {
		super();
		
		
	}
	
	public double conversion (double somm) {
		
		double res= somm*1000;
		return res;
		
		
	}
	
	public Compte consulterCompte(int code) {
		
		Compte cp= new Compte (code);
		return cp;
		
	}

	
	
}
