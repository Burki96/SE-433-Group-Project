package Calculators.Windows;

import javax.swing.JFrame;

import Calculators.Factories.ButtonFactory;
import Calculators.Factories.CalculatorActionListenerManager;

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
	private double FirstNumber;
	private double SecondNumber;
	private double Result;
	private String opString;
	private String anString;
	private JButton DivisionButton;
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
		DivisionButton = ButtonFactory.returnButton(this.DivisionButton);
		MinusButton = ButtonFactory.returnButton(this.MinusButton);
		PlusButton = ButtonFactory.returnButton(this.PlusButton);
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
	public static void DoArthimeticAction(String c)
	{
		GetInstance().privDoArthimeticAction(c);
	}
	public static void Compute()
	{
		GetInstance().privCompute();
	}
	private void privCompute() 
	{
		this.SecondNumber = Double.parseDouble(textField.getText());
		if(this.opString == "+") 
		{
			this.Result = FirstNumber + SecondNumber;
			this.anString = String.format("%.2f", Result);
			this.textField.setText(this.anString);
		}
	}
	private void privDoArthimeticAction(String c) 
	{
		this.FirstNumber = Double.parseDouble(textField.getText());
		this.textField.setText("");
		this.opString = c;
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
		ZeroButton.setBounds(91, 382, 73, 53);
		frame.getContentPane().add(ZeroButton);
		list.add(ZeroButton);                      //0
		
		OneButton = ButtonFactory.GetButton("1");
		OneButton.setBounds(10, 318, 73, 53);
		frame.getContentPane().add(OneButton);
		list.add(OneButton);                      //1
		
		TwoButton = ButtonFactory.GetButton("2");
		TwoButton.setBounds(91, 318, 73, 53);
		frame.getContentPane().add(TwoButton);
		list.add(TwoButton);
		
		ThreeButton = ButtonFactory.GetButton("3");
		ThreeButton.setBounds(174, 318, 73, 53);
		frame.getContentPane().add(ThreeButton);
		list.add(ThreeButton);
		
		FourButton = ButtonFactory.GetButton("4");
		FourButton.setBounds(10, 254, 73, 53);
		frame.getContentPane().add(FourButton);
		list.add(FourButton);
		
		FiveButton = ButtonFactory.GetButton("5");
		FiveButton.setBounds(91, 254, 73, 53);
		frame.getContentPane().add(FiveButton);
		list.add(FiveButton);
		
		SixButton = ButtonFactory.GetButton("6");
		SixButton.setBounds(174, 254, 73, 53);
		frame.getContentPane().add(SixButton);
		list.add(SixButton);                         //6
		
		SevenButton = ButtonFactory.GetButton("7");
		SevenButton.setBounds(10, 190, 73, 53);
		frame.getContentPane().add(SevenButton);
		list.add(SixButton); 
		
		EightButton = ButtonFactory.GetButton("8");
		EightButton.setBounds(91, 190, 73, 53);
		frame.getContentPane().add(EightButton);
		list.add(EightButton); 
		
		NineButton = ButtonFactory.GetButton("9");
		NineButton.setBounds(174, 190, 73, 53);
		frame.getContentPane().add(NineButton);
		list.add(NineButton); 
		
		MultiplicationButton = ButtonFactory.GetButton("X");
		MultiplicationButton.setBounds(282, 318, 73, 53);
		frame.getContentPane().add(MultiplicationButton);
		list.add(MultiplicationButton); 
		
		MinusButton = ButtonFactory.GetButton("-");
		MinusButton.setBounds(282, 254, 73, 53);
		frame.getContentPane().add(MinusButton);
		list.add(MinusButton); 
		
		PlusButton = ButtonFactory.GetButton("+");
		PlusButton.setBounds(282, 190, 73, 53);
		frame.getContentPane().add(PlusButton);
		list.add(PlusButton); 
		
		EqualsButton = ButtonFactory.GetButton("=");
		EqualsButton.setBounds(282, 382, 73, 53);
		frame.getContentPane().add(EqualsButton);
		list.add(EqualsButton); 
		
		ClearButton = ButtonFactory.GetButton("Clear");
		ClearButton.setText("Clear");
		ClearButton.setBounds(174, 382, 73, 53);
		list.add(ClearButton);
		frame.getContentPane().add(ClearButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 48, 345, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		DivisionButton = ButtonFactory.GetButton("%");
		DivisionButton.setText("%");
		DivisionButton.setBounds(282, 126, 73, 53);
		frame.getContentPane().add(DivisionButton);
		
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
		PlusButton.addActionListener(CalculatorActionListenerManager.GetListener(10));
		MinusButton.addActionListener(CalculatorActionListenerManager.GetListener(11));
		MultiplicationButton.addActionListener(CalculatorActionListenerManager.GetListener(12));
		DivisionButton.addActionListener(CalculatorActionListenerManager.GetListener(13));
		EqualsButton.addActionListener(CalculatorActionListenerManager.GetListener(14));
		
		frame.setVisible(true);
	}
}
