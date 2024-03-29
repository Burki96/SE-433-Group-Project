package Calculators.Factories;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import Calculators.Operations.DivisionOperation;
import Calculators.Operations.MinusOperation;
import Calculators.Operations.MultiplicationOperation;
import Calculators.Operations.PercentageOperation;
import Calculators.Operations.PlusOperation;
import Controllers.CalculatorController;
import Events.CalculatorButtonEvents.ArithmeticAction;
import Events.CalculatorButtonEvents.BackSpaceAction;
import Events.CalculatorButtonEvents.CalculatorMainMenuSwitch;
import Events.CalculatorButtonEvents.ClearAction;
import Events.CalculatorButtonEvents.EqualAction;
import Events.CalculatorButtonEvents.NumberAction;
import Events.CalculatorButtonEvents.PlusMinusAction;

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
		int a = 11;
		for(int i = 0; i < a; i++) 
		{
			list.add(new NumberAction(i));
		}
		list.add(new ArithmeticAction(new PlusOperation(CalculatorController.GetCalculator())));
		list.add(new ArithmeticAction(new MinusOperation(CalculatorController.GetCalculator())));
		list.add(new ArithmeticAction(new MultiplicationOperation(CalculatorController.GetCalculator())));
		list.add(new ArithmeticAction(new DivisionOperation(CalculatorController.GetCalculator())));
		list.add(new ArithmeticAction(new PercentageOperation(CalculatorController.GetCalculator())));
		list.add(new EqualAction());
		list.add(new ClearAction());
		list.add(new PlusMinusAction());
		list.add(new BackSpaceAction());
		list.add(new CalculatorMainMenuSwitch());
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
