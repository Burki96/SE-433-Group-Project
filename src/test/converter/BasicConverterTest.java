package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.stream.Stream;
import Controllers.UnitConverterController;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import Calculators.Enums.DigitalStorageEnum;
import Calculators.Enums.LengthEnums;
import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;


class BasicConverterTest {

	double k = 0.0;
	DecimalFormat df = new DecimalFormat("###.###########");


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

	static Stream<Arguments> testBUMassConversionsSrc() {
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
	@MethodSource("testBUMassConversionsSrc")
	void testMultipleBUMassConversions(MassEnums me, String input, double result) {
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
	void testSingleTemperatureConversion() {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
		UnitConverterController.SelectConversion(TempEnums.CelsiusToFahrenheit);//Select the unit type
		UnitConverterController.SetInput("0");//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Temp : " + k);
		assertEquals(k, 32.00);

		UnitConverterController.Turnoff();
	}

	static Stream<Arguments> testBUTempConversionsSrc() {
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
	@MethodSource("testBUTempConversionsSrc")
	void testMultipleBUTempConversions(TempEnums me, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Temperature);//Switch to a conversion type
		UnitConverterController.SelectConversion(me);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println(" Temp : " + k);
		assertEquals(k, result);
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


	static Stream<Arguments> testBaseUnitsTimeConversionsSrc() {
		return Stream.of(
				Arguments.of(TimeEnums.DaysToHours, "1", 24.00),
				Arguments.of(TimeEnums.DaysToMinutes, "1", 1440.00),
				Arguments.of(TimeEnums.DaysToSeconds, "1", 86400.00),
				Arguments.of(TimeEnums.DaysToWeeks, "7", 1.00),           
				Arguments.of(TimeEnums.HoursToDays, "24", 1.00),           
				Arguments.of(TimeEnums.HoursToMinutes, "1", 60.00),
				Arguments.of(TimeEnums.HoursToSeconds, "1", 3600.00),
				Arguments.of(TimeEnums.HoursToWeeks, "168", 1.00),
				Arguments.of(TimeEnums.MinutesToDays, "1440", 1.00),
				Arguments.of(TimeEnums.MinutesToHours, "60", 1.00),           
				Arguments.of(TimeEnums.MinutesToSeconds, "1", 60.00),
				Arguments.of(TimeEnums.MinutesToWeeks, "10080", 1.00),
				Arguments.of(TimeEnums.SecondsToDays, "86400.00", 1.00),
				Arguments.of(TimeEnums.SecondsToHour, "3600", 1.00),           
				Arguments.of(TimeEnums.SecondsToMinute, "60", 1.00),           
				Arguments.of(TimeEnums.SecondsToWeeks, "604800", 1.00)


				);
	}

	@ParameterizedTest(name = "#{index} - Time Conversion {0} : {1} -> {2}")
	@MethodSource("testBaseUnitsTimeConversionsSrc")
	void testMultipleBUTimeConversions(TimeEnums te, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Time);//Switch to a conversion type
		UnitConverterController.SelectConversion(te);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Time : " + k);
		assertEquals(k, result);
		UnitConverterController.Turnoff();

	}




	static Stream<Arguments> testBaseUnitsLenConversionsSrc() {
		return Stream.of(

				Arguments.of(LengthEnums.MtoKm,"1",1/1000),
				Arguments.of(LengthEnums.Mtocm,"1",100),
				Arguments.of(LengthEnums.Mtomm,"1",1000),
				Arguments.of(LengthEnums.MtoMile,"1",1/1609),
				Arguments.of(LengthEnums.MtoYard,"1",1.094),
				Arguments.of(LengthEnums.MtoFoot,"1",3.281),
				Arguments.of(LengthEnums.MtoInch,"1",39.37),
				Arguments.of(LengthEnums.KmtoM,"1",1000),
				Arguments.of(LengthEnums.cmtoM,"1",1/100),
				Arguments.of(LengthEnums.mmtoM,"1",1/1000),
				Arguments.of(LengthEnums.MiletoM,"1",1609),
				Arguments.of(LengthEnums.YardtoM,"1",0.91407678245),
				Arguments.of(LengthEnums.FoottoM,"1",0.30478512649),
				Arguments.of(LengthEnums.InchtoM,"1",0.0254000508)


				);
	}

	@ParameterizedTest(name = "#{index} - Length Conversion {0} : {1} -> {2}")
	@MethodSource("testBaseUnitsLenConversionsSrc")
	void testMultipleBULenConversions(LengthEnums le, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Length);//Switch to a conversion type
		UnitConverterController.SelectConversion(le);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Length : " + k);
		assertEquals(k, result);
		UnitConverterController.Turnoff();

	}

	static Stream<Arguments> testBaseUnitsDigitalConversionsSrc() {
		return Stream.of(

				Arguments.of(DigitalStorageEnum.KilobitToBit,"1",1000),
				Arguments.of(DigitalStorageEnum.MegabitToBit,"1",1000000),
				Arguments.of(DigitalStorageEnum.GigabitToBit,"1",1000000000),

				Arguments.of(DigitalStorageEnum.ByteToBit,"1",8),
				Arguments.of(DigitalStorageEnum.KilobyteToBit,"1",8000),
				Arguments.of(DigitalStorageEnum.MegabyteToBit,"1",8000000),


				Arguments.of(DigitalStorageEnum.MegabitToKilobit,"1",1000),
				Arguments.of(DigitalStorageEnum.GigabitToKilobit,"1",1000000),
				Arguments.of(DigitalStorageEnum.TerabitToKilobit,"1",1000000000),
				Arguments.of(DigitalStorageEnum.ByteToKilobit,"125",1),
				Arguments.of(DigitalStorageEnum.KilobyteToKilobit,"1",8),
				Arguments.of(DigitalStorageEnum.MegabyteToKilobit,"1",8000),
				Arguments.of(DigitalStorageEnum.GigabyteToKilobit,"1",8000000),
				Arguments.of(DigitalStorageEnum.BitToKilobit,"1000",1),
				Arguments.of(DigitalStorageEnum.TerabitToGigabit,"1000",1),		 				
				Arguments.of(DigitalStorageEnum.KilobitToMegabit,"1000",1),
				Arguments.of(DigitalStorageEnum.GigabitToMegabit,"1",1000),
				Arguments.of(DigitalStorageEnum.TerabitToMegabit,"1",1000000),
				Arguments.of(DigitalStorageEnum.ByteToMegabit,"125000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToMegabit,"125",1),
				Arguments.of(DigitalStorageEnum.MegabyteToMegabit,"1",8),
				Arguments.of(DigitalStorageEnum.GigabyteToMegabit,"1",8000),
				Arguments.of(DigitalStorageEnum.TerabyteToMegabit,"1",8000000),
				Arguments.of(DigitalStorageEnum.BitToMegabit,"1000000",1),

				Arguments.of(DigitalStorageEnum.KilobitToGigabit,"1",1000000),
				Arguments.of(DigitalStorageEnum.MegabitToGigabit,"1000",1),
				Arguments.of(DigitalStorageEnum.TerabitToGigabit,"1000",1),
				Arguments.of(DigitalStorageEnum.ByteToGigabit,"125000000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToGigabit,"125000",1),
				Arguments.of(DigitalStorageEnum.MegabyteToGigabit,"125",1),
				Arguments.of(DigitalStorageEnum.GigabyteToGigabit,"1",8),
				Arguments.of(DigitalStorageEnum.TerabyteToGigabit,"1",8000),
				Arguments.of(DigitalStorageEnum.BitToGigabit,"1000000000",1),

				Arguments.of(DigitalStorageEnum.KilobitToTerabit,"1000000000",1),
				Arguments.of(DigitalStorageEnum.MegabitToTerabit,"1000000",1),
				Arguments.of(DigitalStorageEnum.GigabitToTerabit,"1000",1),
				//Arguments.of(DigitalStorageEnum.ByteToTerabit,"125000000000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToTerabit,"125000000",1),
				Arguments.of(DigitalStorageEnum.MegabyteToTerabit,"125000",1),
				Arguments.of(DigitalStorageEnum.GigabyteToTerabit,"125",1),
				Arguments.of(DigitalStorageEnum.TerabyteToTerabit,"1",8),
				//Arguments.of(DigitalStorageEnum.BitToTerabit,"1",1000000000000),

				Arguments.of(DigitalStorageEnum.KilobitToByte,"1",125),
				Arguments.of(DigitalStorageEnum.MegabitToByte,"1",125000),
				Arguments.of(DigitalStorageEnum.GigabitToByte,"1",125000000),
				//Arguments.of(DigitalStorageEnum.TerabitToByte,"1",125000000000),
				Arguments.of(DigitalStorageEnum.KilobyteToByte,"1",1000),
				Arguments.of(DigitalStorageEnum.MegabyteToByte,"1",1000000),
				Arguments.of(DigitalStorageEnum.GigabyteToByte,"1",1000000000),
				//Arguments.of(DigitalStorageEnum.TerabyteToByte,"1",1000000000000),
				Arguments.of(DigitalStorageEnum.BitToByte,"8",1),

				Arguments.of(DigitalStorageEnum.KilobitToKilobyte,"8",1),
				Arguments.of(DigitalStorageEnum.MegabitToKilobyte,"1",125),
				Arguments.of(DigitalStorageEnum.GigabitToKilobyte,"1",125000),
				Arguments.of(DigitalStorageEnum.TerabitToKilobyte,"1",125000000),
				Arguments.of(DigitalStorageEnum.ByteToKilobyte,"1000",1),
				Arguments.of(DigitalStorageEnum.MegabyteToKilobyte,"1",1000),
				Arguments.of(DigitalStorageEnum.GigabyteToKilobyte,"1",1000000),
				Arguments.of(DigitalStorageEnum.TerabyteToKilobyte,"1",1000000000),
				Arguments.of(DigitalStorageEnum.BitToKilobyte,"8000",1),

				Arguments.of(DigitalStorageEnum.KilobitToMegabyte,"8000",1),
				Arguments.of(DigitalStorageEnum.MegabitToMegabyte,"8",1),
				Arguments.of(DigitalStorageEnum.GigabitToMegabyte,"1",125),
				Arguments.of(DigitalStorageEnum.TerabitToMegabyte,"1",125000),
				Arguments.of(DigitalStorageEnum.ByteToMegabyte,"1000000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToMegabyte,"1000",1),
				Arguments.of(DigitalStorageEnum.GigabyteToMegabyte,"1",1000),
				Arguments.of(DigitalStorageEnum.TerabyteToMegabyte,"1",1000000),
				Arguments.of(DigitalStorageEnum.BitToMegabyte,"8000000",1),

				Arguments.of(DigitalStorageEnum.KilobitToGigabyte,"8000000",1),
				Arguments.of(DigitalStorageEnum.MegabitToGigabyte,"8000",1),
				Arguments.of(DigitalStorageEnum.GigabitToGigabyte,"8",1),
				Arguments.of(DigitalStorageEnum.TerabitToGigabyte,"1",125),
				Arguments.of(DigitalStorageEnum.ByteToGigabyte,"1000000000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToGigabyte,"1000000",1),
				Arguments.of(DigitalStorageEnum.MegabyteToGigabyte,"1000",1),
				Arguments.of(DigitalStorageEnum.TerabyteToGigabyte,"1",1000),
				//Arguments.of(DigitalStorageEnum.BitToGigabyte,"8000000000",1),

				//Arguments.of(DigitalStorageEnum.KilobitToTerabyte,"8000000000",1),
				Arguments.of(DigitalStorageEnum.MegabitToTerabyte,"8000000",1),
				Arguments.of(DigitalStorageEnum.GigabitToTerabyte,"8000",1),
				Arguments.of(DigitalStorageEnum.TerabitToTerabyte,"8",1),
				//Arguments.of(DigitalStorageEnum.ByteToTerabyte,"1000000000000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToTerabyte,"1000000000",1),
				Arguments.of(DigitalStorageEnum.MegabyteToTerabyte,"1000000",1),
				Arguments.of(DigitalStorageEnum.GigabyteToTerabyte,"1000",1)
				//Arguments.of(DigitalStorageEnum.BitToTerabyte,"8000000000",1)


				);
	}


	@ParameterizedTest(name = "#{index} - Digital Storage Conversion {0} : {1} -> {2}")
	@MethodSource("testBaseUnitsDigitalConversionsSrc")
	void testMultipleBUDigitalConversions(DigitalStorageEnum de, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.DigitalStorage);//Switch to a conversion type
		UnitConverterController.SelectConversion(de);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Storage : " + k);
		assertEquals(k, result);
		UnitConverterController.Turnoff();

	}

}
