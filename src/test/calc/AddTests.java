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

class AddTests 
{
	/* FR001 The user should be able to perform the addition operation. The system should show the 
	 * results of the addition. */
	
	//	5.5 + 9.5 
	// positive + positive; decimal + decimal (carry over decimal)
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Nine);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer1 = CalculatorController.GetText();
		assertEquals(answer1, "15");
		CalculatorController.Turnoff();
	}
	// 6 + (-4)	
	// positive + negative (answer: positive); non-decimal + non-decimal
	@Test
	void test2() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Six);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Four);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer2 = CalculatorController.GetText();
		assertEquals(answer2, "2");
		CalculatorController.Turnoff();
	}
	// 1.2 + -3.4
	// positive + negative (answer: negative); positive decimal + negative decimal (“borrow” digit across decimal)
	@Test
	void test3()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Three);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Four);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer3 = CalculatorController.GetText();
		assertEquals(answer3, "-2.2");
		CalculatorController.Turnoff();
	}
	// -0.7 + -8	
	// negative + negative; non-decimal + decimal OR decimal + non-decimal; decimal + decimal (don’t carry decimal)
	@Test
	void test4()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Seven);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer4 = CalculatorController.GetText();
		assertEquals(answer4, "-8.7");
		CalculatorController.Turnoff();
	}
	
}
