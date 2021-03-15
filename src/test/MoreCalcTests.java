package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;

class MoreCalcTests 
{
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
	//1 + 1 = clear
	//Not sure how to test if clear is pressed, it does appear in test coverage
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

}
