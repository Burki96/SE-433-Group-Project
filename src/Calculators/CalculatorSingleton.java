package Calculators;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorSingleton 
{
	private static CalculatorSingleton instance = null;
	private JFrame mainWindowFrame;
	private JTextField txtHello;
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
		mainWindowFrame = new JFrame();
		mainWindowFrame.setTitle("Calculator");
		mainWindowFrame.setBounds(100, 100, 766, 460);
		mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtHello = new JTextField();
		txtHello.setHorizontalAlignment(SwingConstants.CENTER);
		txtHello.setText("Hello");
		mainWindowFrame.getContentPane().add(txtHello, BorderLayout.CENTER);
		txtHello.setColumns(5);
		mainWindowFrame.setVisible(true);
	}
}
