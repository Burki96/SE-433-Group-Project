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
				Arguments.of(VolumeEnum.CubicFootToCubicInch, "1", 1728),
				Arguments.of(VolumeEnum.CubicFootToCubicMeter, "35.315", 1),
				Arguments.of(VolumeEnum.CubicFootToLiter, "1", 28.317),
				Arguments.of(VolumeEnum.CubicFootToMilliliter, "1", 28317),
				Arguments.of(VolumeEnum.CubicFootToUSCup, "1", 118),
				Arguments.of(VolumeEnum.CubicFootToUSFluidOunce, "1", 958),
				Arguments.of(VolumeEnum.CubicFootToUSGallon, "1", 7.481),
				Arguments.of(VolumeEnum.CubicFootToUSPint, "1", 59.844),
				Arguments.of(VolumeEnum.CubicFootToUSQuart, "1", 29.922),
				Arguments.of(VolumeEnum.CubicFootToUSTablespoon, "1", 1915),
				Arguments.of(VolumeEnum.CubicFootToUSTeaspoon, "1", 5745),
				
				Arguments.of(VolumeEnum.CubicInchToCubicFoot, "1728", 1),
				Arguments.of(VolumeEnum.CubicInchToCubicMeter, "61024", 1),
				Arguments.of(VolumeEnum.CubicInchToLiter, "61.024", 1),
				Arguments.of(VolumeEnum.CubicInchToMilliliter, "1", 16.387),
				Arguments.of(VolumeEnum.CubicInchToUSCup, "14.646", 1),
				Arguments.of(VolumeEnum.CubicInchToUSFluidOunce, "1.805", 1),
				Arguments.of(VolumeEnum.CubicInchToUSGallon, "231", 1),
				Arguments.of(VolumeEnum.CubicInchToUSPint, "28.875", 1),
				Arguments.of(VolumeEnum.CubicInchToUSQuart, "57.75", 1),
				Arguments.of(VolumeEnum.CubicInchToUSTablespoon, "1", 1.108),
				Arguments.of(VolumeEnum.CubicInchToUSTeaspoon, "1", 3.325),
				
				Arguments.of(VolumeEnum.CubicMeterToCubicFoot, "1", 35.315),
				Arguments.of(VolumeEnum.CubicMeterToCubicInch, "1", 61024),
				Arguments.of(VolumeEnum.CubicMeterToLiter, "1", 1000),
				Arguments.of(VolumeEnum.CubicMeterToMilliliter, "1", 1e+6),
				Arguments.of(VolumeEnum.CubicMeterToUSCup, "1", 4167),
				Arguments.of(VolumeEnum.CubicMeterToUSFluidOunce, "1", 33814),
				Arguments.of(VolumeEnum.CubicMeterToUSGallon, "1", 264),
				Arguments.of(VolumeEnum.CubicMeterToUSPint, "1", 2113),
				Arguments.of(VolumeEnum.CubicMeterToUSQuart, "1", 1057),
				Arguments.of(VolumeEnum.CubicMeterToUSTablespoon, "1", 67628),
				Arguments.of(VolumeEnum.CubicMeterToUSTeaspoon, "1", 202884),
				
				Arguments.of(VolumeEnum.LiterToCubicFoot, "28.317", 1),
				Arguments.of(VolumeEnum.LiterToCubicInch, "1", 61.024),
				Arguments.of(VolumeEnum.LiterToCubicMeter, "1000", 1),
				Arguments.of(VolumeEnum.LiterToMilliliter, "1", 1000),
				Arguments.of(VolumeEnum.LiterToUSCup, "1", 4.167),
				Arguments.of(VolumeEnum.LiterToUSFluidOunce, "1", 33.814),
				Arguments.of(VolumeEnum.LiterToUSGallon, "3.785", 1),
				Arguments.of(VolumeEnum.LiterToUSPint, "1", 2.113),
				Arguments.of(VolumeEnum.LiterToUSQuart, "1", 1.057),
				Arguments.of(VolumeEnum.LiterToUSTablespoon, "1", 67.628),
				Arguments.of(VolumeEnum.LiterToUSTeaspoon, "1", 203),
				
				Arguments.of(VolumeEnum.MilliliterToCubicFoot, "28317", 1),
				Arguments.of(VolumeEnum.MilliliterToCubicInch, "16.387", 1),
				Arguments.of(VolumeEnum.MilliliterToCubicMeter, "1e+6", 1),
				Arguments.of(VolumeEnum.MilliliterToLiter, "1000", 1),
				Arguments.of(VolumeEnum.MilliliterToUSCup, "240", 1),
				Arguments.of(VolumeEnum.MilliliterToUSFluidOunce, "29.574", 1),
				Arguments.of(VolumeEnum.MilliliterToUSGallon, "3875", 1),
				Arguments.of(VolumeEnum.MilliliterToUSPint, "473", 1),
				Arguments.of(VolumeEnum.MilliliterToUSQuart, "946", 1),
				Arguments.of(VolumeEnum.MilliliterToUSTablespoon, "14.787", 1),
				Arguments.of(VolumeEnum.MilliliterToUSTeaspoon, "4.929", 1),
				
				Arguments.of(VolumeEnum.USCupToCubicFoot, "118", 1),
				Arguments.of(VolumeEnum.USCupToCubicInch, "14.646", 1),
				Arguments.of(VolumeEnum.USCupToCubicMeter, "4167", 1),
				Arguments.of(VolumeEnum.USCupToLiter, "4.167", 1),
				Arguments.of(VolumeEnum.USCupToMilliliter, "1", 240),
				Arguments.of(VolumeEnum.USCupToUSFluidOunce, "1", 8.115),
				Arguments.of(VolumeEnum.USCupToUSGallon, "15.773", 1),
				Arguments.of(VolumeEnum.USCupToUSPint, "1.972", 1),
				Arguments.of(VolumeEnum.USCupToUSQuart, "3.943", 1),
				Arguments.of(VolumeEnum.USCupToUSTablespoon, "1", 16.231),
				Arguments.of(VolumeEnum.USCupToUSTeaspoon, "1", 48.692),
				
				Arguments.of(VolumeEnum.USFluidOunceToCubicFoot, "958", 1),
				Arguments.of(VolumeEnum.USFluidOunceToCubicInch, "1", 1.805),
				Arguments.of(VolumeEnum.USFluidOunceToCubicMeter, "33814", 1),
				Arguments.of(VolumeEnum.USFluidOunceToLiter, "33.814", 1),
				Arguments.of(VolumeEnum.USFluidOunceToMilliliter, "1", 29.574),
				Arguments.of(VolumeEnum.USFluidOunceToUSCup, "8.115", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSGallon, "128", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSPint, "16", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSQuart, "32", 1),
				Arguments.of(VolumeEnum.USFluidOunceToUSTablespoon, "1", 2),
				Arguments.of(VolumeEnum.USFluidOunceToUSTeaspoon, "1", 6),
				
				Arguments.of(VolumeEnum.USGallonToCubicFoot, "7.481", 1),
				Arguments.of(VolumeEnum.USGallonToCubicInch, "1", 231),
				Arguments.of(VolumeEnum.USGallonToCubicMeter, "264", 1),
				Arguments.of(VolumeEnum.USGallonToLiter, "1", 3.785),
				Arguments.of(VolumeEnum.USGallonToMilliliter, "1", 3875),
				Arguments.of(VolumeEnum.USGallonToUSCup, "1", 15.773),
				Arguments.of(VolumeEnum.USGallonToUSFluidOunce, "1", 128),
				Arguments.of(VolumeEnum.USGallonToUSPint, "1", 8),
				Arguments.of(VolumeEnum.USGallonToUSQuart, "1", 4),
				Arguments.of(VolumeEnum.USGallonToUSTablespoon, "1", 256),
				Arguments.of(VolumeEnum.USGallonToUSTeaspoon, "1", 768),
				
				Arguments.of(VolumeEnum.USPintToCubicFoot, "59.844", 1),
				Arguments.of(VolumeEnum.USPintToCubicInch, "1", 28.875),
				Arguments.of(VolumeEnum.USPintToCubicMeter, "2113", 1),
				Arguments.of(VolumeEnum.USPintToLiter, "2.113", 1),
				Arguments.of(VolumeEnum.USPintToMilliliter, "1", 473),
				Arguments.of(VolumeEnum.USPintToUSCup, "1", 1.972),
				Arguments.of(VolumeEnum.USPintToUSFluidOunce, "1", 16.0),
				Arguments.of(VolumeEnum.USPintToUSGallon, "1", 0.125),
				Arguments.of(VolumeEnum.USPintToUSQuart, "1", 0.5),
				Arguments.of(VolumeEnum.USPintToUSTablespoon, "1", 32.0),
				Arguments.of(VolumeEnum.USPintToUSTeaspoon, "1", 96.0),
				
				Arguments.of(VolumeEnum.USQuartToCubicFoot, "29.922", 1),
				Arguments.of(VolumeEnum.USQuartToCubicInch, "1", 57.75),
				Arguments.of(VolumeEnum.USQuartToCubicMeter, "1057", 1),
				Arguments.of(VolumeEnum.USQuartToLiter, "1.057", 1),
				Arguments.of(VolumeEnum.USQuartToMilliliter, "1", 946),
				Arguments.of(VolumeEnum.USQuartToUSCup, "1", 3.943),
				Arguments.of(VolumeEnum.USQuartToUSFluidOunce, "1", 32),
				Arguments.of(VolumeEnum.USQuartToUSGallon, "1", 0.25),
				Arguments.of(VolumeEnum.USQuartToUSPint, "1", 2.0),
				Arguments.of(VolumeEnum.USQuartToUSTablespoon, "1", 64),
				Arguments.of(VolumeEnum.USQuartToUSTeaspoon, "1", 192),
				
				Arguments.of(VolumeEnum.USTablespoonToCubicFoot, "1915", 1),
				Arguments.of(VolumeEnum.USTablespoonToCubicInch, "1.108", 1),
				Arguments.of(VolumeEnum.USTablespoonToCubicMeter, "67628", 1),
				Arguments.of(VolumeEnum.USTablespoonToLiter, "67.628", 1),
				Arguments.of(VolumeEnum.USTablespoonToMilliliter, "1", 14.787),
				Arguments.of(VolumeEnum.USTablespoonToUSCup, "16.231", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSFluidOunce, "1", 0.5),
				Arguments.of(VolumeEnum.USTablespoonToUSGallon, "256", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSPint, "32", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSQuart, "64", 1),
				Arguments.of(VolumeEnum.USTablespoonToUSTeaspoon, "1", 3.0),
				
				Arguments.of(VolumeEnum.USTeaspoonToCubicFoot, "5745", 1),
				Arguments.of(VolumeEnum.USTeaspoonToCubicInch, "3.325", 1),
				Arguments.of(VolumeEnum.USTeaspoonToCubicMeter, "202884", 1),
				Arguments.of(VolumeEnum.USTeaspoonToLiter, "203", 1),
				Arguments.of(VolumeEnum.USTeaspoonToMilliliter, "1", 4.929),
				Arguments.of(VolumeEnum.USTeaspoonToUSCup, "48.692", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSFluidOunce, "6", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSGallon, "768", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSPint, "96", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSQuart, "192", 1),
				Arguments.of(VolumeEnum.USTeaspoonToUSTablespoon, "3", 1)


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
