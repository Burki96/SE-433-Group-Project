package test.calc;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

import Calculators.ButtonEnum;
import Calculators.Calculator;
import Controllers.CalculatorController;

class DivideTests 
{
	/* FR004 The user should be able to perform the division operation. The system should 
	 * show the results of the division operation. */
	
	// 10 / 2	
	// positive / positive; non-decimal / non-decimal 
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer1 = CalculatorController.GetText();
		assertEquals(answer1, "5");
		CalculatorController.Turnoff();
	}
	// 100 / -5.2	
	// positive / negative; decimal / non-decimal OR non-decimal / decimal
	@Test
	void test2()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer2 = CalculatorController.GetText();
		//DecimalFormat df = new DecimalFormat("###.###########");
	    //df.format(answer2);
		//System.out.println(answer2);
		assertEquals(answer2, "-19.23076923077");
		CalculatorController.Turnoff();
	}
	// -80.5 / -20.2	
	// negative / negative ; decimal / decimal
	@Test
	void test3()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Eight);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Period);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.PlusMinus);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer3 = CalculatorController.GetText();
		assertEquals(answer3, "3.98514851485");
		CalculatorController.Turnoff();
	}
	/* FR016 The user should be able to get appropriate ERROR messages when the entered data warrants it. 
	 * Ex. division by zero.*/
	// 25 / 0
	// number / zero
	// TODO: Dividing by zero returns infinity, it should be returning an ERROR
	@Test
	void divideByZeroTest()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer4 = CalculatorController.GetAnswer();
		//System.out.println(answer4);
		assertEquals(answer4, Double.POSITIVE_INFINITY); 
		CalculatorController.Turnoff();
	}
	// 0 / 25
	// zero / number
	@Test
	void zeroDividedByNumberTest()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Equals);
		String answer5 = CalculatorController.GetText();
		assertEquals(answer5, "0");
		CalculatorController.Turnoff();
	}
}
