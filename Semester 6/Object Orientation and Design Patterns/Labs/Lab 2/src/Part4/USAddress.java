package Part4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class USAddress extends Address implements ActionListener{

	JLabel label, address1, address2, address3, zipcode, blank;
	JTextField address1Field, address2Field, address3Field, zipcodeField;
	JComboBox<String> box;
	JButton submit;
	
	public USAddress(){
		
		String [] stateList = {"Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };
		label = new JLabel("Select State:");
		box = new JComboBox<String>(stateList);
		countryPanel.setLayout(new GridLayout(6,6));
		submit = new JButton("Submit");
		submit.addActionListener(this);
		address1 = new JLabel("Address line 1:");
		address1Field = new JTextField();
		address2 = new JLabel("Address line 2:");
		address2Field = new JTextField();
		address3 = new JLabel("Address line 3:");
		address3Field = new JTextField();
		zipcode = new JLabel("Zip code:");
		zipcodeField = new JTextField();
		blank = new JLabel();
		
		countryPanel.add(label);
		countryPanel.add(box);
		countryPanel.add(address1);
		countryPanel.add(address1Field);
		countryPanel.add(address2);
		countryPanel.add(address2Field);
		countryPanel.add(address3);
		countryPanel.add(address3Field);
		countryPanel.add(zipcode);
		countryPanel.add(zipcodeField);
		countryPanel.add(blank);
		countryPanel.add(submit);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit){
			String address = address1Field.getText() + " " + address2Field.getText() + " " + address3Field.getText() + " " + box.getSelectedItem() + " " + zipcodeField.getText();
			addresses.add(address);
			System.out.println(addresses);
		}
		
	}
}
