package Calculators.Windows;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Calculators.Factories.ButtonFactory;
import Events.MainMenuCalculatorSwitch;

public class MainMenuWindow {

	private BaseFrame mainWindowFrame;
	private JButton Button1;
	private MainMenuCalculatorSwitch switch1;
	public JFrame GetWindow() 
	{
		return this.mainWindowFrame;
	}
	public MainMenuWindow() {
		//initialize();
		switch1 = new MainMenuCalculatorSwitch();
	}
	public void Turnoff() 
	{
		Button1 = ButtonFactory.returnButton(this.Button1);
		if(mainWindowFrame != null) {
			mainWindowFrame.setVisible(false);
			mainWindowFrame = null;
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		mainWindowFrame = new BaseFrame();
		mainWindowFrame.setTitle("MainMenu");
		mainWindowFrame.setBounds(100, 100, 594, 460);
		mainWindowFrame.getContentPane().setLayout(null);
		
		Button1 = ButtonFactory.GetButton("Calculator");
		Button1.setBounds(10, 109, 134, 54);
		mainWindowFrame.getContentPane().add(Button1);
		
		
		Button1.addActionListener(switch1);
		
		JLabel lblNewLabel = new JLabel("SE 433 Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(153, 11, 231, 41);
		mainWindowFrame.getContentPane().add(lblNewLabel);
		mainWindowFrame.setVisible(true);
	}

}
