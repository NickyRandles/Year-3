import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.*;


public class BritishOilPrice extends JFrame implements Observer, Runnable{

	private double price = 0;
	JPanel panel;
	JLabel label, priceLabel;
	
	public BritishOilPrice(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		label = new JLabel("Price:");
		priceLabel = new JLabel();
		
		panel.add(label);
		panel.add(priceLabel);
		this.add(panel);
		
		this.setTitle("British Oil Price");
		this.setSize(250, 200);
		this.setVisible(true);	
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		priceLabel.setText(decimalFormat.format(price));
		run();
	}

	public void sendNotify(double oilPrice) {
		price = oilPrice;
	}

}
