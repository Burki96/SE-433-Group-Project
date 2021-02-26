package Calculators.Windows;


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Calculators.ButtonEnum;
import Calculators.Factories.ButtonFactory;
import Calculators.Factories.CalculatorActionListenerManager;

public class CalculatorWindow {

	//private JFrame frame;
	private ArrayList<JButton> list;
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
	private JButton ClearButton;
	private JTextField textField;
	private JButton DivisionButton;
	private JButton BackSpaceButton;
	private JButton PercentageButton;
	private JButton PeriodButton;
	private JButton PlusMinus;
	private JButton MainMenu;

	/**
	 * Create the application.
	 */
	public CalculatorWindow() {
		this.list = new ArrayList<JButton>();
		//initialize();
	}
	
	public void Shutdown() 
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
		ClearButton = ButtonFactory.returnButton(this.ClearButton);
		BackSpaceButton = ButtonFactory.returnButton(this.BackSpaceButton);
		PeriodButton = ButtonFactory.returnButton(this.PeriodButton);
		PercentageButton = ButtonFactory.returnButton(this.PercentageButton);
		this.textField = null;
		this.list.clear();
		if(frame != null) {
			frame.setVisible(false);
			frame = null;
		}
		
	}
	public JButton GetButton(int i) 
	{
		return list.get(i);
	}
	public void SetText(String tex) 
	{
		this.textField.setText(tex);
	}
	public void PressButton(ButtonEnum name)
	{
		list.get(name.ordinal()).getActionListeners()[0].actionPerformed(null);
	}
	public String GetText() 
	{
		return this.textField.getText();
	}
	private void AssignListeners()
	{
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
		PeriodButton.addActionListener(CalculatorActionListenerManager.GetListener(10));
		PlusButton.addActionListener(CalculatorActionListenerManager.GetListener(11));
		MinusButton.addActionListener(CalculatorActionListenerManager.GetListener(12));
		MultiplicationButton.addActionListener(CalculatorActionListenerManager.GetListener(13));
		DivisionButton.addActionListener(CalculatorActionListenerManager.GetListener(14));
		PercentageButton.addActionListener(CalculatorActionListenerManager.GetListener(15));
		EqualsButton.addActionListener(CalculatorActionListenerManager.GetListener(16));
		ClearButton.addActionListener(CalculatorActionListenerManager.GetListener(17));
		PlusMinus.addActionListener(CalculatorActionListenerManager.GetListener(18));
		BackSpaceButton.addActionListener(CalculatorActionListenerManager.GetListener(19));
		MainMenu.addActionListener(CalculatorActionListenerManager.GetListener(20));
	}
	private void AddAllTolist()
	{
		list.add(ZeroButton);                      //0
		list.add(OneButton);                       //1
		list.add(TwoButton);					   //2
		list.add(ThreeButton);						//3
		list.add(FourButton);						//4
		list.add(FiveButton);						//5
		list.add(SixButton);						//6
		list.add(SevenButton);						//7
		list.add(EightButton);						//8
		list.add(NineButton);						//9
		list.add(PeriodButton);						//10
		list.add(PlusButton);						//11
		list.add(MinusButton);						//12
		list.add(MultiplicationButton);				//13
		list.add(DivisionButton);					//14
		list.add(PercentageButton);					//15
		list.add(EqualsButton);						//16
		list.add(ClearButton);						//17
		list.add(PlusMinus);						//18
		list.add(BackSpaceButton);					//19
		list.add(MainMenu);							//20
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new BaseFrame();
		frame.setBounds(100, 100, 373, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ZeroButton = ButtonFactory.GetButton("0");
		ZeroButton.setBounds(10, 382, 73, 53);
		frame.getContentPane().add(ZeroButton);
		
		
		OneButton = ButtonFactory.GetButton("1");
		OneButton.setBounds(10, 318, 73, 53);
		frame.getContentPane().add(OneButton);
		
		
		TwoButton = ButtonFactory.GetButton("2");
		TwoButton.setBounds(91, 318, 73, 53);
		frame.getContentPane().add(TwoButton);

		
		ThreeButton = ButtonFactory.GetButton("3");
		ThreeButton.setBounds(174, 318, 73, 53);
		frame.getContentPane().add(ThreeButton);

		
		FourButton = ButtonFactory.GetButton("4");
		FourButton.setBounds(10, 254, 73, 53);
		frame.getContentPane().add(FourButton);

		
		FiveButton = ButtonFactory.GetButton("5");
		FiveButton.setBounds(91, 254, 73, 53);
		frame.getContentPane().add(FiveButton);

		
		SixButton = ButtonFactory.GetButton("6");
		SixButton.setBounds(174, 254, 73, 53);
		frame.getContentPane().add(SixButton);
                        //6
		
		SevenButton = ButtonFactory.GetButton("7");
		SevenButton.setBounds(10, 190, 73, 53);
		frame.getContentPane().add(SevenButton);
						//7
		
		EightButton = ButtonFactory.GetButton("8");
		EightButton.setBounds(91, 190, 73, 53);
		frame.getContentPane().add(EightButton);
						//8
		
		NineButton = ButtonFactory.GetButton("9");
		NineButton.setBounds(174, 190, 73, 53);
		frame.getContentPane().add(NineButton);
						//9
		
		PeriodButton = ButtonFactory.GetButton(".");
		PeriodButton.setBounds(93, 382, 73, 53);
		frame.getContentPane().add(PeriodButton);
					//10
		
		
		PlusButton = ButtonFactory.GetButton("+");
		PlusButton.setBounds(257, 190, 73, 53);
		frame.getContentPane().add(PlusButton); 	//11

		

		MinusButton = ButtonFactory.GetButton("-");
		MinusButton.setBounds(257, 254, 73, 53);	//12
		frame.getContentPane().add(MinusButton);

		
		MultiplicationButton = ButtonFactory.GetButton("X");
		MultiplicationButton.setBounds(257, 318, 73, 53);
		frame.getContentPane().add(MultiplicationButton);
				//13
		
		DivisionButton = ButtonFactory.GetButton("/");
		DivisionButton.setText("/");
		DivisionButton.setBounds(257, 126, 73, 53);			//14
		frame.getContentPane().add(DivisionButton);
		
		PercentageButton = ButtonFactory.GetButton("%");
		PercentageButton.setBounds(174, 126, 73, 53);	//15
		frame.getContentPane().add(PercentageButton);
		
		EqualsButton = ButtonFactory.GetButton("=");
		EqualsButton.setBounds(257, 382, 73, 53);
		frame.getContentPane().add(EqualsButton);
					//16
		
		ClearButton = ButtonFactory.GetButton("Clear");
		ClearButton.setText("Clear");				
		ClearButton.setBounds(91, 126, 73, 53);			//17
		frame.getContentPane().add(ClearButton);
		
		PlusMinus = ButtonFactory.GetButton("+/-");
		PlusMinus.setBounds(174, 382, 73, 53);			//18
		frame.getContentPane().add(PlusMinus);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 62, 337, 53);
		textField.setText("0");
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		BackSpaceButton = ButtonFactory.GetButton("Backspace");
		BackSpaceButton.setText("<--");
		BackSpaceButton.setBounds(10, 126, 73, 53);	//19
		frame.getContentPane().add(BackSpaceButton);
		
		MainMenu = ButtonFactory.GetButton("MainMenu");
		MainMenu.setText("Back");
		MainMenu.setBounds(10, 11, 73, 41);
		frame.getContentPane().add(MainMenu);
		this.AddAllTolist();
		this.AssignListeners();

		frame.setVisible(true);
	}

}
