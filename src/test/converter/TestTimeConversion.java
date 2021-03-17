package test.converter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;
import Controllers.UnitConverterController;

class TestTimeConversion {
	double k = 0;
	static Stream<Arguments> testBaseUnitsTimeConversionsSrc() {
		return Stream.of(
				Arguments.of(TimeEnums.DaysToHours, "1", 24),
				Arguments.of(TimeEnums.DaysToMinutes, "1", 1440),
				Arguments.of(TimeEnums.DaysToSeconds, "1", 86400),
				Arguments.of(TimeEnums.DaysToWeeks, "7", 1),           
				Arguments.of(TimeEnums.HoursToDays, "24", 1),           
				Arguments.of(TimeEnums.HoursToMinutes, "1", 60),
				Arguments.of(TimeEnums.HoursToSeconds, "1", 3600),
				Arguments.of(TimeEnums.HoursToWeeks, "168", 1),
				Arguments.of(TimeEnums.MinutesToDays, "1440", 1),
				Arguments.of(TimeEnums.MinutesToHours, "60", 1),           
				Arguments.of(TimeEnums.MinutesToSeconds, "1", 60),
				Arguments.of(TimeEnums.MinutesToWeeks, "10080", 1),
				Arguments.of(TimeEnums.SecondsToDays, "86400", 1),
				Arguments.of(TimeEnums.SecondsToHour, "3600", 1),           
				Arguments.of(TimeEnums.SecondsToMinute, "60", 1),           
				Arguments.of(TimeEnums.SecondsToWeeks, "604800", 1)


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
		assertTrue(k == result);
		UnitConverterController.Turnoff();

	}

}
