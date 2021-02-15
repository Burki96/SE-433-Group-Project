package Calculators;


import javax.swing.JFrame;

import Calculators.Windows.MainMenu;


public class MainProgramSingleton 
{
	private static MainProgramSingleton instance = null;
	private JFrame mainWindowFrame;
	private MainProgramSingleton() 
	{
		mainWindowFrame = null;
	}
	private static MainProgramSingleton GetInstance() 
	{
		if(instance == null) {
			
			instance = new MainProgramSingleton();
		}
		return instance;
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
		MainMenu.Start();
	}
	public static void Terminate() 
	{
		instance = null;
	}
}
