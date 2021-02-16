package Calculators.Operations;

import Calculators.Windows.CalculatorWindow;

public class PlusOperation extends Operation{
	public void Execute()
	{
		double Result= CalculatorWindow.getFirstNumber() + CalculatorWindow.getSecondNumber();
		CalculatorWindow.PassResult(Result);
	}
}
