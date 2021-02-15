package Calculators.Windows;

import javax.swing.JFrame;

import Calculators.MainProgramSingleton;


public class BaseFrame extends JFrame{
	private static final long serialVersionUID = 7643362405697794365L;
	public BaseFrame() 
	{
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(MainProgramSingleton.GetClosingEvent());
	}

}
