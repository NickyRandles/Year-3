
public class Dog extends Pet{
	
	private String commands;
	
	public Dog(String n, int a, String c){
		super(n, a);
		commands = c;
	}
	
	public String getCommands()
	{
		return commands;
	}
	
	public void feedPet(){
		System.out.println(name + " is a dog and his favourite food is "+ favFood);
	}
	
}
