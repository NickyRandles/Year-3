import java.awt.*;
import java.util.*;

import javax.swing.*;
public class radioChoice extends multiChoice {
    //This derived class creates 
    //vertical grid of checkboxes
    int count;           //number of checkboxes
    JPanel p;             //contained in here
    JRadioButton button;
    ButtonGroup group = new ButtonGroup ();
//--------------------------------------------
    public radioChoice(Vector choices) {
        super(choices);
        count = 0;
        p = new JPanel();
    }
//--------------------------------------------
    public JPanel getUI() {
        String s;
        
        //create a grid layout 1 column by n rows
        p.setLayout(new GridLayout(choices.size(), 1));  
        //and add labeled check boxes to it
        for (int i=0; i< choices.size(); i++) {
            s =(String)choices.elementAt(i);
            p.add(button = new JRadioButton(s));
            group.add(button);
            count++;
        }
        return p;
    }
//--------------------------------------------
    public String[] getSelected() {
    	String[] slist = new String[10];
        slist[0] = button.getSelectedIcon().toString();
        return(slist);
    }
//--------------------------------------------
	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		
	}

}
