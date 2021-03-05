package Calculators.Operations;

import Calculators.BasicCalculator.BasicCalculator;

public class DefaultOperation extends Operation
{
	public DefaultOperation(BasicCalculator c) 
	{
		this.calculator = c;
	}
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		double Result= calculator.GetFirstNumber();
		calculator.PassResult(Result);
		
	}

}
