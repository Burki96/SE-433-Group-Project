package Calculators;


import javax.swing.JFrame;

import Calculators.Windows.MainMenuController;
import Events.ClosingEvent;


public class MainProgramSingleton 
{
	private static MainProgramSingleton instance = null;
	private JFrame mainWindowFrame;
	private ClosingEvent closingEvent;
	private MainProgramSingleton() 
	{
		closingEvent = new ClosingEvent();
		mainWindowFrame = null;
	}
	private static MainProgramSingleton GetInstance() 
	{
		if(instance == null) {
			
			instance = new MainProgramSingleton();
		}
		return instance;
	}
	public static ClosingEvent GetClosingEvent() 
	{
		return GetInstance().closingEvent;
	}
	public static void Start() 
	{
		GetInstance().privStart();
	}
	public static JFrame GetMainWindow() {
		return GetInstance().mainWindowFrame;
	}
	private void privStart() 
	{
		MainMenuController.Start();
	}
	public static void Terminate() 
	{
		instance = null;
	}
}
