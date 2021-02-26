package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorController;

public class NumberAction implements ActionListener
{
	int buttonNumber;
	public NumberAction(int n) {
		buttonNumber = n;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String aString = CalculatorController.GetText();
		if(aString.compareTo("0") == 0) 
		{
			CalculatorController.SetText(" ");
		}
		String numberString = CalculatorController.GetText() + CalculatorController.GetButton(buttonNumber).getText();
		CalculatorController.SetText(numberString);
	}
}
