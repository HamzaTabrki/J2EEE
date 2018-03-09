package Client;
import java.rmi.Naming;

import Serveur.Hello;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj;
		String message;
		try {
			obj=(Hello)Naming.lookup("rmi://localhost:1099/HelloServeur");
			message=obj.sayHello();
			System.out.println(message);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
