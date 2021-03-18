package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Operations.DefaultOperation;
import Calculators.Operations.Operation;
import Controllers.CalculatorController;

public class ClearAction implements ActionListener
{
	private Operation symbol;
	
	public ClearAction() 
	{
		symbol = new DefaultOperation(CalculatorController.GetCalculator());
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		CalculatorController.SetText("0");
		CalculatorController.DoArthimeticAction(this.symbol);
		
	}

}
