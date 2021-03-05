package Calculators.Operations.TemperatureConversions;

import Calculators.Operations.Operation;
import Controllers.UnitConverterController;

public class FahToCel extends Operation
{
	private final static double number1 = 32;
	private final static double number2 = 5;
	private final static double number3 = 9;

	@Override
	public void Execute() 
	{
		converter = UnitConverterController.GetConverter();
		double n = (converter.GetFirstNumber() - number1) * number2/number3;
		converter.PassResult(n);
	}

}
