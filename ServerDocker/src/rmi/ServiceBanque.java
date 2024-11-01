package rmi;

import java.rmi.*;

import business.Compte;

public interface ServiceBanque extends Remote {
	
	public double conversion (double somm) throws RemoteException;
	public Compte consulterCompte(int code) throws RemoteException;
	

}
