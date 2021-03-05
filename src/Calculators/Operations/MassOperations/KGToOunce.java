package Calculators.Operations.MassOperations;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class KGToOunce extends Operation
{
	private final static double number = 35.274;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() * number;
		converter.PassResult(n);
	}


}
