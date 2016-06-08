package Part1;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ComboView extends JFrame{
	HobbyList stuff = new HobbyList();
	JPanel panel = new JPanel();
	JTextField newHobby;
	JButton add, refresh;
	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
	JComboBox<String> hobbyBox  = new JComboBox<String>(model);
	ComboView(){
		newHobby = new JTextField(20);
		add = new JButton("Add");
		refresh = new JButton("Refresh");
			
		panel.add(newHobby);
		panel.add(add);
		panel.add(refresh);
		panel.add(hobbyBox);
		
		this.add(panel);
		this.setSize(250,300);
		this.setLocation(250, 0);
		this.setVisible(true);
		
	}
	
	public void setList(String [] h){
		

		for(int i = 0; i < h.length; i++){
			model.addElement(h[i]);
		}
			
		
		
	}
	
	public void update(String [] h){
		model.removeAllElements();
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
