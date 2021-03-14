package Calculators;

import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;
import Controllers.CalculatorController;
import Controllers.UnitConverterController;

public class Calculator{

	public static void main(String[] args) {
		//comment this out if you dont want to use the main menu
		
		//MainProgramSingleton.Start();
		
		//example for Calculator
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Six);//press six
		CalculatorController.PressButton(ButtonEnum.Five);//press five
		
		
		
		//example for converter
		UnitConverterController.StartJUNIT();//Start to intialize all the buttons
		UnitConverterController.SelectType(TypeEnums.Mass);//Switch to a conversion type
		UnitConverterController.SelectConversion(MassEnums.OuncetoG);//Select the unit type
		UnitConverterController.SetInput("20");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		double k = UnitConverterController.GetAnswer();//Get Answer
		
		UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
		UnitConverterController.SelectConversion(TempEnums.CelsiusToFahrenheit);//Select the unit type
		UnitConverterController.SetInput("20");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		
		UnitConverterController.SelectConversion(TempEnums.KelvinToFahrenheit);//Select the unit type
		UnitConverterController.SetInput("-20");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		
		UnitConverterController.SelectType(TypeEnums.Time);//Switch to a conversion type
		UnitConverterController.SelectConversion(TimeEnums.DaysToHours);//Select the unit type
		UnitConverterController.SetInput("20");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		
		UnitConverterController.Turnoff(); // Only turnoff when done with it fully.

	}

}
