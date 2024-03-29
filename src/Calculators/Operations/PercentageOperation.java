package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;


public class PercentageOperation extends Operation
{
	public PercentageOperation(BasicCalculator c)
	{
		calculator = c;
	}
	public void Execute()
	{
		double Result= (calculator.GetFirstNumber() * calculator.GetSecondNumber()) / 100.0;
		calculator.PassResult(Result);
	}
}
