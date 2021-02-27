package Events.CalculatorButtonEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.UnitConverterController;

public class ConvertAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			UnitConverterController.Compute();
		}

}
