package Events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.MainMenuController;
import Controllers.CalculatorController;
public class MainMenuCalculatorSwitch implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		MainMenuController.Turnoff();
		CalculatorController.Start();
	}

}
