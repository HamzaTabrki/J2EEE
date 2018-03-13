package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import Metier.CompteMetier;
public class Serveur {
	public static void main (String[] args) {
		try {
			System.out.println("une autre version");
			LocateRegistry.createRegistry(1099);
			CompteMetier C =new CompteMetier();
			Naming.rebind("rmi://localhost:1099/Banque", C);
			System.out.println(C.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}