package Calculators.Factories;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import Calculators.Operations.DivisionOperation;
import Calculators.Operations.MinusOperation;
import Calculators.Operations.MultiplicationOperation;
import Calculators.Operations.PlusOperation;
import Events.CalculatorButtonEvents.ArithmeticAction;
import Events.CalculatorButtonEvents.EqualAction;
import Events.CalculatorButtonEvents.NumberAction;

public class CalculatorActionListenerManager {
	
	private ArrayList<ActionListener> list;
	private static CalculatorActionListenerManager instance = null;
	
	private static CalculatorActionListenerManager GetInstance()
	{
		if(instance == null)
		{
			instance = new CalculatorActionListenerManager();
		}
		return instance;
	}
	private CalculatorActionListenerManager() 
	{
		list = new ArrayList<ActionListener>();
		
		for(int i = 0; i < 10; i++) 
		{
			list.add(new NumberAction(i));
		}
		list.add(new ArithmeticAction(new PlusOperation()));
		list.add(new ArithmeticAction(new MinusOperation()));
		list.add(new ArithmeticAction(new MultiplicationOperation()));
		list.add(new ArithmeticAction(new DivisionOperation()));
		list.add(new EqualAction());
	}
	public static ActionListener GetListener(int i) 
	{
		return GetInstance().list.get(i);
	}
	public static void Terminate() 
	{
		GetInstance().list.clear();
		instance = null;
	}
}
