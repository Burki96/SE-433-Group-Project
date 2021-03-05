package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.MassOperations.GtoKG;
import Calculators.Operations.MassOperations.KGtoG;
import Calculators.Operations.MassOperations.PoundToGram;
import Calculators.Operations.MassOperations.PoundToKG;
import Calculators.Operations.MassOperations.PoundToOunce;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class MassOperation extends Operation
{
	private final static KGtoG KGtoG = new KGtoG();
	private final static GtoKG GtoKG = new GtoKG();
	private final static PoundToGram PToG = new PoundToGram();
	private final static PoundToKG PToKG = new PoundToKG();
	private final static PoundToOunce PToOunce = new PoundToOunce();
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("KiloGram to Gram", KGtoG);
		window.AddToUnitSelection("Gram to KiloGram", GtoKG);
		window.AddToUnitSelection("Pound to Gram", PToG);
		window.AddToUnitSelection("Pound to KiloGram", PToKG);
		window.AddToUnitSelection("Pound to Ounce", PToOunce);
	}

}
