package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.CalculatorController;


public class PeriodAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String currentString = CalculatorController.GetText();
	
		if(! CalculatorController.getDecimal() ) {
			CalculatorController.setDecimal(true);
			if(currentString.equals(""))
			{
				CalculatorController.SetText("0");
				 
			}
			CalculatorController.SetText(CalculatorController.GetText() + ".");
		}
		


	}

}
