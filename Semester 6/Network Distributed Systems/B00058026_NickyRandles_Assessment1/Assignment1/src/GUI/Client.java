package GUI;
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class Client extends JFrame implements ActionListener{

	JPanel panel;
	JLabel question01, question02;
	JButton choose;
	JTextField name;
	JTextArea area;
	String path;
	static String info = new String();
	static int count = 0;
	
	public static void main(String [] args){
		Client client = new Client();
	}
	
	Client(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));
		question01 = new JLabel("Choose a file name (include extension)");
		panel.add(question01);
		name = new JTextField();
		panel.add(name);
		question02 = new JLabel("Select a folder");
		panel.add(question02);
		choose = new JButton("Choose folder");
		choose.addActionListener(this);
		panel.add(choose);
		
		area = new JTextArea();
		
		this.add(panel, BorderLayout.NORTH);
		this.add(area, BorderLayout.CENTER);
		
		setSize(400, 400);
		setLocation(400, 0);
		setVisible(true);
	}
		
	public void copyFile(String path){
		try{
			File file = new File(path);
			PrintWriter writer;
			if(!file.createNewFile()){
				writer = new PrintWriter(new FileWriter(file));
				writer.print("");
				writer.close();
			}

			System.out.println("Copying file....");
			while(true){
				DatagramSocket socket = new DatagramSocket();

				byte [] buffer = new byte[8000];
				InetAddress ipAddress = InetAddress.getByName("localhost");
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ipAddress, 6060);
				socket.send(packet);
								
				packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);
				count = count + packet.getLength();
				String message = new String(packet.getData(), 0, packet.getLength());
				writer = new PrintWriter(new FileWriter(file, true));
					
				writer.append(message + "\r\n");	
					
			
				writer.close();	
				System.out.println(count);
			}
	}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == choose){
			area.append("File Saved");
			JButton open = new JButton();
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new java.io.File("C:\\Users\\Nicky\\Desktop\\College\\College\\Year 3\\Semester 6\\Network Distributed Systems"));
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){}	
			path = fc.getSelectedFile().getAbsolutePath() + "\\" + name.getText();			
			copyFile(path);
			
		}
		
	}
}
