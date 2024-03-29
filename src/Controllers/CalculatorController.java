package Controllers;


import Calculators.ButtonEnum;
import Calculators.BasicCalculator.BasicCalculator;

import Calculators.Operations.Operation;
import Calculators.Windows.CalculatorWindow;

import javax.swing.JButton;


public class CalculatorController {
	private static CalculatorController instance = null;
	private BasicCalculator cal;
	private CalculatorWindow calculatorWindow;
	private static CalculatorController GetInstance()
	{
		if(instance == null) 
		{
			instance = new CalculatorController();
		}
		return instance;
	}
	private CalculatorController() 
	{
		
	
		this.cal = new BasicCalculator();
		this.calculatorWindow = new CalculatorWindow();
		
		//initialize();
	}
	public static BasicCalculator GetCalculator() 
	{
		return GetInstance().cal;
	}
	//Hard terminate, does soft terminate, but will also deletes the singleton
	public static void Terminate() 
	{
		//GetInstance().list.clear();
		GetInstance().calculatorWindow.Shutdown();
		instance = null;
	}
	//Soft terminate, clears list and returns all buttons back to the button factory
	public static void Turnoff() 
	{
		GetInstance().calculatorWindow.Shutdown();
	}
	public static String GetText() 
	{
		return GetInstance().calculatorWindow.GetText();
	}
	//Sets the textbox on the calculator window, for interal use only, not for JUNIT
	public static void SetText(String s)
	{
		GetInstance().calculatorWindow.SetText(s);
	}

	//starts the calculator window
	public static void Start() 
	{
		GetInstance().calculatorWindow.initialize(true);
	}
	public static void StartJUNIT() 
	{
		GetInstance().calculatorWindow.initialize(false);
	}
	public static double GetAnswer()
	{
		return GetInstance().cal.GetResultNumber();
	}
	public static void PressButton(ButtonEnum c)
	{
		GetInstance().calculatorWindow.PressButton(c);
	}
	public static JButton GetButton(int i) 
	{
		return GetInstance().calculatorWindow.GetButton(i);
	}

	public static void DoArthimeticAction(Operation c)
	{
		GetInstance().privDoArthimeticAction(c);
	}
	public static void Compute()
	{
		GetInstance().privCompute();
	}

	private void privCompute() 
	{
		double SecondNumber = 0;
		
		try{
			SecondNumber = Double.parseDouble(calculatorWindow.GetText());
		}catch (NumberFormatException e) {
			SecondNumber = cal.GetFirstNumber();
		}
		
		cal.SetSecondNumber(SecondNumber);
		//this.cal.Execute();
		//this.calculatorWindow.SetText(this.cal.GetAnswer());
	
		//NEW
		try{
			this.cal.Execute();
			this.calculatorWindow.SetText(this.cal.GetAnswer());
		} catch(Exceptions.DivideByZeroException e) {
			this.calculatorWindow.SetText("Error");
		}
		//this.calculatorWindow.SetText(this.cal.GetAnswer());
		//END NEW
	}
	private void privDoArthimeticAction(Operation c) 
	{
		try { 
			Double.parseDouble(calculatorWindow.GetText());
			
		
		}catch(NumberFormatException e) {
			this.calculatorWindow.SetText("0");
		}
		double first = Double.parseDouble(calculatorWindow.GetText());
		cal.SetFirstNumber(first);
		cal.SetSecondNumber(first);
		this.calculatorWindow.SetText("");
		this.cal.SetOperation(c);
		
		
	}

}
