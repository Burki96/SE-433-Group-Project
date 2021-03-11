package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.Time.DivisionConversion;
import Calculators.Operations.Time.MultiplyConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class TimeOperation extends Operation
{
	private final static DivisionConversion sTom = new DivisionConversion(60);
	private final static DivisionConversion sToh = new DivisionConversion(3600);
	private final static MultiplyConversion mTos = new MultiplyConversion(60);
	private final static DivisionConversion mToh = new DivisionConversion(60);
	private final static DivisionConversion mTod = new DivisionConversion(1440);
	private final static MultiplyConversion hTos = new MultiplyConversion(3600);
	private final static MultiplyConversion hTom = new MultiplyConversion(60);
	private final static DivisionConversion hTod = new DivisionConversion(24);
	private final static MultiplyConversion dTos = new MultiplyConversion(86400);
	private final static MultiplyConversion dTom = new MultiplyConversion(1440);
	private final static MultiplyConversion dToh = new MultiplyConversion(24);
	private final static DivisionConversion dTow = new DivisionConversion(7);
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Seconds To Minutes", sTom);
		window.AddToUnitSelection("Seconds To hours", sToh);
		window.AddToUnitSelection("Minutes To Seconds", mTos);
		window.AddToUnitSelection("Minute To Hours", mToh);
		window.AddToUnitSelection("Minutes To Days", mTod);
		window.AddToUnitSelection("Hours To Seconds", hTos);
		window.AddToUnitSelection("Hours To Minutes", hTom);
		window.AddToUnitSelection("Hours To Days", hTod);
		window.AddToUnitSelection("Days To Seconds", dTos);
		window.AddToUnitSelection("Days To Minutes", dTom);
		window.AddToUnitSelection("Days To Hours", dToh);
		window.AddToUnitSelection("Days To Weeks", dTow);
	}
}
