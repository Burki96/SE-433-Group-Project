package test.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;

class MultiplyTests 
{
	/* FR003 The user should be able to perform the multiplication operation. The system 
	 * should show the results of the multiplication operation. */
	
	String answer = "";
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "56");
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "-76.5");
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "98.01");
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
		answer = CalculatorController.GetText();
		assertEquals(answer, "0");
		CalculatorController.Turnoff();
	}
}
