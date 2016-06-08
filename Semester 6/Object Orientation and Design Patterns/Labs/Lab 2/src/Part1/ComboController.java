package Part1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboController {
	
	HobbyList model;
	ComboView view;

	public ComboController(HobbyList model, ComboView view){
		this.model = model;
		this.view = view;

		
		model.addHobby("football");
		model.addHobby("rugby");
		model.addHobby("gaa");
		model.addHobby("mma");
		model.addHobby("chess");

		this.view.setList(this.model.getHobby());
		
		
		this.view.buttonListener(view.add, new ViewListener());
		this.view.buttonListener(view.refresh, new ViewListener());

	}

	class ViewListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==view.add){
				String newHobby = view.getNewHobby();
				model.addHobby(newHobby);
			}
			else{
				view.update(model.getHobby());
			}
		}
		
	}
}


