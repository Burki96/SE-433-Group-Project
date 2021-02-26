package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.CalculatorController;
import Controllers.MainMenuController;

public class CalculatorMainMenuSwitch implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorController.Turnoff();
		MainMenuController.Start();
		
	}

}
