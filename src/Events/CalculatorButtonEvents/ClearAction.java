package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class ClearAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		CalculatorWindow.SetText(" ");
		
	}

}
