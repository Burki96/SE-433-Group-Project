package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.LengthEnums;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestLengthConversion {
	double k = 0;
	static Stream<Arguments> testBaseUnitsLenConversionsSrc() {
		return Stream.of(

				Arguments.of(LengthEnums.MtoKm,"1000",1.0),
				Arguments.of(LengthEnums.Mtocm,"1",100),
				Arguments.of(LengthEnums.Mtomm,"1",1000),
				Arguments.of(LengthEnums.MtoMile,"1609",1.0),
				Arguments.of(LengthEnums.MtoYard,"1",1.094),
				Arguments.of(LengthEnums.MtoFoot,"1",3.281),
				Arguments.of(LengthEnums.MtoInch,"1",39.37),
				Arguments.of(LengthEnums.KmtoM,"1",1000),
				Arguments.of(LengthEnums.cmtoM,"100",1.0),
				Arguments.of(LengthEnums.mmtoM,"1000",1.0),
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
	}
