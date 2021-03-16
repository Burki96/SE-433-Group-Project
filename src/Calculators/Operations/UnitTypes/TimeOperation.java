package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.DivisionConversion;
import Calculators.Operations.BasicConversionOperations.GeneralConversion;
import Calculators.Operations.BasicConversionOperations.MultiplyConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class TimeOperation extends Operation
{
	private final static DivisionConversion sTom = new DivisionConversion(60);
	private final static DivisionConversion sToh = new DivisionConversion(3600);
	private final static GeneralConversion sTod = new GeneralConversion(0.000011574074074,0);
	private final static GeneralConversion sTow = new GeneralConversion(0.000001653439153,0);
	private final static MultiplyConversion mTos = new MultiplyConversion(60);
	private final static DivisionConversion mToh = new DivisionConversion(60);
	private final static DivisionConversion mTod = new DivisionConversion(1440);
	private final static GeneralConversion mTow = new GeneralConversion(0.000099206349206,0);
	private final static MultiplyConversion hTos = new MultiplyConversion(3600);
	private final static MultiplyConversion hTom = new MultiplyConversion(60);
	private final static DivisionConversion hTod = new DivisionConversion(24);
	private final static GeneralConversion hTow = new GeneralConversion(0.005952380952381,0);
	private final static MultiplyConversion dTos = new MultiplyConversion(86400);
	private final static MultiplyConversion dTom = new MultiplyConversion(1440);
	private final static MultiplyConversion dToh = new MultiplyConversion(24);
	private final static DivisionConversion dTow = new DivisionConversion(7);
	private final static MultiplyConversion wTos = new MultiplyConversion(604800);
	private final static MultiplyConversion wTom = new MultiplyConversion(10080);
	private final static MultiplyConversion wToh = new MultiplyConversion(168);
	private final static MultiplyConversion wTod = new MultiplyConversion(7);
	

	
	
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Seconds To Minutes", sTom);
		window.AddToUnitSelection("Seconds To Hours", sToh);
		window.AddToUnitSelection("Seconds To Days", sTod);
		window.AddToUnitSelection("Seconds To Weeks", sTow);
		window.AddToUnitSelection("Minutes To Seconds", mTos);
		window.AddToUnitSelection("Minutes To Hours", mToh);
		window.AddToUnitSelection("Minutes To Days", mTod);
		window.AddToUnitSelection("Minutes To Weeks", mTow);
		window.AddToUnitSelection("Hours To Seconds", hTos);
		window.AddToUnitSelection("Hours To Minutes", hTom);
		window.AddToUnitSelection("Hours To Days", hTod);
		window.AddToUnitSelection("Hours To Weeks", hTow);
		window.AddToUnitSelection("Days To Seconds", dTos);
		window.AddToUnitSelection("Days To Minutes", dTom);
		window.AddToUnitSelection("Days To Hours", dToh);
		window.AddToUnitSelection("Days To Weeks", dTow);
		window.AddToUnitSelection("Weeks To Seconds", wTos);
		window.AddToUnitSelection("Weeks To Minutes", wTom);
		window.AddToUnitSelection("Weeks To Hours", wToh);
		window.AddToUnitSelection("Weeks To Days", wTod);
	}
}
