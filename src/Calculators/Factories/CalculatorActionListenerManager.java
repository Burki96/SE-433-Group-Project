package Calculators.Factories;

import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		list.add(new ArithmeticAction("+"));
		list.add(new ArithmeticAction("-"));
		list.add(new ArithmeticAction("*"));
		list.add(new ArithmeticAction("%"));
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
