import java.awt.Color;

import javax.swing.*;


public class Unrecognized extends JPanel implements Chain{

	private Chain nextChain; 
	JLabel label, imageLabel;
	ImageIcon image;
	
	public Unrecognized(){
		label = new JLabel("Unrecognized Score!");
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(label);
		
	}
	
	public void nextChain(Chain newChain) {
		nextChain = newChain;
	}

	public void getImage(String ball) {
		if(imageLabel == null){
			image = new ImageIcon("unrecognized.jpg");
			imageLabel = new JLabel(image);
			this.add(imageLabel);
			this.revalidate();
		}
	}

}
