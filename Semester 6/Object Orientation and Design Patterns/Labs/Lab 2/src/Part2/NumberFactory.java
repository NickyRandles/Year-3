package Part2;
public class NumberFactory {


public NumberList getNumberList(String list){

	int i = list.indexOf(".");
	int j = list.indexOf(",");
	
	if(i != -1){
		
		return new DoubleList(list);
	}
	else if(j != -1){
		
		return new AlphaCharacterList(list);
	}
	else{
		
		return new IntList(list);
	}
}
}