package Calculators.Operations;

import Controllers.UnitConverterController;

public class GtoKGOperation extends Operation
{
	private final static double number = 1000.0;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() / number;
		converter.PassResult(n);
	}

}