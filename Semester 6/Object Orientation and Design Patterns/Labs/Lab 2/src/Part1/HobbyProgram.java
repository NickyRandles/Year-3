package Part1;

public class HobbyProgram {
	
	public static void main(String [] args){
		HobbyList model1 = new HobbyList();
		HobbyList model2 = new HobbyList();
		ListView list = new ListView();
		ComboView combo = new ComboView();

		new ListController(model1, list);
		new ComboController(model2, combo);
	}
}
