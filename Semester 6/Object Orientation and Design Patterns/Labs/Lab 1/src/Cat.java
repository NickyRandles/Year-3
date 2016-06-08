
public class Cat extends Pet{
	
	private String commands;
	
	public Cat(String n, int a, String c){
		super(n, a);
		commands = c;
	}
	
	public String getCommands()
	{
		return commands;
	}
	
	public void feedPet(){
		
		System.out.println(this.name + " is a cat and her favourite food is "+ favFood);
		
	}

}
