import zoo.lizard;


public class LizardAdapter extends Animal{

	lizard liz;
	public LizardAdapter(int weight){
		liz = new lizard(weight);
	}
	
	public void feed(){
		liz.feedlizard();
	}
}
