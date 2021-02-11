package Calculators;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainMenu {

	private JFrame mainWindowFrame;
	private JTextField textField;
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainWindowFrame = new JFrame();
		mainWindowFrame.setTitle("Calculator");
		mainWindowFrame.setBounds(100, 100, 594, 460);
		mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindowFrame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 558, 49);
		mainWindowFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Button7 = new JButton("7");
		Button7.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button7.setBounds(28, 96, 67, 49);
		mainWindowFrame.getContentPane().add(Button7);
		
		JButton Button8 = new JButton("8");
		Button8.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8.setBounds(105, 96, 67, 49);
		mainWindowFrame.getContentPane().add(Button8);
		
		JButton Button8_1 = new JButton("9");
		Button8_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_1.setBounds(182, 96, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_1);
		
		JButton Button8_2 = new JButton("6");
		Button8_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_2.setBounds(28, 156, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_2);
		
		JButton Button8_3 = new JButton("5");
		Button8_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_3.setBounds(105, 156, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_3);
		
		JButton Button8_4 = new JButton("4");
		Button8_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_4.setBounds(182, 156, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_4);
		
		JButton Button8_5 = new JButton("1");
		Button8_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_5.setBounds(28, 216, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_5);
		
		JButton Button8_6 = new JButton("2");
		Button8_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_6.setBounds(105, 216, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_6);
		
		JButton Button8_7 = new JButton("3");
		Button8_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_7.setBounds(182, 216, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_7);
		
		JButton Button8_6_1 = new JButton("0");
		Button8_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button8_6_1.setBounds(105, 276, 67, 49);
		mainWindowFrame.getContentPane().add(Button8_6_1);
		mainWindowFrame.setVisible(true);
	}

}
