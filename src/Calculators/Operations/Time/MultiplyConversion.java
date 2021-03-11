package Calculators.Operations.Time;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class MultiplyConversion extends Operation
{
	private double number;
	public MultiplyConversion(double number) 
	{
		this.number = number;
	}
	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() * number;
		converter.PassResult(n);
	}

}
