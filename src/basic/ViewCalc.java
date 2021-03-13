package basic;


import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import basic.ui.ButtonFactory;





public class ViewCalc extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JTextField displayValue;
	private ArrayList<JButton> bList=new ArrayList<JButton>();
	private ArrayList<JMenuItem> menuItems=new ArrayList<JMenuItem>();
	private JMenu mainMenuOptions;
	private static int bWidth = 75;
	private static int bHeight = 55;
	private static int xOffset = 85;
	private static int yOffSet = 65;
	private static int xInit = 10;
	private static int yInit = 100;
	//private static int numRows = 5;
	private static int numColumns = 4;

	
	public void initialize(Main.Tool tool) {
		this.setBounds(100, 100, 375, 485);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		initMenu(tool);
		switch (tool) {
			case CONVERTER:
				initConverter();
				break;
			default:
				initCalc();
				break; 
		}
		
	}

	private void initConverter() {
		initDisplayValue();
		initControlPanel();
		
	}

	private void initCalc() {
		initDisplayValue();
		initControlPanel();
		
	}

	private void initControlPanel() {
		ArrayList<String> buttonLabels = new ArrayList<String>( 
	            Arrays.asList("C","<","%","/",
	            		      "7","8","9","*",
	            		      "4","5","6","-",
	            		      "1","2","3","+",
	            		      "+/-","0",".","="
	                          )); 
		JButton auxB;
		String btLabel;
		int xPos;
		int yPos;
		for (int i = 0; i < buttonLabels.size(); i++) { 		      
			btLabel = buttonLabels.get(i); 
			xPos = xInit + ((i%numColumns)*xOffset);
			yPos = yInit + ((i/numColumns)*yOffSet);
	     	auxB = ButtonFactory.GetButton(btLabel,xPos,yPos, bWidth, bHeight);
	     	bList.add(auxB);
	     	this.getContentPane().add(auxB);
		}
		
	}

	private void initDisplayValue() {
			
		displayValue = new JTextField();
		displayValue.setEditable(false);
		displayValue.setBounds(xInit, 20, 330, bHeight);
		displayValue.setText("0");
		displayValue.setColumns(15);
		displayValue.setHorizontalAlignment(JTextField.RIGHT);
		displayValue.setFont(new Font("SansSerif", Font.PLAIN, 20));
		this.getContentPane().add(displayValue);
		
	}

	private void initMenu(Main.Tool c) {
		JMenuBar mainDropMenu = new JMenuBar();
		setJMenuBar(mainDropMenu);

		mainMenuOptions = new JMenu("Menu");
		
		mainDropMenu.add(mainMenuOptions);

		if (c.equals(Main.Tool.CALC)) {
			JMenuItem converterMOption = new JMenuItem("Converter");
			mainMenuOptions.add(converterMOption);
			menuItems.add(converterMOption);
		} else {
			JMenuItem calcMOption = new JMenuItem("Calculator");
			mainMenuOptions.add(calcMOption);
			menuItems.add(calcMOption);
		}

		JMenuItem exitMOption = new JMenuItem("Exit");
		mainMenuOptions.add(exitMOption);
		menuItems.add(exitMOption);
		
	}

	public void setDisplayValue(String newValue) {
		displayValue.setText(newValue);
	}
	
	public void addListener(ActionListener acListener) {
		for (JButton bt : bList) {
			bt.addActionListener(acListener);
		}
		
		for (JMenuItem mi : menuItems) {
			mi.addActionListener(acListener);
		}
		
		
	}

}
