import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.*;


public class OilPriceIndicator extends JFrame implements Subject, Runnable{

	Vector<Observer> observers = new Vector<Observer>();
	double price = 1.30;
	JPanel panel;
	JLabel label, priceLabel;
	double random;
	
	public OilPriceIndicator(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		label = new JLabel("Price:");
		priceLabel = new JLabel();
		
		panel.add(label);
		panel.add(priceLabel);
		this.add(panel);
		
		this.setTitle("Oil Price");
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		random = (double)(Math.random() * (.06)) - .03;
		price = price + random;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		priceLabel.setText(decimalFormat.format(price));
		for(int i = 0; i < observers.size(); i++){
			observers.get(i).sendNotify(price);
		}
		run();
	}

	public void registerInterest(Observer observer) {
		observers.add(observer);
		observer.sendNotify(price);
	}

}
