package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;

public class MinusOperation extends Operation
{
	public MinusOperation(BasicCalculator c)
	{
		calculator = c;
	}
	public void Execute()
	{
		double Result= calculator.GetFirstNumber() - calculator.GetSecondNumber();
		calculator.PassResult(Result);
	}
}
