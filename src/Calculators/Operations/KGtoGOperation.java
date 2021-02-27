package Calculators.Operations;

import Controllers.UnitConverterController;

public class KGtoGOperation extends Operation
{
	private double number;
	public KGtoGOperation() 
	{
		
		number = 1000.0;
	}
	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() * number;
		converter.PassResult(n);
	}

}
