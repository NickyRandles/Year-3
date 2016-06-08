
public class CircularList {

	public Node list;
	public int numUsers;
	
	public CircularList()
	{
		list = null;
		numUsers = 0;
	}
	
	public boolean isEmpty()
	{
		return numUsers == 0;
	}
	
	public int size()
	{
		return numUsers;
	}
	
	private Node find(int index)
	{
		Node curr = list.getNext(); 
		for (int skip = 1; skip < index; skip++)
		{
		  curr = curr.getNext();
		} 
		return curr;
	 } 
	  
	public Object get(int index) throws ListIndexOutOfBoundsException
	{
		if (index >= 1 && index <= numUsers)
		{
			Node curr = find(index);
			Object dataItem = curr.getUser();
			return dataItem;
		}
	    else
	    {
	    	throw new ListIndexOutOfBoundsException("List index out of bounds exception on get method");
	    } 
	} 

	
	public void add(int index, String user) throws ListIndexOutOfBoundsException
	{
		if(index >= 1 && index <= numUsers+1)
		{
			if (index == 1)
			{
				if (list == null) 
				{
					Node newNode = new Node(user, null);
					list = newNode;
					list.setNext(newNode);
				}
				else
				{
					Node newNode = new Node(user, list.getNext());
					list.setNext(newNode);
				}
			}
			else
			{
				Node prev = find(index-1);
				Node newNode = new Node(user, prev.getNext());
				prev.setNext(newNode);
				if(index == numUsers+1) 
					list = newNode;
			} 

	      numUsers++;
	    }
		
	    else
	    {
	    	throw new ListIndexOutOfBoundsException("List index out of bounds exception on add method");
	    } 

	  }  
	
	  public void remove(int index)
	  {
	    if (index >= 1 && index <= numUsers)
	    {
	      if (index == 1)
	      {
	        Node first = list.getNext();
	        list.setNext(first.getNext());

	        if (numUsers == 1) 
	             list = null;
	      }
	      else
	      {
	        Node prev = find(index-1);
	        Node curr = prev.getNext();
	        prev.setNext(curr.getNext());
	        if (index == numUsers) 
	             list = prev;
	      } 
	      numUsers--;
	    }
	  
	  }  
	
	public void display()
	{
		for(int i = 1; i <= numUsers; i++)
		{
			 System.out.println("USER: " + this.get(i) + " Logged On");	
		}
	}
	
	public void displayUser(int index)
	{
		for(int i = 1; i <= numUsers; i++)
		{
			if(index == i)
			{
				System.out.println("USER: " + this.get(i) + " Logged Off");	
			}
		}
	}
	



	
	
}
