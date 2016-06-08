public class Node
{
  private String user;
  private Node next;

  public Node(String newUser)
  {
	user = newUser;
    next = null;
  } // end constructor

  public Node(String newUser, Node nextNode)
  {
	user = newUser;
    next = nextNode;
  } // end constructor

  public void setUser(String newUser)
  {
	user = newUser;
  } // end setItem
  
  public String getUser()
  {
    return user;
  } // end getItem

  public void setNext(Node nextNode)
  {
    next = nextNode;
  } // end setNext
  
  public Node getNext()
  {
    return next;
  } // end getNext

}