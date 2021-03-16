package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;

class MoreCalcTests 
{
	/* FR005 The user should be able to perform the percentage operation. The system should
	 * show the results of the percentage operation. */
	//1 % 55 <— =		
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Percentage);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.BackSpace);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer1 = CalculatorController.GetAnswer();
		assertEquals(answer1, 0.05);
		CalculatorController.Turnoff();
	}
	//Not sure how to test if clear is pressed; it does appear in test coverage
	//1 + 1 = clear
	@Test
	void test2()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.Clear);
		Double answer2 = CalculatorController.GetAnswer();
		assertEquals(answer2, 2.0);
		CalculatorController.Turnoff();
	}
	/*FR020 The user should be able to carry multiple operations. Every next operation should trigger the
	execution of the previous operation and provide partial result */
	// TODO: Change Calc code to allow multiple operations.
	// 1 + 1 + 1 =
	@Test
	void test3()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer3 = CalculatorController.GetAnswer();
		assertEquals(answer3, 3);
		CalculatorController.Turnoff();
	}
	/* FR018 The user should be able to perform the change signs operation. The system should 
	 * show the results of the change signs operation. */
	/* FR019 The calculator's initial value should be 0. */
	// 0 + 2 PLUSMINUS PLUSMINUS =
	 @Test
	 void test4()
	 {
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);	
		Double answer4 = CalculatorController.GetAnswer();
		assertEquals(answer4, 2);
		CalculatorController.Turnoff();
	 }

}
