package GUI;
import java.net.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class Server extends JFrame implements ActionListener{
	
	public DatagramSocket socket = null;
	JButton choose;
	JTextArea area;
	int i = 0;
	String path;
	
	public static void main(String [] args) throws Exception{
		Server server = new Server();
	}
	
	public Server() throws Exception{
		socket = new DatagramSocket(6060);
		System.out.println("Waiting for client to connect...");
		
		
		choose = new JButton("Choose file");
		choose.addActionListener(this);
		
		area = new JTextArea();

		
		this.add(choose, BorderLayout.NORTH);
		this.add(area, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);

	}
	
	public void run(String p){
		while(true){
			try{
				byte [] buffer = new byte[256];
				
				//recieve data from client
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);

				String message = getLine(p);
				buffer = message.getBytes();
				
				//send data to client
				InetAddress ipAddress = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buffer, buffer.length, ipAddress, port);
				
				socket.send(packet);
			}
		
			catch(Exception e){
				e.printStackTrace();
			}
		}
			
	}
	
	public String getLine(String p){
		File file = new File(p);
		BufferedReader reader;
		ArrayList<String> lines = new ArrayList<String>();
		String line;
		try{
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null){
				lines.add(line);
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
		line = lines.get(i);
		i++;
		return line;
	
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == choose){
			area.append("Selecting file");
			JButton open = new JButton();
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new java.io.File("C:\\Users\\Nicky\\Desktop\\College\\College\\Year 3\\Semester 6\\Network Distributed Systems"));
			if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){}	
			path = fc.getSelectedFile().getAbsolutePath();
			
			run(path);
		}
		
	}

}
