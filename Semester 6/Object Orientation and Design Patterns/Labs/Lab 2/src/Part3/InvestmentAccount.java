package Part3;

import java.util.*;

public class InvestmentAccount extends Account{

	int size = 0;
	
	public InvestmentAccount(String list){
		StringTokenizer token = new StringTokenizer(list, "\\,");
		size = token.countTokens();
		investmentList = new String[size];
		
		for(int i = 0; i < size; i++){
			investmentList[i] = token.nextToken();
		}
	}
	
	public void display() {
		System.out.println("Investment Accounts");
		for(int i = 0; i < size; i++){
			System.out.println(investmentList[i]);
		}
		System.out.println();
	}

}
