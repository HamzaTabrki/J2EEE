package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Serveur {
	public static void main (String[] args) {
		try {
			System.out.println("une autre version");
			LocateRegistry.createRegistry(1098);
			CompteImp C =new CompteImp();
			Naming.rebind("rmi://localhost:1098/HelloServeur", C);
			System.out.println(C.lireSolde());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}