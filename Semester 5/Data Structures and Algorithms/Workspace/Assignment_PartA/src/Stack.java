public class Stack
{
	
	public Link firstLink;
	int top = 0;
	
	Stack()
	{
		firstLink = null;
	}

	public boolean isEmpty()
	{
		return(firstLink == null);
	}

	public void push(char bracket)
	{
		Link newLink = new Link(bracket);
			  
		newLink.next = firstLink;
			  
		firstLink = newLink;
			  
		top++;
	}

	public Link pop() throws StackException
	{
	
		Link linkRef = firstLink;
		  
		if(!isEmpty())
		{
			firstLink = firstLink.next;
		}
		  
		else
		{
			throw new StackException("Stack Exception on pop: Stack Empty");
		}
		return linkRef;
	}
	  
  	public void popAll()
	{
		for(int i = top; i >= 0; i--)
		{
			pop();
		}
	}
  	
	public Link peek() throws StackException
	{
		Link link = firstLink;
	  
		if (!isEmpty())
		{
			return link;    
		}
		else
		{
			throw new StackException("Stack Exception on peek: Stack Empty");
		}  
	}
	      
  	public void display()
  	{
  		Link theLink = firstLink;
  		
  		while(theLink != null)
  		{
			theLink.display();  
			System.out.println("Next link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
  		}
  	}
  	

}  