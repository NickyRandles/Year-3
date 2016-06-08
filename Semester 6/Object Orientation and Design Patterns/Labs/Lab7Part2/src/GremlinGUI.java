import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class GremlinGUI extends JFrame implements ActionListener{

	JPanel panel, innerPanel;
	JPanel [] gremlinPanel = new JPanel[50];
	JButton add;
	ArrayList<String> names = new ArrayList<String>();
	String newName;
	
	public GremlinGUI(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 10));
		add = new JButton("Add gremlin");
		add.addActionListener(this);
		
		addToList();
		addGremlins();
		
		this.add(panel, BorderLayout.CENTER);
		this.add(add, BorderLayout.SOUTH);
		this.setLocation(285, 185);
		this.setSize(800, 400);
		this.setVisible(true);
	}
	
	public void addToList(){
		String [] list = {"Robert", "David", "Paul", "Thomas", "Aiden", "Adrian", "Jeremy", "Chris", "Keith", "Cian", "Niall", "Darragh", "Sean", "Dylan", "Conor", "Ciaran", "Hugh"};
		for(int i = 0; i < list.length; i++){
			names.add(list[i]);
		}
	}
	
	public void addGremlins(){
		panel.removeAll();
		
		for(int i = 0; i < names.size(); i++){
			GremlinFactory factory = new GremlinFactory();
			Gremlin gremlin = factory.getGremlin(names.get(i));
			gremlinPanel[i] = new JPanel();
			gremlinPanel[i].setLayout(new BorderLayout());
			JLabel image = new JLabel(gremlin.getImage());
			JLabel name = new JLabel(gremlin.getName(), SwingConstants.CENTER);
			gremlinPanel[i].add(image, BorderLayout.CENTER);
			gremlinPanel[i].add(name, BorderLayout.SOUTH);
			panel.add(gremlinPanel[i]);
		}
		
		panel.revalidate();
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			newName = JOptionPane.showInputDialog(null, "What is your name?", "Enter your name", JOptionPane.QUESTION_MESSAGE);
			if(newName != null){
				names.add(newName);
				addGremlins();
			}
		}
		
	}
	
	public static void main(String [] args){
		new GremlinGUI();
	}
}
