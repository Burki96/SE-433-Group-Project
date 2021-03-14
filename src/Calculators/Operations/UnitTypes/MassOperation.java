package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.DivisionConversion;
import Calculators.Operations.BasicConversionOperations.MultiplyConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class MassOperation extends Operation
{
	private final static MultiplyConversion KGtoG = new MultiplyConversion(1000);
	private final static MultiplyConversion KGtoOunce = new MultiplyConversion(35.274);
	private final static MultiplyConversion KGtoPound = new MultiplyConversion(2.205);
	private final static DivisionConversion GtoKG = new DivisionConversion(1000);
	private final static DivisionConversion GtoOunce = new DivisionConversion(28.3495);
	private final static DivisionConversion GtoPound = new DivisionConversion(454);
	private final static MultiplyConversion PToG = new MultiplyConversion(454);
	private final static DivisionConversion PToKG = new DivisionConversion(2.205);
	private final static MultiplyConversion PToOunce = new MultiplyConversion(16);
	private final static MultiplyConversion OuncetoG = new MultiplyConversion(28.3495);
	private final static DivisionConversion OuncetoKG = new DivisionConversion(35.274);
	private final static DivisionConversion OuncetoPound = new DivisionConversion(16);
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Kilogram to Gram", KGtoG);
		window.AddToUnitSelection("Kilogram to Pound", KGtoPound);
		window.AddToUnitSelection("Kilogram to Ounce", KGtoOunce);
		window.AddToUnitSelection("Gram to Kilogram", GtoKG);
		window.AddToUnitSelection("Gram to Ounce", GtoOunce);
		window.AddToUnitSelection("Gram to Pound", GtoPound);
		window.AddToUnitSelection("Pound to Gram", PToG);
		window.AddToUnitSelection("Pound to Kilogram", PToKG);
		window.AddToUnitSelection("Pound to Ounce", PToOunce);
		window.AddToUnitSelection("Ounce to Gram", OuncetoG);
		window.AddToUnitSelection("Ounce to Kilogram", OuncetoKG);
		window.AddToUnitSelection("Ounce to Pound", OuncetoPound);
	}

}
