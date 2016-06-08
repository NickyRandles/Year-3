import java.awt.Color;

import javax.swing.*;


public class Football extends JPanel implements Chain{

	private Chain nextChain; 
	JLabel label, imageLabel;
	ImageIcon image;
	
	public Football(){
		label = new JLabel("Soccer Score!");
		this.setBorder(BorderFactory.createLineBorder(Color.black));	
		this.add(label);
		
	}
	
	public void nextChain(Chain newChain) {
		nextChain = newChain;
	}

	public void getImage(String ball) {
		if(ball.equalsIgnoreCase("ball3")){
			if(imageLabel == null){
				image = new ImageIcon("football.jpg");
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
