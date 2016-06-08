package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import Client.ClientInterface;

public interface ServerInterface extends Remote{

	public void registerClient(ClientInterface client) throws RemoteException;
	public void broadcastMessage(String message) throws RemoteException;
}
