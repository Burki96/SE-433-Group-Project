package Calculators.Windows;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ComboBoxComponents.ConversionComponent;

import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;

public class UnitConverterWindow {

	private JFrame frame;
	private JTextField InputField;
	private JTextField OutputField;
	private JComboBox<ConversionComponent> comboBox;
	private JButton ConvertButton;
	private JLabel InputLabel;


	public UnitConverterWindow() {
		//initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new BaseFrame();
		frame.setBounds(100, 100, 652, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		InputField = new JTextField();
		InputField.setHorizontalAlignment(SwingConstants.RIGHT);
		InputField.setText("0");
		InputField.setBounds(83, 170, 143, 49);
		frame.getContentPane().add(InputField);
		InputField.setColumns(10);
		
		OutputField = new JTextField();
		OutputField.setBackground(Color.WHITE);
		OutputField.setEditable(false);
		OutputField.setText("0");
		OutputField.setHorizontalAlignment(SwingConstants.RIGHT);
		OutputField.setColumns(10);
		OutputField.setBounds(389, 170, 143, 49);
		frame.getContentPane().add(OutputField);
		
		ConvertButton = new JButton("Convert");
		ConvertButton.setBounds(236, 170, 143, 57);
		frame.getContentPane().add(ConvertButton);
		comboBox = new JComboBox<ConversionComponent>();
		comboBox.setBounds(236, 254, 143, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem(new ConversionComponent("KG to G", null));
		comboBox.addItem(new ConversionComponent("G to KG", null));
		
		InputLabel = new JLabel("Input");
		InputLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		InputLabel.setBounds(118, 92, 56, 67);
		frame.getContentPane().add(InputLabel);
		
		JLabel OutputLabel = new JLabel("Output");
		OutputLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		OutputLabel.setBounds(430, 92, 71, 67);
		frame.getContentPane().add(OutputLabel);
		frame.setVisible(true);
	}
}
