package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.TemperatureConversions.CelToFah;
import Calculators.Operations.TemperatureConversions.CelToKel;
import Calculators.Operations.TemperatureConversions.FahToCel;
import Calculators.Operations.TemperatureConversions.FahToKel;
import Calculators.Operations.TemperatureConversions.KelToCel;
import Calculators.Operations.TemperatureConversions.KelToFah;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class TemperatureOperation extends Operation
{
	private final static FahToCel fToc = new FahToCel();
	private final static FahToKel fTok = new FahToKel();
	private final static KelToFah kToF = new KelToFah();
	private final static KelToCel kToC = new KelToCel();
	private final static CelToFah cTof = new CelToFah();
	private final static CelToKel cTok = new CelToKel();

	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Fahrenheit To Kelvin", fTok);
		window.AddToUnitSelection("Fahrenheit To Celsius", fToc);
		window.AddToUnitSelection("Kelvin to Celsius", kToC);
		window.AddToUnitSelection("Kelvin to Fahrenheit", kToF);
		window.AddToUnitSelection("Celsius to Fahrenheit", cTof);
		window.AddToUnitSelection("Celsius to Kelvin", cTok);
		
		
	}

}
