package test.calc;

import Calculators.ButtonEnum;
import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;
import Controllers.CalculatorController;
import Controllers.UnitConverterController;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTests 
{
	/* FR003 The user should be able to perform the multiplication operation. The system 
	 * should show the results of the multiplication operation. */
	
	// 7 * 8	
	// positive * positive; non-decimal * non-decimal
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Seven);
		CalculatorController.PressButton(ButtonEnum.Multiplication);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer1 = CalculatorController.GetText();
		assertEquals(answer1, "56");
		CalculatorController.Turnoff();
	}
	// 9 * -8.5	
	// positive * negative; non-decimal * decimal OR decimal * non-decimal 
	@Test
	void test2()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.Multiplication);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer2 = CalculatorController.GetText();
		assertEquals(answer2, "-76.5");
		CalculatorController.Turnoff();
	}
	// FR021. The calculator should show a precision of at least 2 decimals.
	// -9.9 * -9.9	
	// negative * negative; decimal * decimal
	@Test
	void test3()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Multiplication);
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer3 = CalculatorController.GetText();
		assertEquals(answer3, "98.01");
		CalculatorController.Turnoff();
	}
	// 0 * 100	
	// zero * number
	@Test
	void multiplyByZeroTest()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Multiplication);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer4 = CalculatorController.GetText();
		assertEquals(answer4, "0");
		CalculatorController.Turnoff();
	}
}
