package Part2;
import java.util.StringTokenizer;

public class AlphaCharacterList extends NumberList  {
	
	int size;
	
	AlphaCharacterList(String list)  {
		
		size = 0;
		StringTokenizer token = new StringTokenizer(list, "\\,");
		size = token.countTokens();
	
		charList = new String[size];
				
		
		for(int i = 0; i < size; i++)  {
			charList[i] = token.nextToken();
		}
	}
	
	public  Number sum(){
		return null;
	}

	public void display()
	{
		System.out.println("Character List");
		for(int i = 0; i < size; i++){
			System.out.println("[" + i + "] = " + charList[i]);
		}
		System.out.println();
	}
}


