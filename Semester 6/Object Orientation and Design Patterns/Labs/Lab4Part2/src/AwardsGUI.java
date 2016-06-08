
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class AwardsGUI extends JFrame implements ActionListener{
	AwardingBody award;
	JPanel panel, comboPanel;
	JTextField text;
	JLabel label;
	JComboBox<String> placeBox, awardingBodyBox;
	String [] places = {"Choose place", "First", "Second", "Third"};
	String [] awardingBodies = {"Select", "Athletics", "HorseShow"};
	
	public AwardsGUI(){
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		label = new JLabel();
		text = new JTextField(20);
		comboPanel = new JPanel();
		comboPanel.setLayout(new GridLayout(1,2));
		placeBox = new JComboBox<String>(places);
		placeBox.addActionListener(this);
		awardingBodyBox = new JComboBox<String>(awardingBodies);
		awardingBodyBox.addActionListener(this);
		comboPanel.add(placeBox);
		comboPanel.add(awardingBodyBox);
		
		panel.add(text, BorderLayout.NORTH);
		panel.add(label, BorderLayout.CENTER);
		panel.add(comboPanel, BorderLayout.SOUTH);
		
		this.add(panel);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new AwardsGUI();
	}

	public void actionPerformed(ActionEvent e) {
		if(placeBox.getSelectedItem().equals("First") && awardingBodyBox.getSelectedItem().equals("Athletics")){
			award = new AthleticsAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(1).getIcon());
		}
		else if(placeBox.getSelectedItem().equals("Second") && awardingBodyBox.getSelectedItem().equals("Athletics")){
			award = new AthleticsAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(2).getIcon());
		}
		else if(placeBox.getSelectedItem().equals("Third") && awardingBodyBox.getSelectedItem().equals("Athletics")){
			award = new AthleticsAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(3).getIcon());
		}
		else if(placeBox.getSelectedItem().equals("First") && awardingBodyBox.getSelectedItem().equals("HorseShow")){
			award = new HorseShowAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(1).getIcon());
		}
		else if(placeBox.getSelectedItem().equals("Second") && awardingBodyBox.getSelectedItem().equals("HorseShow")){
			award = new HorseShowAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(2).getIcon());
		}
		else if(placeBox.getSelectedItem().equals("Third") && awardingBodyBox.getSelectedItem().equals("HorseShow")){
			award = new HorseShowAwardingBody();
			text.setText(award.getMessage());
			label.setIcon(award.getPrize(3).getIcon());
		}
	}
	



}

	
