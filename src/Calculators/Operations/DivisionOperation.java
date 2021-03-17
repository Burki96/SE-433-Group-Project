package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;

public class DivisionOperation extends Operation{
	public DivisionOperation(BasicCalculator c) {
		calculator = c;
	}
	public void Execute()
	{
		double Result= 0;
		double fNumber = calculator.GetFirstNumber();
		double sNumber = calculator.GetSecondNumber(); 
		if (sNumber == 0)
			throw new Exceptions.DivideByZeroException();
		else {
			Result = fNumber/sNumber;
			calculator.PassResult(Result);
		}
	}
}
