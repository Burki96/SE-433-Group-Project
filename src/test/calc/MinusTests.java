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
	//5 - 4	
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Minus);
		CalculatorController.PressButton(ButtonEnum.Four);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer1 = CalculatorController.GetAnswer();
		assertEquals(answer1, 1);
		CalculatorController.Turnoff();
	}
	//5.5 - 6	
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
		Double answer2 = CalculatorController.GetAnswer();
		assertEquals(answer2, -0.5);
		CalculatorController.Turnoff();
	}
	//7.5 - (-6.5) 
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
		Double answer3 = CalculatorController.GetAnswer();
		assertEquals(answer3, 14);
		CalculatorController.Turnoff();
	}
	//-1 - (-5.8)	
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
		Double answer4 = CalculatorController.GetAnswer();
		assertEquals(answer4, 4.8);
		CalculatorController.Turnoff();
	}
	//-5.5 - (-4.7)	
	// TODO: Rounding error in JUnit test. Calculator program rounds at 11 decimals; returns -0.8
	// Calculator rounds at 11 decimal points, GetAnswer() is a larger decimal
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
		Double answer5 = CalculatorController.GetAnswer();
		//Float float5 = (float) CalculatorController.GetAnswer();
		assertEquals(answer5, -0.7999999999999998);
		CalculatorController.Turnoff();
	}

}
