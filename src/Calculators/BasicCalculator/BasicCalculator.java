package Calculators.BasicCalculator;


import Calculators.Operations.DefaultOperation;
import Calculators.Operations.Operation;

public class BasicCalculator 
{
	public BasicCalculator() 
	{
		//Test
		this.FirstNumber = 0;
		this.SecondNumber = 0;
		this.op = new DefaultOperation(this);
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
	public double GetResultNumber() 
	{
		return this.Result;
	}
	public String GetResult()
	{
		return this.Answer;
	}
	public void PassResult(double Result) 
	{
		this.Answer = String.format("%.g", Result);
		this.Result = Result;
		//this.textField.setText(this.anString);
	}
	private double FirstNumber;
	private double SecondNumber;
	private Operation op;
	private String Answer;
	private double Result;
}
