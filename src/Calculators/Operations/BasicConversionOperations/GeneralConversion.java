package Calculators.Operations.BasicConversionOperations;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class GeneralConversion extends Operation
{
	private double factor;
	private double offset;
	
	public GeneralConversion(double factor, double offset) 
	{
		this.factor = factor;
		this.offset = offset;
	}
	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = (this.factor * converter.GetFirstNumber()) + this.offset;
		converter.PassResult(n);
	}

}