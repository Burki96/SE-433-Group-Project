package Calculators;

import java.awt.EventQueue;
public class Calculator {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//test window = new test();
					CalculatorSingleton.Start();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});// TODO Auto-generated method stub
		
	}

}
