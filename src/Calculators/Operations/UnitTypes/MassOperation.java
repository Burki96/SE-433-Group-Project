package Calculators.Operations.UnitTypes;

import Calculators.Operations.GtoKGOperation;
import Calculators.Operations.KGtoGOperation;
import Calculators.Operations.Operation;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class MassOperation extends Operation
{
	private final static KGtoGOperation KGtoG = new KGtoGOperation();
	private final static GtoKGOperation GtoKG = new GtoKGOperation();
	@Override
	public void Execute() 
	{
		// TODO Auto-generated method stub
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("KG to G", KGtoG);
		window.AddToUnitSelection("G to KG", GtoKG);
	}

}
