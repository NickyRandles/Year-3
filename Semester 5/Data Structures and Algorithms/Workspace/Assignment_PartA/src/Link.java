
public class Link {
	
	public char bracket;
	
	public Link next;
	
	public Link(char bracket)
	{
		this.bracket = bracket;
	}
	
	public void display()
	{
		System.out.println(bracket);
	}
	
	public String toString()
	{
		return bracket + "";
	}


	

}
