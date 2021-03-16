package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.GeneralConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class LengthOperation extends Operation
{
	private final static GeneralConversion MtoKm = new GeneralConversion(1/1000,0);
	private final static GeneralConversion Mtocm = new GeneralConversion(100,0);
	private final static GeneralConversion Mtomm = new GeneralConversion(1000,0);
	private final static GeneralConversion MtoMile = new GeneralConversion(1/1609,0);
	private final static GeneralConversion MtoYard = new GeneralConversion(1.094,0);
	private final static GeneralConversion MtoFoot = new GeneralConversion(3.281,0);
	private final static GeneralConversion MtoInch = new GeneralConversion(39.37,0);
	private final static GeneralConversion KmtoM = new GeneralConversion(1000,0);
	private final static GeneralConversion cmtoM = new GeneralConversion(1/100,0);
	private final static GeneralConversion mmtoM = new GeneralConversion(1/1000,0);
	private final static GeneralConversion MiletoM = new GeneralConversion(1609,0);
	private final static GeneralConversion YardtoM = new GeneralConversion(1/1.094,0);
	private final static GeneralConversion FoottoM = new GeneralConversion(1/3.281,0);
	private final static GeneralConversion InchtoM = new GeneralConversion(1/39.37,0);
	
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Meters to Kilometers", MtoKm);
		window.AddToUnitSelection("Meters to Centimeters", Mtocm);
		window.AddToUnitSelection("Meters to Millimeters", Mtomm);
		window.AddToUnitSelection("Meters to Miles", MtoMile);
		window.AddToUnitSelection("Meters to Yards", MtoYard);
		window.AddToUnitSelection("Meters to Feet", MtoFoot);
		window.AddToUnitSelection("Meters to Inches", MtoInch);
		window.AddToUnitSelection("Kilometers to Meters", KmtoM);
		window.AddToUnitSelection("Centimeters to Meters", cmtoM);
		window.AddToUnitSelection("Millimeters to Meters", mmtoM);
		window.AddToUnitSelection("Miles to Meters", MiletoM);
		window.AddToUnitSelection("Yards to Meters", YardtoM);
		window.AddToUnitSelection("Feet to Meters", FoottoM);
		window.AddToUnitSelection("Inches to Meters", InchtoM);
	}

}
