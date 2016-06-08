import java.awt.Color;

import javax.swing.*;


public class Basketball extends JPanel implements Chain{

	private Chain nextChain; 
	JLabel label, imageLabel;
	ImageIcon image;
	
	public Basketball(){
		label = new JLabel("Basketball Score!");
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(label);
		
	}
	
	public void nextChain(Chain newChain) {
		nextChain = newChain;
	}

	public void getImage(String ball) {
		if(ball.equalsIgnoreCase("ball1")){
			if(imageLabel == null){
				image = new ImageIcon("basketball.jpg");
				imageLabel = new JLabel(image);
				this.add(imageLabel);
				this.revalidate();
			}
		}
		else{
			nextChain.getImage(ball);
		}
	}

}
