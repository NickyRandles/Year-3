package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Server.ServerInterface;

public class ClientMain{

	public static void main(String [] args) throws RemoteException, MalformedURLException, NotBoundException{
		
		Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
		ServerInterface server = (ServerInterface) reg.lookup("Server");
		String name = JOptionPane.showInputDialog("What is you name: ");
		if(name != null){
			new Client(name, server);
			System.out.println("Connected");
		}
			
	}
}
