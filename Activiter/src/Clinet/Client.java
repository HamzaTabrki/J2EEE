package Clinet;
import java.rmi.Naming;
import Serveur.ICompte;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICompte C;
		try {
			C=(ICompte)Naming.lookup("rmi://localhost:1098/HelloServeur");
			C.crediter(10);
			System.out.println("Votre solde est :"+C.lireSolde());
			C.debiter(0);
			System.out.println("Votre solde est :"+C.lireSolde());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
