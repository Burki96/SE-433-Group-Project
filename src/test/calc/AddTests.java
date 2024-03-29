package test.calc;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTests 
{
	/* FR001 The user should be able to perform the addition operation. The system should show the 
	 * results of the addition. */
	
	String answer = "";
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "15");
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "2");
		CalculatorController.Turnoff();
	}
	// 1.2 + -3.4
	// positive + negative (answer: negative); positive decimal + negative decimal (â€œborrowâ€� digit across decimal)
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "-2.2");
		CalculatorController.Turnoff();
	}
	// -0.7 + -8	
	// negative + negative; non-decimal + decimal OR decimal + non-decimal; decimal + decimal (donâ€™t carry decimal)
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "-8.7");
		CalculatorController.Turnoff();
	}
	
}
