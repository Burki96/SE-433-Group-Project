package Calculators.Operations.MassOperations;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class GToKG extends Operation
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