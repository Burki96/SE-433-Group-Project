package Calculators;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorSingleton 
{
	private static CalculatorSingleton instance = null;
	private JFrame mainWindowFrame;
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
	public static void Start(int width, int height, String name) 
	{
		GetInstance().privStart(width, height,name);
	}
	private void privStart(int width, int height, String name) 
	{
		mainWindowFrame = new JFrame(name);
		//2. Optional: What happens when the frame closes?
		mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(175, 100));
		mainWindowFrame.getContentPane().add(emptyLabel , BorderLayout.CENTER);

		//4. Size the frame.
		mainWindowFrame.pack();
		
		//5. Show it.
		mainWindowFrame.setVisible(true);
	}
}
