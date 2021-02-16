package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculators.Windows.CalculatorWindow;

public class ArithmeticAction implements ActionListener{
	private String symbol;
	
	public ArithmeticAction(String s) 
	{
		this.symbol = s;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorWindow.DoArthimeticAction(this.symbol);
	}

}
