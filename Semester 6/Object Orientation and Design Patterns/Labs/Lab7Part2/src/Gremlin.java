import javax.swing.ImageIcon;

public class Gremlin {

	private String name;
	
	public Gremlin(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public ImageIcon getImage(){
		return new ImageIcon("gremlin.jpg");
	}
}
