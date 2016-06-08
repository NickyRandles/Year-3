package Part4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IrelandAddress extends Address implements ActionListener{

	JLabel label, address1, address2, address3, blank;
	JTextField address1Field, address2Field, address3Field;
	JComboBox<String> box;
	JButton submit;
	
	public IrelandAddress(){
		String [] countiesList = {"Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Derry", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow"};
		countryPanel.setLayout(new GridLayout(5,5));
		submit = new JButton("Submit");
		submit.addActionListener(this);
		label = new JLabel("Select County:");
		box = new JComboBox<String>(countiesList);
		address1 = new JLabel("Address line 1:");
		address1Field = new JTextField();
		address2 = new JLabel("Address line 2:");
		address2Field = new JTextField();
		address3 = new JLabel("Address line 3:");
		address3Field = new JTextField();
		blank = new JLabel();
		countryPanel.add(label);
		countryPanel.add(box);
		countryPanel.add(address1);
		countryPanel.add(address1Field);
		countryPanel.add(address2);
		countryPanel.add(address2Field);
		countryPanel.add(address3);
		countryPanel.add(address3Field);
		countryPanel.add(blank);
		countryPanel.add(submit);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit){
			String address = address1Field.getText() + " " + address2Field.getText() + " " + address3Field.getText() + " " + box.getSelectedItem();
			addresses.add(address);
			System.out.println(addresses);
		}
		
	}
}
