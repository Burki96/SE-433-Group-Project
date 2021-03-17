package test.converter;

import static org.junit.jupiter.api.Assertions.*;


import Controllers.UnitConverterController;
import org.junit.jupiter.api.Test;
import Calculators.Enums.AreaEnum;
import Calculators.Enums.DigitalStorageEnum;
import Calculators.Enums.LengthEnums;
import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;
import Calculators.Enums.VolumeEnum;


class BasicConverterTest {

	double k = 0.0;
	@Test
	void testSingleAreaConversion() {

		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Area);//Switch to a conversion type
		UnitConverterController.SelectConversion(AreaEnum.AcreToHectare);//Select the unit type
		UnitConverterController.SetInput("24710");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Area : " + k);
		assertEquals(k, 10000);
		UnitConverterController.Turnoff();
	}

	@Test
	void testSingleDSConversion() {

		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.DigitalStorage);//Switch to a conversion type
		UnitConverterController.SelectConversion(DigitalStorageEnum.ByteToBit);//Select the unit type
		UnitConverterController.SetInput("32");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		
		System.out.println("Storage : " + k);
		assertEquals(k, 256);
		UnitConverterController.Turnoff();
	}
	
	
	@Test
	void testSingleLengthConversion() {

		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Length);//Switch to a conversion type
		UnitConverterController.SelectConversion(LengthEnums.MtoYard);//Select the unit type
		UnitConverterController.SetInput("145");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Length : " + k);
		assertEquals(k, 158.63);
		UnitConverterController.Turnoff();
	}
	
	@Test
	void testSingleMassConversion() {

		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Mass);//Switch to a conversion type
		UnitConverterController.SelectConversion(MassEnums.OuncetoG);//Select the unit type
		UnitConverterController.SetInput("1");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Mass : " + k);
		assertEquals(k, 28.3495);
		UnitConverterController.Turnoff();
	}

	

	@Test
	void testSingleTemperatureConversion() {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
		UnitConverterController.SelectConversion(TempEnums.CelsiusToFahrenheit);//Select the unit type
		UnitConverterController.SetInput("0");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Temp : " + k);
		assertEquals(k, 32);

		UnitConverterController.Turnoff();
	}



	@Test
	void testSingleTimeConversion() {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Time);//Switch to a conversion type
		UnitConverterController.SelectConversion(TimeEnums.DaysToHours);//Select the unit type
		UnitConverterController.SetInput("20");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Time : " + k);
		assertEquals(k, 20*24);

		UnitConverterController.Turnoff();
	}
	
	@Test
	void testSingleVolumeConversion() {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Volume);//Switch to a conversion type
		UnitConverterController.SelectConversion(VolumeEnum.CubicFootToCubicMeter);//Select the unit type
		UnitConverterController.SetInput("52.972");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Volumen : " + k);
		assertEquals(k, 1.49998584171);

		UnitConverterController.Turnoff();
	}


	



	

}
