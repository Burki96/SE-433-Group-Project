package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.DigitalStorageEnum;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestDigitalStorageConversion {

	double k = 0;

	static Stream<Arguments> testBaseUnitsDigitalConversionsSrc() {
		return Stream.of(

				Arguments.of(DigitalStorageEnum.KilobitToBit,"1",1000),
				Arguments.of(DigitalStorageEnum.MegabitToBit,"1",1000000),
				Arguments.of(DigitalStorageEnum.GigabitToBit,"1",1000000000),
				//Arguments.of(DigitalStorageEnum.TerabitToBit,"1",1000000000000),
				Arguments.of(DigitalStorageEnum.ByteToBit,"1",8),
				Arguments.of(DigitalStorageEnum.KilobyteToBit,"1",8000),
				Arguments.of(DigitalStorageEnum.MegabyteToBit,"1",8000000),
				//Arguments.of(DigitalStorageEnum.GigabyteToBit,"1",8000000000),
				//Arguments.of(DigitalStorageEnum.TerabyteToMegabit,"1",8000000000000),
				
				Arguments.of(DigitalStorageEnum.MegabitToKilobit,"1",1000),
				Arguments.of(DigitalStorageEnum.GigabitToKilobit,"1",1000000),
				Arguments.of(DigitalStorageEnum.TerabitToKilobit,"1",1000000000),
				Arguments.of(DigitalStorageEnum.ByteToKilobit,"125",1),
				Arguments.of(DigitalStorageEnum.KilobyteToKilobit,"1",8),
				Arguments.of(DigitalStorageEnum.MegabyteToKilobit,"1",8000),
				Arguments.of(DigitalStorageEnum.GigabyteToKilobit,"1",8000000),
				Arguments.of(DigitalStorageEnum.BitToKilobit,"1000.0",1),
				
					 				
				Arguments.of(DigitalStorageEnum.KilobitToMegabit,"1000",1),
				Arguments.of(DigitalStorageEnum.GigabitToMegabit,"1",1000),
				Arguments.of(DigitalStorageEnum.TerabitToMegabit,"1",1000000),
				Arguments.of(DigitalStorageEnum.ByteToMegabit,"125000",1),
				Arguments.of(DigitalStorageEnum.KilobyteToMegabit,"125",1),
				Arguments.of(DigitalStorageEnum.MegabyteToMegabit,"1",8),
				Arguments.of(DigitalStorageEnum.GigabyteToMegabit,"1",8000),
				Arguments.of(DigitalStorageEnum.TerabyteToMegabit,"1",8000000),
				Arguments.of(DigitalStorageEnum.BitToMegabit,"1000000",1),

				Arguments.of(DigitalStorageEnum.KilobitToGigabit,"1000000",1),
				Arguments.of(DigitalStorageEnum.MegabitToGigabit,"1000",1),
				Arguments.of(DigitalStorageEnum.TerabitToGigabit,"1",1000),
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
