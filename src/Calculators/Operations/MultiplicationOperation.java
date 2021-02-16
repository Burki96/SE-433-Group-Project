package Calculators.Operations;

import Calculators.Windows.CalculatorWindow;

public class MultiplicationOperation extends Operation {
	public void Execute()
	{
		double Result= CalculatorWindow.getFirstNumber() * CalculatorWindow.getSecondNumber();
		CalculatorWindow.PassResult(Result);
	}
}
