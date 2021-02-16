package Calculators.Windows;

import javax.swing.JFrame;

import Calculators.Factories.ButtonFactory;
import Calculators.Factories.CalculatorActionListenerManager;
import Events.CalculatorButtonEvents.NumberAction;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorWindow {
	private static CalculatorWindow instance = null;
	private JButton SevenButton;
	private JButton ZeroButton;
	private JButton ThreeButton;
	private JButton TwoButton;
	private JButton OneButton;
	private JButton FourButton;
	private JButton FiveButton;
	private JButton SixButton;
	private JButton EightButton;
	private JButton NineButton;
	private JButton MultiplicationButton;
	private JButton MinusButton;
	private JButton PlusButton;
	private JButton EqualsButton;
	private BaseFrame frame;
	private ArrayList<JButton> list;

	private JButton ClearButton;
	private JTextField textField;
	private static CalculatorWindow GetInstance()
	{
		if(instance == null) 
		{
			instance = new CalculatorWindow();
		}
		return instance;
	}
	private CalculatorWindow() {
		this.list = new ArrayList<JButton>();
		//initialize();
	}
	//Hard terminate, does soft terminate, but will also deletes the singleton
	public static void Terminate() 
	{
		//GetInstance().list.clear();
		GetInstance().privShutdown();
		instance = null;
	}
	//Soft terminate, clears list and returns all buttons back to the button factory
	public static void Turnoff() 
	{
		GetInstance().privShutdown();
	}
	public static String GetText() 
	{
		return GetInstance().textField.getText();
	}
	public static void SetText(String s)
	{
		GetInstance().textField.setText(s);
	}
	private void privShutdown() 
	{
		ZeroButton = ButtonFactory.returnButton(this.ZeroButton);
		OneButton = ButtonFactory.returnButton(this.OneButton);
		TwoButton = ButtonFactory.returnButton(this.TwoButton);
		ThreeButton = ButtonFactory.returnButton(this.ThreeButton);
		FourButton = ButtonFactory.returnButton(this.FourButton);
		FiveButton = ButtonFactory.returnButton(this.FiveButton);
		SixButton = ButtonFactory.returnButton(this.SixButton);
		SevenButton = ButtonFactory.returnButton(this.SevenButton);
		EightButton = ButtonFactory.returnButton(this.EightButton);
		NineButton = ButtonFactory.returnButton(this.NineButton);
		EqualsButton = ButtonFactory.returnButton(this.EqualsButton);
		MultiplicationButton = ButtonFactory.returnButton(this.MultiplicationButton);
		MinusButton = ButtonFactory.returnButton(this.MinusButton);
		PlusButton = ButtonFactory.returnButton(this.PlusButton);
		EqualsButton = ButtonFactory.returnButton(this.EqualsButton);
		this.textField = null;
		this.list.clear();
		frame.setVisible(false);
	}
	//starts the calculator window
	public static void Start() 
	{
		GetInstance().initialize();
	}
	public static JButton GetButton(int i) 
	{
		return GetInstance().privGetButton(i);
	}
	private JButton privGetButton(int i)
	{
		return list.get(i);
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		
		
		
		frame = new BaseFrame();
		frame.setBounds(100, 100, 377, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ZeroButton = ButtonFactory.GetButton("0");
		ZeroButton.setBounds(91, 349, 73, 53);
		frame.getContentPane().add(ZeroButton);
		list.add(ZeroButton);                      //0
		
		OneButton = ButtonFactory.GetButton("1");
		OneButton.setBounds(10, 285, 73, 53);
		frame.getContentPane().add(OneButton);
		list.add(OneButton);                      //1
		
		TwoButton = ButtonFactory.GetButton("2");
		TwoButton.setBounds(91, 285, 73, 53);
		frame.getContentPane().add(TwoButton);
		list.add(TwoButton);
		
		ThreeButton = ButtonFactory.GetButton("3");
		ThreeButton.setBounds(174, 285, 73, 53);
		frame.getContentPane().add(ThreeButton);
		list.add(ThreeButton);
		
		FourButton = ButtonFactory.GetButton("4");
		FourButton.setBounds(10, 221, 73, 53);
		frame.getContentPane().add(FourButton);
		list.add(FourButton);
		
		FiveButton = ButtonFactory.GetButton("5");
		FiveButton.setBounds(91, 221, 73, 53);
		frame.getContentPane().add(FiveButton);
		list.add(FiveButton);
		
		SixButton = ButtonFactory.GetButton("6");
		SixButton.setBounds(174, 221, 73, 53);
		frame.getContentPane().add(SixButton);
		list.add(SixButton);                         //6
		
		SevenButton = ButtonFactory.GetButton("7");
		SevenButton.setBounds(8, 157, 73, 53);
		frame.getContentPane().add(SevenButton);
		list.add(SixButton); 
		
		EightButton = ButtonFactory.GetButton("8");
		EightButton.setBounds(91, 157, 73, 53);
		frame.getContentPane().add(EightButton);
		list.add(EightButton); 
		
		NineButton = ButtonFactory.GetButton("9");
		NineButton.setBounds(174, 157, 73, 53);
		frame.getContentPane().add(NineButton);
		list.add(NineButton); 
		
		MultiplicationButton = ButtonFactory.GetButton("X");
		MultiplicationButton.setBounds(282, 285, 73, 53);
		frame.getContentPane().add(MultiplicationButton);
		list.add(MultiplicationButton); 
		
		MinusButton = ButtonFactory.GetButton("-");
		MinusButton.setBounds(282, 221, 73, 53);
		frame.getContentPane().add(MinusButton);
		list.add(MinusButton); 
		
		PlusButton = ButtonFactory.GetButton("+");
		PlusButton.setBounds(282, 157, 73, 53);
		frame.getContentPane().add(PlusButton);
		list.add(PlusButton); 
		
		EqualsButton = ButtonFactory.GetButton("=");
		EqualsButton.setBounds(282, 349, 73, 53);
		frame.getContentPane().add(EqualsButton);
		list.add(EqualsButton); 
		
		ClearButton = ButtonFactory.GetButton("Clear");
		ClearButton.setText("Clear");
		ClearButton.setBounds(174, 349, 73, 53);
		list.add(ClearButton);
		frame.getContentPane().add(ClearButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 48, 345, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ZeroButton.addActionListener(CalculatorActionListenerManager.GetListener(0));
		OneButton.addActionListener(CalculatorActionListenerManager.GetListener(1));
		TwoButton.addActionListener(CalculatorActionListenerManager.GetListener(2));
		ThreeButton.addActionListener(CalculatorActionListenerManager.GetListener(3));
		FourButton.addActionListener(CalculatorActionListenerManager.GetListener(4));
		FiveButton.addActionListener(CalculatorActionListenerManager.GetListener(5));
		SixButton.addActionListener(CalculatorActionListenerManager.GetListener(6));
		SevenButton.addActionListener(CalculatorActionListenerManager.GetListener(7));
		EightButton.addActionListener(CalculatorActionListenerManager.GetListener(8));
		NineButton.addActionListener(CalculatorActionListenerManager.GetListener(9));
		
		
		
		frame.setVisible(true);
	}
}
