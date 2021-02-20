package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;


public class PlusOperation extends Operation{
	public PlusOperation(BasicCalculator c)
	{
		calculator = c;
	}
	public void Execute()
	{
		double Result= calculator.GetFirstNumber() + calculator.GetSecondNumber();
		calculator.PassResult(Result);
	}
}
