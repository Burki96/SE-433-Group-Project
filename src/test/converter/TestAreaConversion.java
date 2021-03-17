package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.AreaEnum;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestAreaConversion {

	double k = 0;
	static Stream<Arguments> testBaseUnitsAreaConversionsSrc() {
		return Stream.of(
				Arguments.of(AreaEnum.SquaremileToSquarefoot, "1",2.788e-7),
				Arguments.of(AreaEnum.SquareinchToSquarefoot, "144.0",1.0),
				Arguments.of(AreaEnum.HectareToSquarefoot, "1",107639),
				Arguments.of(AreaEnum.SquareyardToSquarefoot, "1",9),
				Arguments.of(AreaEnum.SquaremeterToSquarefoot, "1",10.764),
				Arguments.of(AreaEnum.AcreToSquarefoot, "1",43560),
				
				Arguments.of(AreaEnum.SquaremileToSquareinch, "1",4.014e+9),
				Arguments.of(AreaEnum.SquarefootToSquareinch, "1",144),
				Arguments.of(AreaEnum.HectareToSquareinch, "1",1.55e+7),
				Arguments.of(AreaEnum.SquareyardToSquareinch, "1",1296),
				Arguments.of(AreaEnum.SquaremeterToSquareinch, "1",1550),
				Arguments.of(AreaEnum.AcreToSquareinch, "1",6.273e+6),
				
				Arguments.of(AreaEnum.SquaremileToHectare, "1",259.0),
				Arguments.of(AreaEnum.SquarefootToHectare, "107639",1.0),
				Arguments.of(AreaEnum.SquareinchToHectare, "1.55e+7",1.0),
				Arguments.of(AreaEnum.SquareyardToHectare, "11960",1.0),
				Arguments.of(AreaEnum.SquaremeterToHectare, "10000",1.0),
				Arguments.of(AreaEnum.AcreToHectare, "2.471",1.0),
				
				Arguments.of(AreaEnum.SquaremileToAcre, "1",640),
				Arguments.of(AreaEnum.SquarefootToAcre, "43560",1.0),
				Arguments.of(AreaEnum.SquareinchToAcre, "6.273e+6",1.0),
				Arguments.of(AreaEnum.HectareToAcre, "1",2.471),
				Arguments.of(AreaEnum.SquareyardToAcre, "4840",1.0),
				Arguments.of(AreaEnum.SquaremeterToAcre, "4047",1.0),
				
				Arguments.of(AreaEnum.SquaremileToSquareyard, "1",3.098e+6),
				Arguments.of(AreaEnum.SquarefootToSquareyard, "9",1.0),
				Arguments.of(AreaEnum.SquareinchToSquareyard, "1296",1.0),
				Arguments.of(AreaEnum.HectareToSquareyard, "1",11960),
				Arguments.of(AreaEnum.SquaremeterToSquareyard, "1",1.196),
				Arguments.of(AreaEnum.AcreToSquareyard, "1",4840.0),
				
				Arguments.of(AreaEnum.SquarefootToSquaremile, "2.788e+7",1.0),
				Arguments.of(AreaEnum.SquareinchToSquaremile, "4.014e+9",1.0),
				Arguments.of(AreaEnum.HectareToSquaremile, "259",1.0),
				Arguments.of(AreaEnum.SquareyardToSquaremile, "3.098e+6",1.0),
				Arguments.of(AreaEnum.SquaremeterToSquaremile, "2.59e+6",1.0),
				Arguments.of(AreaEnum.AcreToSquaremile, "640.0",1.0),
				
				Arguments.of(AreaEnum.SquaremileToSquaremeter,"1", 2.59e+6),
				Arguments.of(AreaEnum.SquarefootToSquaremeter, "10.764",1),
				Arguments.of(AreaEnum.SquareinchToSquaremeter, "1550",1.0),
				Arguments.of(AreaEnum.HectareToSquaremeter, "1",10000.0),
				Arguments.of(AreaEnum.SquareyardToSquaremeter, "1.196",1),
				Arguments.of(AreaEnum.AcreToSquaremeter, "1",4047.0),

				Arguments.of(AreaEnum.SquaremileToSquarekilometer, "1",2.59),
				Arguments.of(AreaEnum.SquaremeterToSquarekilometer, "1e+6",1.0),
				Arguments.of(AreaEnum.SquarefootToSquarekilometer, "1.076e+7",1.0),
				Arguments.of(AreaEnum.SquareinchToSquarekilometer, "1.55e+9",1.0),
				Arguments.of(AreaEnum.HectareToSquarekilometer, "100",1.0),
				Arguments.of(AreaEnum.SquareyardToSquarekilometer, "1.196e+6",1.0),
				Arguments.of(AreaEnum.AcreToSquarekilometer, "247",1.0),

				Arguments.of(AreaEnum.SquarekilometerToSquaremile, "2.59",1),
				Arguments.of(AreaEnum.SquarekilometerToSquaremeter, "1",1e+6),
				Arguments.of(AreaEnum.SquarekilometerToSquarefoot, "1",1.076e+7),
				Arguments.of(AreaEnum.SquarekilometerToSquareinch, "1",1.55e+9),
				Arguments.of(AreaEnum.SquarekilometerToHectare, "1",100.0),
				Arguments.of(AreaEnum.SquarekilometerToSquareyard, "1",1.196e+6),
				Arguments.of(AreaEnum.SquarekilometerToAcre, "1",247.0)



				);
	}

	@ParameterizedTest(name = "#{index} - Area Conversion {0} : {1} -> {2}")
	@MethodSource("testBaseUnitsAreaConversionsSrc")
	void testMultipleBUAreaConversions(AreaEnum te, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Area);//Switch to a conversion type
		UnitConverterController.SelectConversion(te);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		 k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Area : " + k);
		assertTrue(k == result);
		UnitConverterController.Turnoff();

	}


}
