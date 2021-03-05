package Calculators.Windows;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Calculators.TempEnums;
import Calculators.TypeEnums;
import Calculators.Factories.ButtonFactory;
import Calculators.Operations.Operation;
import Calculators.Operations.UnitTypes.MassOperation;
import Calculators.Operations.UnitTypes.TemperatureOperation;
import ComboBoxComponents.ConversionComponent;
import ComboBoxListeners.ComboBoxSwitchListener;
import Events.ConverterButtonEvents.ConvertAction;
import Events.ConverterButtonEvents.ConverterMainMenuSwitch;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class UnitConverterWindow {

	private final static TemperatureOperation TempOp = new TemperatureOperation();
	private final static MassOperation MassOp = new MassOperation();
	private final static ComboBoxSwitchListener switchListener = new ComboBoxSwitchListener();
	private final static ConverterMainMenuSwitch MainMenuSwitch = new ConverterMainMenuSwitch();
	private JFrame frame;
	private JTextField InputField;
	private JTextField OutputField;
	private JComboBox<ConversionComponent> UnitSelectionBox;
	private JButton ConvertButton;
	private JLabel InputLabel;
	private JComboBox<ConversionComponent> TypeSelectionBox;
	private JButton MainMenuButton;


	public UnitConverterWindow() 
	{
		
	}
	public void PressConvert() 
	{
		ConvertButton.getActionListeners()[0].actionPerformed(null);
	}
	public String GetText() 
	{
		return this.InputField.getText();
	}
	public void SetOutput(String a)
	{
		this.OutputField.setText(a);
	}
	public Operation GetCurrentSelected() 
	{
		return ((ConversionComponent)this.UnitSelectionBox.getSelectedItem()).GetOperation();
	}
	public void ClearUnitSelection() 
	{
		this.UnitSelectionBox.removeAllItems();
	}
	public void SelectType(TypeEnums t) 
	{
		TypeSelectionBox.getItemAt(t.ordinal()).GetOperation().Execute();
	}
	public void SelectConversionType(TempEnums t) 
	{
		UnitSelectionBox.getItemAt(t.ordinal()).GetOperation().Execute();
	}
	public void AddToUnitSelection(String s, Operation c) 
	{
		UnitSelectionBox.addItem(new ConversionComponent(s, c));
	}
	public void Shutdown() 
	{
		ConvertButton = ButtonFactory.returnButton(this.ConvertButton);
		MainMenuButton = ButtonFactory.returnButton(this.MainMenuButton);
		if(frame != null) {
			frame.setVisible(false);
			frame = null;
		}
		
	}
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(Boolean t) {
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
		
		ConvertButton = ButtonFactory.GetButton("Convert",236, 170, 143, 57);
		ConvertButton.addActionListener(new ConvertAction());
		frame.getContentPane().add(ConvertButton);
		UnitSelectionBox = new JComboBox<ConversionComponent>();
		UnitSelectionBox.setBounds(236, 289, 143, 22);
		frame.getContentPane().add(UnitSelectionBox);


		InputLabel = new JLabel("Input");
		InputLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		InputLabel.setBounds(118, 92, 56, 67);
		frame.getContentPane().add(InputLabel);
		
		JLabel OutputLabel = new JLabel("Output");
		OutputLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		OutputLabel.setBounds(430, 92, 71, 67);
		frame.getContentPane().add(OutputLabel);
		
		TypeSelectionBox = new JComboBox<ConversionComponent>();
		TypeSelectionBox.setBounds(236, 102, 143, 22);
		frame.getContentPane().add(TypeSelectionBox);
		TypeSelectionBox.addItem(new ConversionComponent("Temperature", TempOp));
		TypeSelectionBox.addItem(new ConversionComponent("Mass", MassOp));
		switchListener.SetSelector(TypeSelectionBox);
		
		MainMenuButton = ButtonFactory.GetButton("MainMenu",10, 11, 115, 41);
		MainMenuButton.addActionListener(MainMenuSwitch);
		frame.getContentPane().add(MainMenuButton);
		TypeSelectionBox.addActionListener(switchListener);
		((ConversionComponent)this.TypeSelectionBox.getSelectedItem()).GetOperation().Execute();
		frame.setVisible(t);
	}
}
