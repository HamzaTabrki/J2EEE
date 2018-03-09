package Serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class HelloImp extends UnicastRemoteObject implements Hello {
	public HelloImp() throws RemoteException{super();}
	public String sayHello()throws RemoteException{return "Hello DSI22";}
}