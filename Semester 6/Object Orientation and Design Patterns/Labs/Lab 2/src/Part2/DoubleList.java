package Part2;
import java.util.StringTokenizer;

public class DoubleList extends NumberList {
	
	int size;
	
	DoubleList(String list) {
	
		size = 0;
		StringTokenizer token = new StringTokenizer(list);
		size = token.countTokens();
		
		
		doubleList = new double[size];
		
		
		for(int i = 0; i < size; i++)  {
			doubleList[i] = Double.parseDouble(token.nextToken());
		}
	}

	public Number sum() {
		
	
		double n = 0;
		for(int i = 0; i < size; i++) {
		   n = n + doubleList[i];
		}
		return new Double(n);
	}
	
		
	public void display() {
		System.out.println("Double List");	
		for(int i = 0; i < size; i++){
			System.out.println("[" + i + "] = " + doubleList[i]);
		}
		
		System.out.println("The sum of all of the numbers = " + sum());
		System.out.println();

	}
}


