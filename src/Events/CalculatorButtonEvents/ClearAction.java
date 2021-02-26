package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.CalculatorController;

public class ClearAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		CalculatorController.SetText("0");
		
	}

}
