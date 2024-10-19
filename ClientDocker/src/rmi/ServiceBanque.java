package rmi;

import business.Compte;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceBanque extends Remote {
	
	public double conversion (double somm) throws RemoteException;
	public Compte consulterCompte(int code) throws RemoteException;
	

}
