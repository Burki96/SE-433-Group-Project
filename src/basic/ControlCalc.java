package basic;


	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCalc {
	
	private ViewCalc vCalc;
	private ModelCalc mCalc;
	
	public ControlCalc(ViewCalc vCalc, ModelCalc mCalc) {
		
		this.vCalc = vCalc;
		this.mCalc = mCalc;
		
		this.vCalc.addListener(new CalcListener());;
		
	}
	
	
	class CalcListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
	
			try {
				String command = e.getActionCommand();
				mCalc.performButtonAction(command);
				vCalc.setDisplayValue(mCalc.getDisplayValue());
				
			} catch(Exception ex) {
				System.out.println(ex);
				ex.printStackTrace();
				vCalc.setDisplayValue("ERROR");
				
			}
			
		}
	
	}	
	
	
	public ViewCalc getView() {
		return this.vCalc;
	}
	
	public ModelCalc getModel() {
		return this.mCalc;
	}
	
	
	

}
