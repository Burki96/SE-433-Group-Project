package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;


public class MultiplicationOperation extends Operation {
	public MultiplicationOperation(BasicCalculator c)
	{
		calculator = c;
	}
	public void Execute()
	{
		double Result= calculator.GetFirstNumber() * calculator.GetSecondNumber();
		calculator.PassResult(Result);
	}
}
