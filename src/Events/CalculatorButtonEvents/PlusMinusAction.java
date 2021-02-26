package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.CalculatorController;


public class PlusMinusAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double n = Double.parseDouble(String.valueOf(CalculatorController.GetText()));
		n = n * (-1);
		CalculatorController.SetText(String.valueOf(n));
		
	}

}
