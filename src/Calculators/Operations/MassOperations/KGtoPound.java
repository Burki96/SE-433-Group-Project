package Calculators.Operations.MassOperations;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class KGtoPound extends Operation
{
	private final static double number = 2.205;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() * number;
		converter.PassResult(n);
	}


}
