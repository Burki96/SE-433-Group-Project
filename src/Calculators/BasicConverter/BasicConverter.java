package Calculators.BasicConverter;

import Calculators.Operations.Operation;

public class BasicConverter 
{
	public BasicConverter() 
	{
		//Test
		this.FirstNumber = 0;
	}
	public String GetAnswer() 
	{
		return this.Answer;
	}
	public double GetFirstNumber()
	{
		return this.FirstNumber;
	}
	public void SetFirstNumber(double i)
	{
		this.FirstNumber = i;
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
		this.Answer = String.format("%.3f", Result);
		this.Result = Result;
		//this.textField.setText(this.anString);
	}
	private double FirstNumber;
	private Operation op;
	private String Answer;
	private double Result;
}
