package Part1;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ListView extends JFrame{
	HobbyList stuff = new HobbyList();
	JPanel panel = new JPanel();
	JTextField newHobby;
	JButton add, refresh;
	DefaultListModel<String> model = new DefaultListModel<String>();
	JList<String> list  = new JList<String>(model);

	ListView(){
		newHobby = new JTextField(20);
		add = new JButton("Add");
		refresh = new JButton("Refresh");
			
		panel.add(newHobby);
		panel.add(add);
		panel.add(refresh);
		panel.add(list);

		
		this.add(panel);
		this.setSize(250,300);
		this.setVisible(true);
		
	}
	
	public void setList(String [] h){
		for(int i = 0; i < h.length; i++){
			model.addElement(h[i]);
		}
		
	}
	
	public void update(String [] h){
		model.clear();
		for(int i = 0; i < h.length; i++){
			model.addElement(h[i]);
		}
	}
	
	public String getNewHobby(){
		return newHobby.getText();
	}
	
	public void buttonListener(JButton b, ActionListener listenerForAdd){
		b.addActionListener(listenerForAdd);
	}

	
	
	
	


	
	

}
