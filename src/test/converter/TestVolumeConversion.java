package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.TypeEnums;
import Calculators.Enums.VolumeEnum;
import Controllers.UnitConverterController;

class TestVolumeConversion {

	double k = 0;
	static Stream<Arguments> testBUVolumeConversionsSrc() {
		return Stream.of(
				Arguments.of(VolumeEnum.USTablespoonToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSGallon, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSQuart, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSPint, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSPint, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSPint, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSPint, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSPint, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSPint, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSCup, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSCup, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSCup, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSCup, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSCup, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSCup, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSFluidOunce, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToLiter, "1", 1),
				Arguments.of(VolumeEnum.USGallonToLiter, "1", 1),
				Arguments.of(VolumeEnum.USQuartToLiter, "1", 1),
				Arguments.of(VolumeEnum.USPintToLiter, "1", 1),
				Arguments.of(VolumeEnum.USCupToLiter, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToLiter, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToLiter, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToLiter, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToLiter, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToLiter, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToLiter, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USGallonToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USQuartToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USPintToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USCupToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.LiterToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToMilliliter, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USGallonToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USQuartToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USPintToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USCupToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.LiterToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToCubicMeter, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USGallonToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USQuartToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USPintToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USCupToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.LiterToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToCubicFoot, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USGallonToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USQuartToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USPintToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USCupToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.LiterToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToCubicInch, "1", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSTeaspoon, "1", 1),
				Arguments.of(VolumeEnum.USGallonToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.USQuartToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.USPintToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.USCupToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.LiterToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.MilliliterToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.CubicMeterToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.CubicFootToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.CubicInchToUSTablespoon, "1", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSTablespoon, "1", 1)

				);
	}


	@ParameterizedTest(name = "#{index} - Volume Conversion {0} : {1} -> {2}")
	@MethodSource("testBUVolumeConversionsSrc")
	void testMultipleBUMassConversions(VolumeEnum me, String input, double result) {
		UnitConverterController.StartJUNIT();
		UnitConverterController.SelectType(TypeEnums.Volume);//Switch to a conversion type
		UnitConverterController.SelectConversion(me);//Select the unit type
		UnitConverterController.SetInput(input);//Set the input, must be in a string
		UnitConverterController.PressConvert(); //PressConvert
		k = UnitConverterController.GetAnswer();//Get Answer
		System.out.println("Volume : " + k);
		assertEquals(k, result);
		UnitConverterController.Turnoff();


	}
}
