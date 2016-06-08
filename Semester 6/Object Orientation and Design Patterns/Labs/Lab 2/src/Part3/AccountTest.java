package Part3;

public class AccountTest {
	
	public static void main(String [] args){
		String list1 = "C10001,C10002,C10003";
		String list2 = "I20001,I20002,I20003";
		
		AccountFactory  aFactory = new AccountFactory();
		aFactory.getAccountList(list1).display();
		aFactory.getAccountList(list2).display();
	}
}
