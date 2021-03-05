package Calculators.Operations.TemperatureConversions;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class FahToKel extends Operation 
{
	private final static double number1 = 32;
	private final static double number2 = 5;
	private final static double number4 = 9;
	private final static double number3 = 273.15;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = (converter.GetFirstNumber() - number1) * number2/number4 + number3;
		converter.PassResult(n);
	}
}
