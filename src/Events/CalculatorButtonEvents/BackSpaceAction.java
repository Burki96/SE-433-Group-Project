package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class BackSpaceAction implements ActionListener
{
	private StringBuilder BackSpaceSpring;
	public BackSpaceAction() {
		BackSpaceSpring = new StringBuilder();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String backString = null;
		String currentString = CalculatorWindow.GetText();
		if(currentString.length() > 0)
		{
			BackSpaceSpring.append(currentString);
			BackSpaceSpring.deleteCharAt(currentString.length() - 1);
			backString = BackSpaceSpring.toString();
			CalculatorWindow.SetText(backString);
			BackSpaceSpring.delete(0, BackSpaceSpring.length());
		}
		
	}

}
