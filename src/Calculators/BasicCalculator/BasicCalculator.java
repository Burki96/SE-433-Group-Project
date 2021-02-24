package Calculators.BasicCalculator;


import Calculators.Operations.Operation;

public class BasicCalculator 
{
	public BasicCalculator() 
	{
		
	}
	public String GetAnswer() 
	{
		return this.Answer;
	}
	public double GetFirstNumber()
	{
		return this.FirstNumber;
	}
	public double GetSecondNumber()
	{
		return this.SecondNumber;
	}
	public void SetFirstNumber(double i)
	{
		this.FirstNumber = i;
	}
	public void SetSecondNumber(double i)
	{
		this.SecondNumber = i;
	}
	public void Execute()
	{
		this.op.Execute();
	}
	public void SetOperation(Operation c)
	{
		this.op = c;
	}
	public String GetResult()
	{
		return this.Answer;
	}
	public void PassResult(double Result) 
	{
		this.Answer = String.format("%.2f", Result);
		//this.textField.setText(this.anString);
	}
	private double FirstNumber;
	private double SecondNumber;
	private Operation op;
	private String Answer;
}
