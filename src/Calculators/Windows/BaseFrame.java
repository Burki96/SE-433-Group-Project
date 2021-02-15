package Calculators.Windows;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import Calculators.MainProgramSingleton;
import Calculators.Factories.ButtonFactory;

public class BaseFrame extends JFrame{
	private static final long serialVersionUID = 7643362405697794365L;
	public BaseFrame() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent event) {
		        ExitFunction();
		    }
		});
	}
	public void ExitFunction() {
		ButtonFactory.Terminate();
		MainProgramSingleton.Terminate();
		this.dispose();
		System.exit(0);
	}

}
