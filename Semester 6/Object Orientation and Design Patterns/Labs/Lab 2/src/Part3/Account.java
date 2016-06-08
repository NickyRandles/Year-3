package Part3;

public abstract class Account {
	
	protected String [] currentList;
	protected String [] investmentList;
	
	public Account(){
		currentList = null;
		investmentList = null;
	}
	
	public String [] getCurrentList(){
		return currentList;
	}
	
	public String [] getInvestmentList(){
		return investmentList;
	}
	
	public abstract void display();

}
