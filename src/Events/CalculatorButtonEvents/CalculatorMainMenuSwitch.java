package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.MainMenuController;
import Controllers.CalculatorController;

public class CalculatorMainMenuSwitch implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorController.Turnoff();
		MainMenuController.Start();
		
	}

}
