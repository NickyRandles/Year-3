package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;

import Client.ClientInterface;

public class Server extends UnicastRemoteObject implements ServerInterface{

	private ArrayList<ClientInterface> clients;
	
	protected Server() throws RemoteException {
		super();
		clients = new ArrayList<ClientInterface>();
		
	}

	public void registerClient(ClientInterface client) throws RemoteException {
		clients.add(client);
		
	}
	
	public void broadcastMessage(String message) throws RemoteException {
		int i = 0;
		while(i < clients.size()){
			clients.get(i++).retrieveMessage(message);
		}	
	}


}
