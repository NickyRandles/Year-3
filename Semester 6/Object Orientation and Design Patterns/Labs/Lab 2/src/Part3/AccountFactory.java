package Part3;

public class AccountFactory {
	
	public Account getAccountList(String list){
		
		if(list.charAt(0) == 'C'){
			return new CurrentAccount(list);
		}
		
		else if(list.charAt(0) == 'I'){
			return new InvestmentAccount(list);
		}
		
		else{
			System.out.println("Account is not a current or investment account");
			return null;
		}
	}

}
