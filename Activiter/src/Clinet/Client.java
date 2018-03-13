package Clinet;
import java.rmi.Naming;
import Serveur.ICompte;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICompte C;
		try {
			C=(ICompte)Naming.lookup("rmi://localhost:1099/Banque");
			C.crediter(10);
			System.out.println("Votre solde est :"+C);
			C.debiter(0);
			System.out.println("Votre solde est :"+C);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
