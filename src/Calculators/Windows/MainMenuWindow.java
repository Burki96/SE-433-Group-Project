package Calculators.Windows;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Calculators.Factories.ButtonFactory;
import Events.MainMenuCalculatorSwitch;
import Events.MainMenuConverterSwitch;


public class MainMenuWindow {

	private BaseFrame mainWindowFrame;
	private JButton Button1;
	private JButton Button2;
	private MainMenuCalculatorSwitch switch1;
	private MainMenuConverterSwitch switch2;
	public JFrame GetWindow() 
	{
		return this.mainWindowFrame;
	}
	public MainMenuWindow() {
		//initialize();
		switch1 = new MainMenuCalculatorSwitch();
		switch2 = new MainMenuConverterSwitch();
	}
	public void Turnoff() 
	{
		Button1 = ButtonFactory.returnButton(this.Button1);
		Button2 = ButtonFactory.returnButton(this.Button2);
		if(mainWindowFrame != null) {
			mainWindowFrame.setVisible(false);
			mainWindowFrame = null;
		}
	}
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		mainWindowFrame = new BaseFrame();
		mainWindowFrame.setTitle("MainMenu");
		mainWindowFrame.setBounds(100, 100, 594, 460);
		mainWindowFrame.getContentPane().setLayout(null);
		
		Button1 = ButtonFactory.GetButton("Calculator",211, 154, 134, 54);
		//Button1.setBounds(211, 154, 134, 54);
		mainWindowFrame.getContentPane().add(Button1);
		
		
		Button1.addActionListener(switch1);
		
		JLabel lblNewLabel = new JLabel("SE 433 Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(171, 58, 231, 41);
		mainWindowFrame.getContentPane().add(lblNewLabel);
		
		Button2 = ButtonFactory.GetButton("Converter",211, 219, 134, 54);
		Button2.setText("Unit Converter");
		
		//Button2.setBounds(211, 219, 134, 54);
		Button2.addActionListener(switch2);
		mainWindowFrame.getContentPane().add(Button2);
		mainWindowFrame.setVisible(true);
	}
}
