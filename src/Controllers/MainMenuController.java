package Controllers;


import javax.swing.JFrame;

import Calculators.Windows.MainMenuWindow;


public class MainMenuController {

	private static MainMenuController instance = null;
	private MainMenuWindow window;
	private static MainMenuController GetInstance()
	{
		if(instance == null) 
		{
			instance = new MainMenuController();
		}
		return instance;
	}
	private MainMenuController() 
	{
		this.window = new MainMenuWindow();
		
	}
	public static JFrame GetWindow() 
	{
		return GetInstance().window.GetWindow();
	}
	
	public static void Start() 
	{
		GetInstance().window.initialize();
	}
	public static void Terminate() 
	{
		instance = null;
	}
	public static void Turnoff() 
	{
		GetInstance().privTurnoff();
	}

	private void privTurnoff() 
	{
		this.window.Turnoff();
	}

}
