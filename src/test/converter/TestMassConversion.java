package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.MassEnums;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestMassConversion {

	double k = 0;
	static Stream<Arguments> testBUMassConversionsSrc() {
		return Stream.of(
				Arguments.of(MassEnums.GtoKG, "1", 0.001),
				Arguments.of(MassEnums.GtoOunce, "1", 0.03527399072),
				Arguments.of(MassEnums.GtoPound, "1", 0.00220264317),
				Arguments.of(MassEnums.KGtoG, "1", 1000),           
				Arguments.of(MassEnums.KGtoOunce, "1", 35.274),           
				Arguments.of(MassEnums.KGtoPound, "1", 2.205),          
				Arguments.of(MassEnums.OuncetoG, "1", 28.3495),          
				Arguments.of(MassEnums.OuncetoKG, "1", 0.02834949254),          
				Arguments.of(MassEnums.OuncetoPound, "1", 0.0625),
				Arguments.of(MassEnums.PoundtoG, "1", 454),
				Arguments.of(MassEnums.PoundtoKG, "1", 0.45351473923),
				Arguments.of(MassEnums.PoundtoOunce, "1", 16)
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
		//k = UnitConverterController.GetText();//Get Answer
		System.out.println("Mass : " + k);
		assertEquals(k, result);
		UnitConverterController.Turnoff();


	}

}
