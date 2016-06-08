package Part3;

import java.util.*;

public class CurrentAccount extends Account{

	int size = 0;
	
	public CurrentAccount(String list){
		StringTokenizer token = new StringTokenizer(list, "\\,");
		size = token.countTokens();
		currentList = new String[size];
		
		for(int i = 0; i < size; i++){
			currentList[i] = token.nextToken();
		}
		
	}
	
	public void display() {
		System.out.println("Current Accounts:");
		for(int i = 0; i < size; i++){
			System.out.println(currentList[i]);
		}
		System.out.println();
	}

}
