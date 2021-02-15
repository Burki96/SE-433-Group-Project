package Calculators.Windows;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import Calculators.Factories.ButtonFactory;
import Events.MainMenuCalculatorSwitch;

public class MainMenu {

	private BaseFrame mainWindowFrame;
	private JButton Button1;
	private static MainMenu instance = null;
	private MainMenuCalculatorSwitch switch1;
	private static MainMenu GetInstance()
	{
		if(instance == null) 
		{
			instance = new MainMenu();
		}
		return instance;
	}
	private MainMenu() {
		switch1 = new MainMenuCalculatorSwitch();
		mainWindowFrame = new BaseFrame();
	}
	public static JFrame GetWindow() 
	{
		return GetInstance().mainWindowFrame;
	}
	
	public static void Start() 
	{
		GetInstance().initialize();
	}
	public static void Terminate() 
	{
		instance = null;
	}
	public static void Turnoff() {
		GetInstance().privTurnoff();
	}
	private void privTurnoff() 
	{
		Button1 = ButtonFactory.returnButton(this.Button1);
		mainWindowFrame.setVisible(false);
	}
	private void initialize() 
	{
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
