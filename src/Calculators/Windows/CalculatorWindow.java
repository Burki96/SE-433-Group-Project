package Calculators.Windows;

import javax.swing.JFrame;

import Calculators.Factories.ButtonFactory;

import javax.swing.JButton;

public class CalculatorWindow {
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

	public CalculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new BaseFrame();
		frame.setBounds(100, 100, 377, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		SevenButton = ButtonFactory.GetButton("7");
		SevenButton.setBounds(8, 157, 73, 53);
		frame.getContentPane().add(SevenButton);
		
		EightButton = ButtonFactory.GetButton("8");
		EightButton.setBounds(91, 157, 73, 53);
		frame.getContentPane().add(EightButton);
		
		NineButton = ButtonFactory.GetButton("9");
		NineButton.setBounds(174, 157, 73, 53);
		frame.getContentPane().add(NineButton);
		
		FiveButton = ButtonFactory.GetButton("5");
		FiveButton.setBounds(91, 221, 73, 53);
		frame.getContentPane().add(FiveButton);
		
		SixButton = ButtonFactory.GetButton("6");
		SixButton.setBounds(174, 221, 73, 53);
		frame.getContentPane().add(SixButton);
		
		FourButton = ButtonFactory.GetButton("4");
		FourButton.setBounds(10, 221, 73, 53);
		frame.getContentPane().add(FourButton);
		
		ZeroButton = ButtonFactory.GetButton("0");
		ZeroButton.setBounds(91, 349, 73, 53);
		frame.getContentPane().add(ZeroButton);
		
		OneButton = ButtonFactory.GetButton("1");
		OneButton.setBounds(10, 285, 73, 53);
		frame.getContentPane().add(OneButton);
		
		TwoButton = ButtonFactory.GetButton("2");
		TwoButton.setBounds(91, 285, 73, 53);
		frame.getContentPane().add(TwoButton);
		
		ThreeButton = ButtonFactory.GetButton("3");
		ThreeButton.setBounds(174, 285, 73, 53);
		frame.getContentPane().add(ThreeButton);
		
		MultiplicationButton = ButtonFactory.GetButton("X");
		MultiplicationButton.setBounds(282, 285, 73, 53);
		frame.getContentPane().add(MultiplicationButton);
		
		MinusButton = ButtonFactory.GetButton("-");
		MinusButton.setBounds(282, 221, 73, 53);
		frame.getContentPane().add(MinusButton);
		
		PlusButton = ButtonFactory.GetButton("+");
		PlusButton.setBounds(282, 157, 73, 53);
		frame.getContentPane().add(PlusButton);
		
		EqualsButton = ButtonFactory.GetButton("=");
		EqualsButton.setBounds(282, 349, 73, 53);
		frame.getContentPane().add(EqualsButton);
		frame.setVisible(true);
	}

}
