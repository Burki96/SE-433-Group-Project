package Calculators;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class CalculatorSingleton 
{
	private static CalculatorSingleton instance = null;
	private JFrame mainWindowFrame;
	private JTextField textField;
	private CalculatorSingleton() 
	{
		mainWindowFrame = null;
	}
	private static CalculatorSingleton GetInstance() 
	{
		if(instance == null) {
			
			instance = new CalculatorSingleton();
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
	/**
	 * @wbp.parser.entryPoint
	 */
	private void privStart() 
	{
		new MainMenu();
	}
}
