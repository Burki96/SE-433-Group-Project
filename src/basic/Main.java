package basic;

import javax.swing.JFrame;

public class Main {
	public enum Tool {CALC, CONVERTER}

	
	public static void main(String[] args) {
		
		ViewCalc v = new ViewCalc();
		ModelCalc m = new ModelCalc();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.initialize(Tool.CALC);
		ControlCalc c = new ControlCalc(v, m);
		
		
		
		v.setVisible(true);
	}
}
;