package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Operations.Operation;
import Controllers.CalculatorController;

public class ArithmeticAction implements ActionListener{
	private Operation symbol;
	
	public ArithmeticAction(Operation s) 
	{
		this.symbol = s;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorController.DoArthimeticAction(this.symbol);
	}

}
