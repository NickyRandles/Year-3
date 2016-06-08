package Client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Server.ServerInterface;


public class Client extends UnicastRemoteObject implements ClientInterface, ActionListener{

	private String name;
	private ServerInterface server = null;
	JFrame frame;
	JPanel panel;
	JTextArea textarea;
	JTextField text;
	JButton button;
	
	public Client(String name, ServerInterface server) throws RemoteException {
	
		this.name = name;
		this.server = server;
		server.registerClient(this);
		
		frame = new JFrame(name);
		panel = new JPanel();
		textarea = new JTextArea(20, 34);
		text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		button = new JButton("Send");
		button.addActionListener(this);
				
		panel.add(textarea);
		panel.add(text);
		panel.add(button);
		
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}

	public void retrieveMessage(String message) throws RemoteException {
		textarea.append(message + "\n");
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			String message = name + " : " + text.getText();
			System.out.println(message);

			try {
				server.broadcastMessage(message);
			} 
			catch (RemoteException ex) {
				ex.printStackTrace();
			}
			
			text.setText("");
		}
		
	}	
	
}
