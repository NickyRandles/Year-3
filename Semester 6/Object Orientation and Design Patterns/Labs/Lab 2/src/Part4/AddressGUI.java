package Part4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressGUI extends JFrame implements ActionListener{

	Address Ireland, USA;
	JDesktopPane desktop;
	JInternalFrame inputFrame, addressFrame;
	JMenuBar mb;
	JMenu fileMenu;
	JMenuItem addressItem;
	JPanel panel, inputPanel, addressPanel;
	JLabel question01, question02, question03, header;
	String [] country = {"Select Country", "Ireland", "USA"};
	JComboBox<String> countryBox;
	
	public AddressGUI(){
		
		desktop = new JDesktopPane();
		setContentPane(desktop);
		mb = new JMenuBar();
		fileMenu = new JMenu("File");
		addressItem = new JMenuItem("Addresses");
		addressItem.addActionListener(this);
		setJMenuBar(mb);
		mb.add(fileMenu);
		fileMenu.add(addressItem);
		
		inputFrame();
		addressFrame();
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(inputPanel, BorderLayout.NORTH);
		inputFrame.add(panel);
		
		setSize(800,400);
		setVisible(true);
	}

	public void inputFrame(){
		inputFrame = new JInternalFrame();
		inputFrame.setTitle("Enter details");
		inputPanel = new JPanel();
		
		question01 = new JLabel("Where are you from?");
		inputPanel.add(question01);
		
		countryBox = new JComboBox<String>(country);
		countryBox.addActionListener(this);
		inputPanel.add(countryBox);
		
		inputFrame.setSize(385, 340);
		inputFrame.setVisible(true);
		desktop.add(inputFrame);
		
	}
	
	public void addressFrame(){
		addressFrame = new JInternalFrame();
		addressFrame.setTitle("Addresses");
		Address address = new Address();
		int size = address.addresses.size();
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.removeAllElements();
		for(int i = 0; i < size; i++){
			model.addElement(address.addresses.elementAt(i));
		}
		JList<String> vecBox = new JList<String>(model);
		addressPanel = new JPanel();
		
		addressPanel.add(vecBox);
		addressFrame.add(addressPanel);		
		addressFrame.setSize(385, 340);
		addressFrame.setLocation(400, 0);
		desktop.add(addressFrame);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addressItem){
			addressFrame.setVisible(true);
			
		}
		else if(countryBox.getSelectedItem().equals("Ireland")){
			Ireland = new IrelandAddress();
			panel.add(Ireland.countryPanel, BorderLayout.CENTER);
			panel.revalidate();
			panel.repaint();
		}
		else if(countryBox.getSelectedItem().equals("USA")){
			USA = new USAddress();
			panel.add(USA.countryPanel, BorderLayout.CENTER);
			panel.revalidate();
			panel.repaint();
		}
	}
	
}

