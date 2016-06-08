import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GameGUI extends JFrame implements ActionListener{
	JPanel selectionPanel;
	String [] balls = {"Select", "ball1", "ball2", "ball3", "ball4"};
	DefaultComboBoxModel model = new DefaultComboBoxModel(balls);
	JComboBox<String> ballBox = new JComboBox<String>(model);
	JButton shoot;
	JLabel selectionLabel, ball1, ball2, ball3, ball4;
	Chain basketball = new Basketball();
	Chain rugby = new Rugby();
	Chain football = new Football();
	Chain unrecognized = new Unrecognized();
	ImageIcon image;
	
	public GameGUI(){
		selectionPanel = new JPanel();
	
		image = new ImageIcon("sports.jpg");
		selectionLabel = new JLabel(image);
		shoot = new JButton("Shoot ball to Chain");
		shoot.addActionListener(this);
		selectionPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		selectionPanel.add(ballBox);
		selectionPanel.add(selectionLabel);
		selectionPanel.add(shoot);
		
		
		
		this.setLayout(new GridLayout(1, 5));
		this.add(selectionPanel);
		this.add((Component) basketball);
		this.add((Component) rugby);
		this.add((Component) football);
		this.add((Component) unrecognized);
		
		ballBox = new JComboBox<String>(balls);
		
		this.setSize(800, 400);
		this.setVisible(true);
	}
	
	public static void main(String [] args){
		new GameGUI();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == shoot){
			String item = (String) model.getSelectedItem();
			
			basketball.nextChain(rugby);
			rugby.nextChain(football);
			football.nextChain(unrecognized);
		
			basketball.getImage(item);			
		}
		
	}

}
