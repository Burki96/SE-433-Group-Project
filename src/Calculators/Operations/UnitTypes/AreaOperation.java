package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.GeneralConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class AreaOperation extends Operation {

	private final static GeneralConversion SquaremileToSquarefoot = new GeneralConversion( 2.788e-7, 0);
	private final static GeneralConversion SquareinchToSquarefoot = new GeneralConversion( 1.0/144, 0);
	private final static GeneralConversion HectareToSquarefoot = new GeneralConversion( 107639, 0);
	private final static GeneralConversion SquareyardToSquarefoot = new GeneralConversion( 9, 0);
	private final static GeneralConversion SquaremeterToSquarefoot = new GeneralConversion( 10.764, 0);
	private final static GeneralConversion AcreToSquarefoot = new GeneralConversion( 43560, 0);
	
	private final static GeneralConversion SquaremileToSquareinch = new GeneralConversion( 4.014e+9, 0);
	private final static GeneralConversion SquarefootToSquareinch = new GeneralConversion( 144, 0);
	private final static GeneralConversion HectareToSquareinch = new GeneralConversion( 1.55e+7, 0);
	private final static GeneralConversion SquareyardToSquareinch = new GeneralConversion( 1296, 0);
	private final static GeneralConversion SquaremeterToSquareinch = new GeneralConversion( 1550, 0);
	private final static GeneralConversion AcreToSquareinch = new GeneralConversion( 6.273e+6, 0);
	
	private final static GeneralConversion SquaremileToHectare = new GeneralConversion( 259.0, 0);
	private final static GeneralConversion SquarefootToHectare = new GeneralConversion( 1.0/107639, 0);
	private final static GeneralConversion SquareinchToHectare = new GeneralConversion( 1.0/1.55e+7, 0);
	private final static GeneralConversion SquareyardToHectare = new GeneralConversion( 1.0/11960, 0);
	private final static GeneralConversion SquaremeterToHectare = new GeneralConversion( 1.0/10000, 0);
	private final static GeneralConversion AcreToHectare = new GeneralConversion( 1/2.471, 0);
	
	private final static GeneralConversion SquaremileToAcre = new GeneralConversion( 640, 0);
	private final static GeneralConversion SquarefootToAcre = new GeneralConversion( 1.0/43560, 0);
	private final static GeneralConversion SquareinchToAcre = new GeneralConversion( 1.0/6.273e+6, 0);
	private final static GeneralConversion HectareToAcre = new GeneralConversion( 2.471, 0);
	private final static GeneralConversion SquareyardToAcre = new GeneralConversion( 1.0/4840, 0);
	private final static GeneralConversion SquaremeterToAcre = new GeneralConversion( 1.0/4047, 0);
	
	private final static GeneralConversion SquaremileToSquareyard = new GeneralConversion( 3.098e+6, 0);
	private final static GeneralConversion SquarefootToSquareyard = new GeneralConversion( 1/9.0, 0);
	private final static GeneralConversion SquareinchToSquareyard = new GeneralConversion( 1.0/1296, 0);
	private final static GeneralConversion HectareToSquareyard = new GeneralConversion( 11960, 0);
	private final static GeneralConversion SquaremeterToSquareyard = new GeneralConversion( 1.196, 0);
	private final static GeneralConversion AcreToSquareyard = new GeneralConversion( 4840.0, 0);
	
	private final static GeneralConversion SquarefootToSquaremile = new GeneralConversion( 1.0/2.788e+7, 0);
	private final static GeneralConversion SquareinchToSquaremile = new GeneralConversion( 1.0/4.014e+9, 0);
	private final static GeneralConversion HectareToSquaremile = new GeneralConversion( 1.0/259, 0);
	private final static GeneralConversion SquareyardToSquaremile = new GeneralConversion( 1.0/3.098e+6, 0);
	private final static GeneralConversion SquaremeterToSquaremile = new GeneralConversion( 1.0/2.59e+6, 0);
	private final static GeneralConversion AcreToSquaremile = new GeneralConversion( 1.0/640, 0);
	
	private final static GeneralConversion SquaremileToSquaremeter = new GeneralConversion(2.59e+6, 0);
	private final static GeneralConversion SquarefootToSquaremeter = new GeneralConversion( 1/10.764, 0);
	private final static GeneralConversion SquareinchToSquaremeter = new GeneralConversion( 1.0/1550, 0);
	private final static GeneralConversion HectareToSquaremeter = new GeneralConversion( 10000.0, 0);
	private final static GeneralConversion SquareyardToSquaremeter = new GeneralConversion( 1/1.196, 0);
	private final static GeneralConversion AcreToSquaremeter = new GeneralConversion( 4047.0, 0);

	private final static GeneralConversion SquaremileToSquarekilometer = new GeneralConversion( 2.59, 0);
	private final static GeneralConversion SquaremeterToSquarekilometer = new GeneralConversion( 1.0/1e+6, 0);
	private final static GeneralConversion SquarefootToSquarekilometer = new GeneralConversion( 1.0/1.076e+7, 0);
	private final static GeneralConversion SquareinchToSquarekilometer = new GeneralConversion( 1.0/1.55e+9, 0);
	private final static GeneralConversion HectareToSquarekilometer = new GeneralConversion( 1.0/100, 0);
	private final static GeneralConversion SquareyardToSquarekilometer = new GeneralConversion( 1.0/1.196e+6, 0);
	private final static GeneralConversion AcreToSquarekilometer = new GeneralConversion( 1.0/247, 0);

	private final static GeneralConversion SquarekilometerToSquaremile = new GeneralConversion( 1/2.59, 0);
	private final static GeneralConversion SquarekilometerToSquaremeter = new GeneralConversion( 1e+6, 0);
	private final static GeneralConversion SquarekilometerToSquarefoot = new GeneralConversion( 1.076e+7, 0);
	private final static GeneralConversion SquarekilometerToSquareinch = new GeneralConversion( 1.55e+9, 0);
	private final static GeneralConversion SquarekilometerToHectare = new GeneralConversion( 100.0, 0);
	private final static GeneralConversion SquarekilometerToSquareyard = new GeneralConversion( 1.196e+6, 0);
	private final static GeneralConversion SquarekilometerToAcre = new GeneralConversion( 247.0, 0);
		
		@Override
		public void Execute() 
		{
			UnitConverterWindow window = UnitConverterController.GetWindow();
			window.ClearUnitSelection();
			window.AddToUnitSelection("Acre to Hectare",AcreToHectare);
			window.AddToUnitSelection("Acre to Square foot",AcreToSquarefoot);
			window.AddToUnitSelection("Acre to Square inch",AcreToSquareinch);
			window.AddToUnitSelection("Acre to Square kilometer",AcreToSquarekilometer);
			window.AddToUnitSelection("Acre to Square meter",AcreToSquaremeter);
			window.AddToUnitSelection("Acre to Square mile",AcreToSquaremile);
			window.AddToUnitSelection("Acre to Square yard",AcreToSquareyard);
			window.AddToUnitSelection("Hectare to Acre",HectareToAcre);
			window.AddToUnitSelection("Hectare to Square foot",HectareToSquarefoot);
			window.AddToUnitSelection("Hectare to Square inch",HectareToSquareinch);
			window.AddToUnitSelection("Hectare to Square kilometer",HectareToSquarekilometer);
			window.AddToUnitSelection("Hectare to Square meter",HectareToSquaremeter);
			window.AddToUnitSelection("Hectare to Square mile",HectareToSquaremile);
			window.AddToUnitSelection("Hectare to Square yard",HectareToSquareyard);
			window.AddToUnitSelection("Square foot to Acre",SquarefootToAcre);
			window.AddToUnitSelection("Square foot to Hectare",SquarefootToHectare);
			window.AddToUnitSelection("Square foot to Square inch",SquarefootToSquareinch);
			window.AddToUnitSelection("Square foot to Square kilometer",SquarefootToSquarekilometer);
			window.AddToUnitSelection("Square foot to Square meter",SquarefootToSquaremeter);
			window.AddToUnitSelection("Square foot to Square mile",SquarefootToSquaremile);
			window.AddToUnitSelection("Square foot to Square yard",SquarefootToSquareyard);
			window.AddToUnitSelection("Square inch to Acre",SquareinchToAcre);
			window.AddToUnitSelection("Square inch to Hectare",SquareinchToHectare);
			window.AddToUnitSelection("Square inch to Square foot",SquareinchToSquarefoot);
			window.AddToUnitSelection("Square inch to Square kilometer",SquareinchToSquarekilometer);
			window.AddToUnitSelection("Square inch to Square meter",SquareinchToSquaremeter);
			window.AddToUnitSelection("Square inch to Square mile",SquareinchToSquaremile);
			window.AddToUnitSelection("Square inch to Square yard",SquareinchToSquareyard);
			window.AddToUnitSelection("Square kilometer to Acre",SquarekilometerToAcre);
			window.AddToUnitSelection("Square kilometer to Hectare",SquarekilometerToHectare);
			window.AddToUnitSelection("Square kilometer to Square foot",SquarekilometerToSquarefoot);
			window.AddToUnitSelection("Square kilometer to Square inch",SquarekilometerToSquareinch);
			window.AddToUnitSelection("Square kilometer to Square meter",SquarekilometerToSquaremeter);
			window.AddToUnitSelection("Square kilometer to Square mile",SquarekilometerToSquaremile);
			window.AddToUnitSelection("Square kilometer to Square yard",SquarekilometerToSquareyard);
			window.AddToUnitSelection("Square meter to Acre",SquaremeterToAcre);
			window.AddToUnitSelection("Square meter to Hectare",SquaremeterToHectare);
			window.AddToUnitSelection("Square meter to Square foot",SquaremeterToSquarefoot);
			window.AddToUnitSelection("Square meter to Square inch",SquaremeterToSquareinch);
			window.AddToUnitSelection("Square meter to Square kilometer",SquaremeterToSquarekilometer);
			window.AddToUnitSelection("Square meter to Square mile",SquaremeterToSquaremile);
			window.AddToUnitSelection("Square meter to Square yard",SquaremeterToSquareyard);
			window.AddToUnitSelection("Square mile to Acre",SquaremileToAcre);
			window.AddToUnitSelection("Square mile to Hectare",SquaremileToHectare);
			window.AddToUnitSelection("Square mile to Square foot",SquaremileToSquarefoot);
			window.AddToUnitSelection("Square mile to Square inch",SquaremileToSquareinch);
			window.AddToUnitSelection("Square mile to Square kilometer",SquaremileToSquarekilometer);
			window.AddToUnitSelection("Square mile to Square meter",SquaremileToSquaremeter);
			window.AddToUnitSelection("Square mile to Square yard",SquaremileToSquareyard);
			window.AddToUnitSelection("Square yard to Acre",SquareyardToAcre);
			window.AddToUnitSelection("Square yard to Hectare",SquareyardToHectare);
			window.AddToUnitSelection("Square yard to Square foot",SquareyardToSquarefoot);
			window.AddToUnitSelection("Square yard to Square inch",SquareyardToSquareinch);
			window.AddToUnitSelection("Square yard to Square kilometer",SquareyardToSquarekilometer);
			window.AddToUnitSelection("Square yard to Square meter",SquareyardToSquaremeter);
			window.AddToUnitSelection("Square yard to Square mile",SquareyardToSquaremile);


		}

	}
