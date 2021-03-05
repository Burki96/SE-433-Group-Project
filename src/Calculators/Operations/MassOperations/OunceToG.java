package Calculators.Operations.MassOperations;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class OunceToG extends Operation
{
	private final static double number = 28.35;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() * number;
		converter.PassResult(n);
	}



}
