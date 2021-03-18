package test.calc;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Controllers.CalculatorController;

class MoreCalcTests 
{
	/* FR005 The user should be able to perform the percentage operation. The system should
	 * show the results of the percentage operation. */
	
	String answer = "";
	// <- 1 % 55 <— =	
	@Test
	void backSpaceModulusButtonsTest() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.BackSpace);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Percentage);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.BackSpace);
		CalculatorController.PressButton(ButtonEnum.Equals);
		answer = CalculatorController.GetText();
		assertEquals(answer, "0.05");
		CalculatorController.Turnoff();
	}
	//1 + 1 = clear
	@Test
	void clearButtonTest()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.Clear);
		answer = CalculatorController.GetText();
		assertEquals(answer, "");
		CalculatorController.Turnoff();
	}
	/*FR020 The user should be able to carry multiple operations. Every next operation should trigger the
	execution of the previous operation and provide partial result */
	// TODO: Change Calc code to allow multiple operations.
	// 1 + 1 + 1 =
	@Test
	void mulipleOperationsTest()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Equals);
		answer = CalculatorController.GetText();
		assertEquals(answer, "3");
		CalculatorController.Turnoff();
	}
	/* FR018 The user should be able to perform the change signs operation. The system should 
	 * show the results of the change signs operation. */
	/* FR019 The calculator's initial value should be 0. */
	// 0 + 2 PLUSMINUS PLUSMINUS =
	 @Test
	 void signChangeTest()
	 {
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);	
		answer = CalculatorController.GetText();
		assertEquals(answer, "2");
		CalculatorController.Turnoff();
	 }
	 @Test
	 void inputNumberAfterErrorTest()
	 {
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Equals);	
		answer = CalculatorController.GetText();
		assertEquals(answer, "4"); 
		CalculatorController.Turnoff();
	 }
	 @Test
	 void operationAfterErrorTest()
	 {
	 CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Equals);
		answer = CalculatorController.GetText();
		assertEquals(answer, "2"); 
		CalculatorController.Turnoff();
	 }
	 @Test
	 void backspaceAfterErrorTest()
	 {
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.BackSpace);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Equals);
		answer = CalculatorController.GetText();
		assertEquals(answer, "8"); 
		CalculatorController.Turnoff();
	 }
	 @Test
	 void decimalAfterErrorTest()
	 {
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Plus);
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Equals);
		answer = CalculatorController.GetText();
		assertEquals(answer, "8.8"); 
		CalculatorController.Turnoff();
	 }
}
