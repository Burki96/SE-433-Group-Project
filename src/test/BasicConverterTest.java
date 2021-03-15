package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import Controllers.UnitConverterController;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;

class BasicConverterTest {

	double k = 0.0;


	@Test
	void testMass() {

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

	  static Stream<Arguments> testMassConversion() {
	        return Stream.of(
	        		Arguments.of(MassEnums.GtoKG, "1", 0.001),
	        		Arguments.of(MassEnums.GtoOunce, "1", 0.03527399072),
	        		Arguments.of(MassEnums.GtoPound, "1", 0.00220264317),
	        		Arguments.of(MassEnums.KGtoG, "1", 1000.00),           
	        		Arguments.of(MassEnums.KGtoOunce, "1", 35.274),           
	        		Arguments.of(MassEnums.KGtoPound, "1", 2.205),          
	        		Arguments.of(MassEnums.OuncetoG, "1", 28.3495),          
	        		Arguments.of(MassEnums.OuncetoKG, "1", 0.02834949254),          
	        		Arguments.of(MassEnums.OuncetoPound, "1", 0.0625),
	        		Arguments.of(MassEnums.PoundtoG, "1", 454.00),
	        		Arguments.of(MassEnums.PoundtoKG, "1", 0.45351473923),
	        		Arguments.of(MassEnums.PoundtoOunce, "1", 16.00)
	               );
	    }
	
	 	@ParameterizedTest(name = "#{index} - Mass Conversion {0} : {1} -> {2}")
	    @MethodSource("testMassConversion")
	    void testMultipleMassConversions(MassEnums me, String input, double result) {
		    UnitConverterController.StartJUNIT();
			UnitConverterController.SelectType(TypeEnums.Mass);//Switch to a conversion type
			UnitConverterController.SelectConversion(me);//Select the unit type
			UnitConverterController.SetInput(input);//Set the input, must be in a string
			UnitConverterController.PressConvert(); //PressConvert
			k = UnitConverterController.GetAnswer();//Get Answer
			System.out.println("Mass : " + k);
			assertEquals(k, result);
			UnitConverterController.Turnoff();
	        
	    }
 	
 	
 	
	@Test
	void testTemperature() {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
		UnitConverterController.SelectConversion(TempEnums.CelsiusToFahrenheit);//Select the unit type
		UnitConverterController.SetInput("0");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Temp : " + k);
		assertEquals(k, 32.00);
		
		
		UnitConverterController.SelectConversion(TempEnums.CelsiusToKelvin);//Select the unit type
		UnitConverterController.SetInput("0");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Temp : " + k);
		assertEquals(k, 273.15);
		
		UnitConverterController.Turnoff();
	}
	
	  static Stream<Arguments> testTempConversion() {
	        return Stream.of(
	        		Arguments.of(TempEnums.CelsiusToFahrenheit, "0", 32.00),
	        		Arguments.of(TempEnums.CelsiusToKelvin, "0", 273.15),
	        		Arguments.of(TempEnums.FahrenheitToCelsius, "32.00", 0.00),
	        		Arguments.of(TempEnums.FahrenheitToKelvin, "32.00", 273.15),           
	        		Arguments.of(TempEnums.KelvinToCelsius, "273.15", 0.00),           
	        		Arguments.of(TempEnums.KelvinToFahrenheit, "273.15", 32.00)          
	        	
	               );
	    }
	
	 	@ParameterizedTest(name = "#{index} - Temp Conversion {0} : {1} -> {2}")
	    @MethodSource("testTempConversion")
	    void testMultipleTempConversions(TempEnums me, String input, double result) {
		    UnitConverterController.StartJUNIT();
			UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
			UnitConverterController.SelectConversion(me);//Select the unit type
			UnitConverterController.SetInput(input);//Set the input, must be in a string
			UnitConverterController.PressConvert(); //PressConvert
			k = UnitConverterController.GetAnswer();//Get Answer
			System.out.println("Temp : " + k);
			assertEquals(k, result);
			UnitConverterController.Turnoff();
	        
	    }

	@Test
	void testTimeConversion() {
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




}
