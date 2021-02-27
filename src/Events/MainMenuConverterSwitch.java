package Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.UnitConverterWindow;
import Controllers.MainMenuController;
import Controllers.UnitConverterController;

public class MainMenuConverterSwitch implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		MainMenuController.Turnoff();
		UnitConverterController.Start();
		//CalculatorController.Start();
	}
}
