package Calculators.Operations.TemperatureConversions;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class CelToFah extends Operation
{
	private final static double number1 = 32;
	private final static double number2 = 9/5;
	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = (converter.GetFirstNumber() * number2) + number1;
		converter.PassResult(n);
	}

}
