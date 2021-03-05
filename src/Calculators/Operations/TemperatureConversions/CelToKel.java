package Calculators.Operations.TemperatureConversions;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class CelToKel extends Operation
{
	private final static double number = 273.15;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = converter.GetFirstNumber() + number;
		converter.PassResult(n);
	}

}
