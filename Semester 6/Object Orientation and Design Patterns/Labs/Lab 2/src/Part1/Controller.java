package Part1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Controller {
	
	HobbyList model;
	ListView view;

	public Controller(HobbyList model, ListView view){
		this.model = model;
		this.view = view;

		
		model.addHobby("football");
		model.addHobby("rugby");
		model.addHobby("gaa");
		model.addHobby("mma");
		model.addHobby("chess");

		view.setList(this.model.getHobby());
		
		
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


