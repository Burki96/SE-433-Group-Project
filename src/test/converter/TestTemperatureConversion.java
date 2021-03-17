package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.TempEnums;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestTemperatureConversion {

	double k = 0;
	static Stream<Arguments> testBUTempConversionsSrc() {
		return Stream.of(
				Arguments.of(TempEnums.CelsiusToFahrenheit, "0", 32),
				Arguments.of(TempEnums.CelsiusToKelvin, "0", 273.15),
				Arguments.of(TempEnums.FahrenheitToCelsius, "32", 0),
				Arguments.of(TempEnums.FahrenheitToKelvin, "32", 273.15),           
				Arguments.of(TempEnums.KelvinToCelsius, "273.15", 0),           
				Arguments.of(TempEnums.KelvinToFahrenheit, "273.15", 32)          

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
}
