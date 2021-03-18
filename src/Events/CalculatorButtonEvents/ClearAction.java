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
		CalculatorController.setDecimal(false);
		CalculatorController.SetText("0");
		CalculatorController.DoArithmeticAction(this.symbol);
		
	}

}
