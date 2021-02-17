package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;
import Calculators.Windows.MainMenu;

public class CalculatorMainMenuSwitch implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorWindow.Turnoff();
		MainMenu.Start();
		
	}

}
