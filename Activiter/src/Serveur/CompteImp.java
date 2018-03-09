package Serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CompteImp extends UnicastRemoteObject implements ICompte {
	double solde=0;
	public CompteImp() throws RemoteException{super();}
	public CompteImp(double solde)throws RemoteException{
		this.solde=solde;
	}
	public void debiter(double m1) {
		solde=solde-m1;
	}
	public void crediter(double m2) {
		solde=solde+m2;
	}
	public double lireSolde(){
		return solde;
	}
}
