package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;

public class DivisionOperation extends Operation{
	public DivisionOperation(BasicCalculator c) {
		calculator = c;
	}
	public void Execute()
	{
		double Result= calculator.GetFirstNumber() / calculator.GetSecondNumber();
		calculator.PassResult(Result);
	}
}
