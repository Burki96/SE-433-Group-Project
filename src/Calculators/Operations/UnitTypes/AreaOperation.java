package Calculators.Operations.UnitTypes;

import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.GeneralConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class AreaOperation extends Operation {

	private final static GeneralConversion SquaremileToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToSquarefoot = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremileToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToSquareinch = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremileToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToHectare = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremileToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToAcre = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremileToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToSquareyard = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremeterToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToSquaremile = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquaremileToSquaremeter = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquarefootToSquaremeter = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareinchToSquaremeter = new GeneralConversion( 1, 0);
	private final static GeneralConversion HectareToSquaremeter = new GeneralConversion( 1, 0);
	private final static GeneralConversion SquareyardToSquaremeter = new GeneralConversion( 1, 0);
	private final static GeneralConversion AcreToSquaremeter = new GeneralConversion( 1, 0);

		
		@Override
		public void Execute() 
		{
			UnitConverterWindow window = UnitConverterController.GetWindow();
			window.ClearUnitSelection();
			window.AddToUnitSelection("Square mile to Square foot",SquaremileToSquarefoot);
			window.AddToUnitSelection("Square inch to Square foot",SquareinchToSquarefoot);
			window.AddToUnitSelection("Hectare to Square foot",HectareToSquarefoot);
			window.AddToUnitSelection("Square yard to Square foot",SquareyardToSquarefoot);
			window.AddToUnitSelection("Square meter to Square foot",SquaremeterToSquarefoot);
			window.AddToUnitSelection("Acre to Square foot",AcreToSquarefoot);
			window.AddToUnitSelection("Square mile to Square inch",SquaremileToSquareinch);
			window.AddToUnitSelection("Square foot to Square inch",SquarefootToSquareinch);
			window.AddToUnitSelection("Hectare to Square inch",HectareToSquareinch);
			window.AddToUnitSelection("Square yard to Square inch",SquareyardToSquareinch);
			window.AddToUnitSelection("Square meter to Square inch",SquaremeterToSquareinch);
			window.AddToUnitSelection("Acre to Square inch",AcreToSquareinch);
			window.AddToUnitSelection("Square mile to Hectare",SquaremileToHectare);
			window.AddToUnitSelection("Square foot to Hectare",SquarefootToHectare);
			window.AddToUnitSelection("Square inch to Hectare",SquareinchToHectare);
			window.AddToUnitSelection("Square yard to Hectare",SquareyardToHectare);
			window.AddToUnitSelection("Square meter to Hectare",SquaremeterToHectare);
			window.AddToUnitSelection("Acre to Hectare",AcreToHectare);
			window.AddToUnitSelection("Square mile to Acre",SquaremileToAcre);
			window.AddToUnitSelection("Square foot to Acre",SquarefootToAcre);
			window.AddToUnitSelection("Square inch to Acre",SquareinchToAcre);
			window.AddToUnitSelection("Hectare to Acre",HectareToAcre);
			window.AddToUnitSelection("Square yard to Acre",SquareyardToAcre);
			window.AddToUnitSelection("Square meter to Acre",SquaremeterToAcre);
			window.AddToUnitSelection("Square mile to Square yard",SquaremileToSquareyard);
			window.AddToUnitSelection("Square foot to Square yard",SquarefootToSquareyard);
			window.AddToUnitSelection("Square inch to Square yard",SquareinchToSquareyard);
			window.AddToUnitSelection("Hectare to Square yard",HectareToSquareyard);
			window.AddToUnitSelection("Square meter to Square yard",SquaremeterToSquareyard);
			window.AddToUnitSelection("Acre to Square yard",AcreToSquareyard);
			window.AddToUnitSelection("Square foot to Square mile",SquarefootToSquaremile);
			window.AddToUnitSelection("Square inch to Square mile",SquareinchToSquaremile);
			window.AddToUnitSelection("Hectare to Square mile",HectareToSquaremile);
			window.AddToUnitSelection("Square yard to Square mile",SquareyardToSquaremile);
			window.AddToUnitSelection("Square meter to Square mile",SquaremeterToSquaremile);
			window.AddToUnitSelection("Acre to Square mile",AcreToSquaremile);
			window.AddToUnitSelection("Square mile to Square meter",SquaremileToSquaremeter);
			window.AddToUnitSelection("Square foot to Square meter",SquarefootToSquaremeter);
			window.AddToUnitSelection("Square inch to Square meter",SquareinchToSquaremeter);
			window.AddToUnitSelection("Hectare to Square meter",HectareToSquaremeter);
			window.AddToUnitSelection("Square yard to Square meter",SquareyardToSquaremeter);
			window.AddToUnitSelection("Acre to Square meter",AcreToSquaremeter);

		}

	}
