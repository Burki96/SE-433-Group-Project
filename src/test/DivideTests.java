package test;

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
	//10 / 2	
	@Test
	void test1() 
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.One);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer1 = CalculatorController.GetAnswer();
		assertEquals(answer1, 5);
		CalculatorController.Turnoff();
	}
	//100/ -5.2	
	// TODO: Rounding error in JUnit test. Calculator program returns -19.23076923077
	// Calculator rounds at 11 decimal points, GetAnswer() is a larger decimal
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
		Double answer2 = CalculatorController.GetAnswer();
		//DecimalFormat df = new DecimalFormat("###.###########");
	    //df.format(answer2);
		System.out.println(answer2);
		assertEquals(answer2, -19.23076923076923);
		CalculatorController.Turnoff();
	}
	//-80.5 / -20.2	
	// TODO:  Rounding error in JUnit test. Calculator program returns  3.98514851485
	// Calculator rounds at 11 decimal points, GetAnswer() is a larger decimal
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
		Double answer3 = CalculatorController.GetAnswer();
		assertEquals(answer3, 3.985148514851485);
		CalculatorController.Turnoff();
	}
	//25 / 0	
	/* FR016 The user should be able to get appropriate ERROR messages when the entered data warrants it. 
	 * Ex. division by zero.*/
	// TODO: Dividing by zero returns infinity, it should be returning an ERROR
	@Test
	void test4()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer4 = CalculatorController.GetAnswer();
		System.out.println(answer4);
		assertEquals(answer4, Double.POSITIVE_INFINITY); 
		CalculatorController.Turnoff();
	}
	//0 / 25
	@Test
	void test5()
	{
		CalculatorController.StartJUNIT();
		CalculatorController.PressButton(ButtonEnum.Zero);
		CalculatorController.PressButton(ButtonEnum.Division);
		CalculatorController.PressButton(ButtonEnum.Two);
		CalculatorController.PressButton(ButtonEnum.Five);
		CalculatorController.PressButton(ButtonEnum.Equals);
		Double answer5 = CalculatorController.GetAnswer();
		assertEquals(answer5, 0);
		CalculatorController.Turnoff();
	}
}
