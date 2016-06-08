import zoo.alligator;

public class AlligatorAdapter extends Animal{
	alligator gator;
	
	public AlligatorAdapter(int weight){
		gator = new alligator(weight);
	}
	
	public void feed() {
		gator.feedalligator();
		
	}

}
