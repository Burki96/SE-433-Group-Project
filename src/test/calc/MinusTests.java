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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;

class MinusTests 
{
	/* FR002 The user should be able to perform the subtraction operation. The system 
	 * should show the results of the subtraction operation. */
	
	// 5 - 4	
	// positive - positive (answer: positive); non-decimal - non-decimal
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Four);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer1 = CalculatorController.GetText();
		assertEquals(answer1, "1");
		CalculatorController.Turnoff();
	}
	// 5.5 - 6	
	// positive - positive (answer: negative); non-decimal - decimal OR decimal - non-decimal
	@Test
	void test2()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Six);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer2 = CalculatorController.GetText();
		assertEquals(answer2, "-0.5");
		CalculatorController.Turnoff();
	}
	// 7.5 - (-6.5) 
	// positive - negative; decimal - decimal (carry over decimal)
	@Test
	void test3()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Seven);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Six);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer3 = CalculatorController.GetText();
		assertEquals(answer3, "14");
		CalculatorController.Turnoff();
	}
	// -1 - (-5.8)	
	// negative - negative (answer: positive); decimal - decimal (don't carry over decimal)
	@Test
	void test4()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer4 = CalculatorController.GetText();
		assertEquals(answer4, "4.8");
		CalculatorController.Turnoff();
	}
	// -5.5 - (-4.7)	
	// negative - negative (answer: negative); negative decimal - negative decimal (“borrow” digit across decimal)
	@Test
	void test5()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Four);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Seven);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer5 = CalculatorController.GetText();
		assertEquals(answer5, "-0.8");
		CalculatorController.Turnoff();
	}

}
