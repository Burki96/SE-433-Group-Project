package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class PlusMinusAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double n = Double.parseDouble(String.valueOf(CalculatorWindow.GetText()));
		n = n * (-1);
		CalculatorWindow.SetText(String.valueOf(n));
		
	}

}
