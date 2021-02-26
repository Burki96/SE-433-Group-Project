package Events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.CalculatorController;
import Controllers.MainMenuController;
public class MainMenuCalculatorSwitch implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		MainMenuController.Turnoff();
		CalculatorController.Start();
	}

}
