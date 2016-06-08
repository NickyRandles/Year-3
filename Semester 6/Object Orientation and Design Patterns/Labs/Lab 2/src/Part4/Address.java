package Part4;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Address {
	protected String country;
	protected String [] counties;
	protected String [] states;
	public JPanel countryPanel = new JPanel();
	Vector<String> addresses = new Vector<String>();

	public Address(){
		country = null;
		counties = null;
		states = null;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String [] getCounties(){
		return counties;
	}
	
	public String [] getStates(){
		return states;
	}

}
