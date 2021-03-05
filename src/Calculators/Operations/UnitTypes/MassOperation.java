package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.MassOperations.GToKG;
import Calculators.Operations.MassOperations.KGToG;
import Calculators.Operations.MassOperations.PoundToGram;
import Calculators.Operations.MassOperations.PoundToKG;
import Calculators.Operations.MassOperations.PoundToOunce;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class MassOperation extends Operation
{
	private final static KGToG KGtoG = new KGToG();
	private final static GToKG GtoKG = new GToKG();
	private final static PoundToGram PToG = new PoundToGram();
	private final static PoundToKG PToKG = new PoundToKG();
	private final static PoundToOunce PToOunce = new PoundToOunce();
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Kilogram to Gram", KGtoG);
		window.AddToUnitSelection("Gram to Kilogram", GtoKG);
		window.AddToUnitSelection("Pound to Gram", PToG);
		window.AddToUnitSelection("Pound to Kilogram", PToKG);
		window.AddToUnitSelection("Pound to Ounce", PToOunce);
	}

}
