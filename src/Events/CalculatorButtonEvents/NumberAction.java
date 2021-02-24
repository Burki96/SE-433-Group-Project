package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class NumberAction implements ActionListener
{
	int buttonNumber;
	public NumberAction(int n) {
		buttonNumber = n;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String numberString = CalculatorWindow.GetText() + CalculatorWindow.GetButton(buttonNumber).getText();
		CalculatorWindow.SetText(numberString);
	}
}
