package Serveur;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ICompte extends Remote {
	public void debiter(double montant)throws RemoteException;
	public void crediter(double montant)throws RemoteException;
	public double lireSolde()throws RemoteException;
}
