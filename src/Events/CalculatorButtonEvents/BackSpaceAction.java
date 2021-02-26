package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorController;

public class BackSpaceAction implements ActionListener
{
	private StringBuilder BackSpaceSpring;
	public BackSpaceAction() {
		BackSpaceSpring = new StringBuilder();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String backString = null;
		String currentString = CalculatorController.GetText();

		if(currentString.length() > 0)
		{
			BackSpaceSpring.append(currentString);
			BackSpaceSpring.deleteCharAt(currentString.length() - 1);
			backString = BackSpaceSpring.toString();
			CalculatorController.SetText(backString);
			BackSpaceSpring.delete(0, BackSpaceSpring.length());
			if(backString.isBlank()) 
			{
				CalculatorController.SetText("0");
			} 
		}

	}

}
