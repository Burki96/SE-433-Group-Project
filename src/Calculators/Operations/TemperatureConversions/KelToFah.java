package Calculators.Operations.TemperatureConversions;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class KelToFah extends Operation
{
	private final static double number1 = 32;
	private final static double number2 = 9/5;
	private final static double number3 = 273.15;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = (converter.GetFirstNumber() - number3) * number2 + number1;
		converter.PassResult(n);
	}
}
