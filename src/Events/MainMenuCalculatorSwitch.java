package Events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;
import Calculators.Windows.MainMenu;
public class MainMenuCalculatorSwitch implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		MainMenu.Turnoff();
		CalculatorWindow.Start();
	}

}