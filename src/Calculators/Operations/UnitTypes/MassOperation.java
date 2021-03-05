package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.MassOperations.GToKG;
import Calculators.Operations.MassOperations.GToOunce;
import Calculators.Operations.MassOperations.GToPound;
import Calculators.Operations.MassOperations.KGToG;
import Calculators.Operations.MassOperations.KGToOunce;
import Calculators.Operations.MassOperations.KGtoPound;
import Calculators.Operations.MassOperations.OunceToG;
import Calculators.Operations.MassOperations.OunceToKG;
import Calculators.Operations.MassOperations.OunceToPound;
import Calculators.Operations.MassOperations.PoundToGram;
import Calculators.Operations.MassOperations.PoundToKG;
import Calculators.Operations.MassOperations.PoundToOunce;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class MassOperation extends Operation
{
	private final static KGToG KGtoG = new KGToG();
	private final static KGToOunce KGtoOunce = new KGToOunce();
	private final static KGtoPound KGtoPound = new KGtoPound();
	private final static GToKG GtoKG = new GToKG();
	private final static GToOunce GtoOunce = new GToOunce();
	private final static GToPound GtoPound = new GToPound();
	private final static PoundToGram PToG = new PoundToGram();
	private final static PoundToKG PToKG = new PoundToKG();
	private final static PoundToOunce PToOunce = new PoundToOunce();
	private final static OunceToG OuncetoG = new OunceToG();
	private final static OunceToKG OuncetoKG = new OunceToKG();
	private final static OunceToPound OuncetoPound = new OunceToPound();
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
