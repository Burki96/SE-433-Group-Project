package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class EightButtonAction implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String numberString = CalculatorWindow.GetText() + CalculatorWindow.GetButton(8).getText();
		CalculatorWindow.SetText(numberString);
	}
}
